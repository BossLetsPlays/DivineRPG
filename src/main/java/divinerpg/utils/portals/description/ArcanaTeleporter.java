package divinerpg.utils.portals.description;

import divinerpg.dimensions.arcana.ArcanaRooms;
import divinerpg.dimensions.arcana.mazegen.ArcanaMazeGenerator;
import divinerpg.dimensions.arcana.mazegen.Cell;
import divinerpg.registry.BlockRegistry;
import divinerpg.registry.DimensionRegistry;
import divinerpg.registry.StructureRegistry;
import divinerpg.structure.arcana.ArcanaStructureHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.ITeleporter;

import javax.annotation.Nullable;
import java.util.Random;

public class ArcanaTeleporter implements ITeleporter {

    public static final int PORTAL_SEARCH_CHUNK_RADIUS = 4;

    protected WorldServer world;
    protected Random random = new Random();

    public ArcanaTeleporter(WorldServer var1) {
        this.world = var1;
    }

    public void placeInPortal(Entity entity, float rotationYaw) {
        int chunkX;
        int chunkZ;

        if (this.world.provider.getDimensionType().getId() == DimensionRegistry.arcanaDimension.getId()) {
            chunkX = (MathHelper.floor(entity.posX) & ~0xf) / 16;
            chunkZ = (MathHelper.floor(entity.posZ) & ~0xf) / 16;
            if (!(this.placeInExistingPortal(entity, rotationYaw))) {
                this.makePortalRoom(chunkX, chunkZ);
                this.placeInExistingPortal(entity, rotationYaw);
            }
        }
        else {
            //Adjust player position for +8 anti-cascading offset first
            chunkX = ((MathHelper.floor(entity.posX) - 8) & ~0xf) / 16;
            chunkZ = ((MathHelper.floor(entity.posZ) - 8) & ~0xf) / 16;

            BlockPos pos = locateOverworldPortal(this.world, chunkX, chunkZ);
            if(pos == null) {
                BlockPos spawnPoint = null;
                if(entity instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer)entity;
                    spawnPoint = player.getBedLocation(0);
                }
                if(spawnPoint == null) {
                    spawnPoint = this.world.getTopSolidOrLiquidBlock(this.world.getSpawnPoint());
                }
                entity.moveToBlockPosAndAngles(spawnPoint, entity.rotationYaw, entity.rotationPitch);
            }
            else {
                entity.moveToBlockPosAndAngles(pos, entity.rotationYaw, entity.rotationPitch);
            }
        }
    }

    private BlockPos locateOverworldPortal(World world, int chunkX, int chunkZ) {
        //Attempt to locate portal within chunks, going outwards
        BlockPos pos = null;
        for (int radius = 0; radius <= PORTAL_SEARCH_CHUNK_RADIUS; radius++) {
            pos = locatePortalByRadius(world, chunkX, chunkZ, radius);
            if (pos != null) {
                break;
            }
        }
        return pos;
    }

    @Nullable
    private BlockPos locatePortalByRadius(World world, int chunkX, int chunkZ, int radius) {
        //Check all chunks a <radius> distance from chunkX
        //Yeah it's messy but it's the efficient enough

        for(int currentChunkX = chunkX - radius; currentChunkX <= chunkX + radius; currentChunkX++) {
            BlockPos result = locatePortalInChunk(world, currentChunkX, chunkZ - radius);
            if(result != null) {
                return result;
            }

            result = locatePortalInChunk(world, currentChunkX, chunkZ + radius);
            if(result != null) {
                return result;
            }
        }

        for(int currentChunkZ = chunkZ - radius + 1; currentChunkZ <= chunkZ + radius - 1; currentChunkZ++) {
            BlockPos result = locatePortalInChunk(world, chunkX - radius, currentChunkZ);
            if(result != null) {
                return result;
            }

            result = locatePortalInChunk(world, chunkX + radius, currentChunkZ);
            if(result != null) {
                return result;
            }
        }

        return null;
    }

    @Nullable
    private BlockPos locatePortalInChunk(World world, int chunkX, int chunkZ) {
        BlockPos.MutableBlockPos searchPos = new BlockPos.MutableBlockPos();
        int baseX = chunkX * 16;
        int baseZ = chunkZ * 16;
        for(int y = 0; y < 256; y++) {
            for(int x = 0; x < 16; x++) {
                for(int z = 0; z < 16; z++) {
                    searchPos.setPos(baseX + x, y, baseZ + z);
                    if(world.getBlockState(searchPos).getBlock() == BlockRegistry.arcanaPortal) {
                        return searchPos;
                    }
                }
            }
        }
        return null;
    }

    public boolean placeInExistingPortal(Entity entity, float rotationYaw) {
        if (this.world.provider.getDimensionType().getId() == DimensionRegistry.arcanaDimension.getId()) {
            //Convert player location to chunk
            int chunkX = (MathHelper.floor(entity.posX) & ~0xf) / 16;
            int chunkZ = (MathHelper.floor(entity.posZ) & ~0xf) / 16;

            //Coordinates where portal frame should be. Accounts for constant +8 offset in chunk generator to prevent cascading
            int portalLocationX = (chunkX * 16) + 6 + 8;
            int portalLocationY = 9;
            int portalLocationZ = (chunkZ * 16) + 5 + 8;

            // Find existing portal, first check the room corresponding to the chunk as this covers the most likely cases
            if (this.world.getBlockState(new BlockPos(portalLocationX, portalLocationY, portalLocationZ)).getBlock() == BlockRegistry.arcanaHardPortalFrame) {
                entity.setLocationAndAngles(portalLocationX + 1.5D, portalLocationY, portalLocationZ + 2.5D, entity.rotationYaw, 0.0F);
                entity.motionX = entity.motionY = entity.motionZ = 0.0D;
                return true;
            }
            else {
                //Search in 15x15 chunk region centered around portal
                BlockPos.MutableBlockPos searchPos = new BlockPos.MutableBlockPos();
                for(int searchX = portalLocationX - (PORTAL_SEARCH_CHUNK_RADIUS * 16); searchX < portalLocationX + (PORTAL_SEARCH_CHUNK_RADIUS * 16); searchX += 16) {
                    for (int searchZ = portalLocationZ - (PORTAL_SEARCH_CHUNK_RADIUS * 16); searchZ < portalLocationZ + (PORTAL_SEARCH_CHUNK_RADIUS * 16); searchZ += 16) {
                        searchPos.setPos(searchX, portalLocationY, searchZ);
                        if (this.world.getBlockState(searchPos).getBlock() == BlockRegistry.arcanaHardPortalFrame) {
                            entity.setLocationAndAngles(searchX + 1.5D, portalLocationY, searchZ + 2.5D, entity.rotationYaw, 0.0F);
                            entity.motionX = entity.motionY = entity.motionZ = 0.0D;
                            return true;
                        }
                    }
                }
            }

            //No portal found, return false
            return false;
        }

        return false;
    }

    public void makePortalRoom(int chunkX, int chunkZ) {
        Cell cell = ArcanaMazeGenerator.obtainMazePiece(chunkX, chunkZ, this.world.getSeed());
        ArcanaStructureHandler portalRoom = ArcanaRooms.getPortalRoomByType(cell.getPieceType());
        portalRoom.generateWithRotation(this.world, this.random, new BlockPos(chunkX * 16 + 8, 8, chunkZ * 16 + 8), cell.getRotation());
    }

    public void placeEntity(World world, Entity entity, float yaw) {
        if (entity instanceof EntityPlayerMP) {
            this.placeInPortal(entity, yaw);
        } else {
            this.placeInExistingPortal(entity, yaw);
        }
    }
}