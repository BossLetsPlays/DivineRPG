package naturix.divinerpg.objects.blocks;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.registry.ModBlocks;
import naturix.divinerpg.registry.ModItems;
import naturix.divinerpg.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockModStairs extends BlockStairs implements IHasModel {

    public BlockModStairs(Block stair, String name) {
        super(stair.getDefaultState());
        this.useNeighborBrightness = true;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(DivineRPG.BlocksTab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        DivineRPG.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}