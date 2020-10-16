package divinerpg.structure.vethea.quadroticpost;

import divinerpg.DivineRPG;
import divinerpg.registry.LootTableRegistry;
import divinerpg.structure.base.DivineStructureComponentTemplate;
import divinerpg.utils.WorldGenUtils;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.Random;

public class QuadroticPostComponent extends DivineStructureComponentTemplate {

    public QuadroticPostComponent() {
        this.placeSettings = new PlacementSettings().setIgnoreEntities(true).setReplacedBlock(Blocks.AIR);
    }

    public QuadroticPostComponent(TemplateManager manager, ResourceLocation location, Rotation rotation, BlockPos start) {
        super(manager, location, start, new PlacementSettings().setReplacedBlock(Blocks.AIR).setRotation(rotation));
    }

    @Override
    protected void handleDataMarker(String function, BlockPos pos, World worldIn, Random rand, StructureBoundingBox sbb) {
        switch (function) {
            case "QuadroticPostLoot":
                WorldGenUtils.populateLootChestBelow(worldIn, pos, rand, LootTableRegistry.QUADROTIC_POST_LOOT);
                break;
            default:
                DivineRPG.logger.warn("Unexpected data marker: " + function + " in a structure with class name " + this.getClass().toString() + ", please report this.");
                break;
        }
    }
}
