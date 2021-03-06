package divinerpg.blocks.base;

import net.minecraft.block.*;
import net.minecraft.block.material.*;

public class BlockMod extends Block {

    public BlockMod(String name, float hardness) {
        super(Block.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(hardness, 3.0F).sound(SoundType.STONE));
        setRegistryName(name);
    }

    public BlockMod(String name, Block.Properties properties) {
        super(properties);
        setRegistryName(name);
    }

    public BlockMod(String name, float hardness, float resistance) {
        super(Block.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(hardness, resistance).sound(SoundType.STONE));
        setRegistryName(name);
    }

    public BlockMod(String name, float hardness, float resistance, Material material) {
        super(Block.Properties.of(material, MaterialColor.STONE).requiresCorrectToolForDrops().strength(hardness, resistance).sound(SoundType.STONE));
        setRegistryName(name);
    }

    public BlockMod(String name, float hardness, float resistance, Material material, SoundType sound) {
        super(Block.Properties.of(material, MaterialColor.STONE).requiresCorrectToolForDrops().strength(hardness, resistance).sound(sound));
        setRegistryName(name);
    }
}
