package divinerpg.structure.vethea.hive;

import divinerpg.DivineRPG;
import divinerpg.structure.StructureRarities;
import divinerpg.structure.base.DivineFixedAltitudeStructure;
import divinerpg.structure.base.DivineLargeStructure;
import divinerpg.utils.WorldGenUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureStart;

public class Hive extends DivineFixedAltitudeStructure {

    public Hive(World world, int spawnAltitude) {
        super(world, "Hive", new ResourceLocation(DivineRPG.MODID, "vethea/layer2/hive"), StructureRarities.HIVE_RARITY, spawnAltitude);
    }

    @Override
    protected StructureStart getStructureStart(int chunkX, int chunkZ) {
        WorldGenUtils.seedRandomWithWorldAndChunks(this.rand, this.world, chunkX, chunkZ);
        Rotation rotation = WorldGenUtils.getRandomRotation(this.rand);
        return new HiveStart(folder, manager, rotation, chunkX, spawnAltitude, chunkZ);
    }
}
