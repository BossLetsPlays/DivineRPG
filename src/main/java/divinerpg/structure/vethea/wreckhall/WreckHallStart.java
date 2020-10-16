package divinerpg.structure.vethea.wreckhall;

import divinerpg.structure.base.DivineStructureStart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.structure.StructureComponentTemplate;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class WreckHallStart extends DivineStructureStart {

    public WreckHallStart() {
    }

    public WreckHallStart(ResourceLocation location, TemplateManager manager, Rotation rotation, int chunkX, int y, int chunkZ) {
        super(location, manager, rotation, chunkX, y, chunkZ, 2, 3);
    }

    @Override
    protected StructureComponentTemplate getComponent(TemplateManager manager, ResourceLocation location, Rotation rotation, BlockPos pos) {
        return new WreckHallComponent(manager, location, rotation, pos);
    }
}
