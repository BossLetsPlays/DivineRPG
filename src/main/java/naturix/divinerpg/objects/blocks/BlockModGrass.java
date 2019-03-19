package naturix.divinerpg.objects.blocks;

import java.util.Random;

import naturix.divinerpg.utils.material.EnumBlockType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class BlockModGrass extends BlockMod {
    protected BlockMod dirt;
    protected String dirtName;

    public BlockModGrass(BlockMod dirt, String name, String dirtName, float hardness) {
        super(EnumBlockType.GRASS, name, hardness);
        this.dirt = dirt;
        this.dirtName = dirtName;
        setTickRandomly(true);
        setHarvestLevel("shovel", 3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(dirt);
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        if (!world.isRemote) {
            if (!world.isAreaLoaded(pos, 3))
                return;
            if (world.getLightFromNeighbors(pos.up()) < 4 && world.getBlockState(pos.up()).getLightOpacity(world, pos.up()) > 2) {
                world.setBlockState(pos, dirt.getDefaultState());
            } else {
                for (int l = 0; l < 4; ++l) {
                    BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                    if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !world.isBlockLoaded(blockpos)) {
                        return;
                    }

                    IBlockState iblockstate = world.getBlockState(blockpos.up());
                    IBlockState iblockstate1 = world.getBlockState(blockpos);

                    if (iblockstate1.getBlock() == dirt && world.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(world, pos.up()) <= 2) {
                        world.setBlockState(blockpos, this.getDefaultState());
                    }
                }
            }
        }
    }

    public String getDirtName() {
        return dirtName;
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
        //if (this == ArcanaBlocks.arcanaGrass && plantable instanceof ItemArcanaSeeds)
        //    return true;
        return false;
    }
}