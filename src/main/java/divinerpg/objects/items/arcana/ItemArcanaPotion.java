package divinerpg.objects.items.arcana;

import divinerpg.api.DivineAPI;
import divinerpg.api.arcana.IArcana;
import divinerpg.objects.items.base.ItemMod;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.utils.LocalizeUtils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemArcanaPotion extends ItemMod {

    protected int amountToAdd;

    public ItemArcanaPotion(String name, int amountToAdd) {
        super(name, DivineRPGTabs.UTILITY);
        this.amountToAdd = amountToAdd;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn) {
        list.add(LocalizeUtils.arcanaRegen(amountToAdd));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
        EntityPlayer player = (EntityPlayer) entityLiving;
        if (player != null) {
            if (!player.capabilities.isCreativeMode) {
                stack.shrink(1);
            }
            IArcana arcana = DivineAPI.getArcana(player);
            arcana.fill(player, amountToAdd);
        }

        return stack;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 10;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

        player.setActiveHand(hand);

        IArcana arcana = DivineAPI.getArcana(player);

        EnumActionResult result = arcana.getArcana() < arcana.getMaxArcana() ? EnumActionResult.SUCCESS :
                EnumActionResult.FAIL;

        return new ActionResult<>(result, player.getHeldItem(hand));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}