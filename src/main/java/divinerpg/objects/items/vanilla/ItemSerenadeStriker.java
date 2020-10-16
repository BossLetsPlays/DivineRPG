package divinerpg.objects.items.vanilla;

import divinerpg.objects.items.base.ItemMod;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.utils.LocalizeUtils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSerenadeStriker extends ItemMod {

    public ItemSerenadeStriker(String name) {
        super(name);
        this.setCreativeTab(DivineRPGTabs.RANGED_WEAPONS);
        setMaxDamage(100);
        setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(LocalizeUtils.i18n("tooltip.serenade_striker"));
        tooltip.add(LocalizeUtils.usesRemaining(stack.getMaxDamage() - stack.getItemDamage()));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        Vec3d pos = new Vec3d(player.posX, player.posY + player.getEyeHeight(), player.posZ);
        Vec3d look = player.getLook(1);
        Vec3d vec32 = pos.addVector(look.x * 100, look.y * 100, look.z * 100);
        RayTraceResult result = player.world.rayTraceBlocks(pos, vec32, false, false, true);

        double i = result.getBlockPos().getX();
        double j = result.getBlockPos().getY();
        double k = result.getBlockPos().getZ();

        if (world.getBlockState(result.getBlockPos()) != null) {
            world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
            world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
            world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
            if (!player.capabilities.isCreativeMode) {
                stack.damageItem(1, player);
            }
        }

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
    }
}