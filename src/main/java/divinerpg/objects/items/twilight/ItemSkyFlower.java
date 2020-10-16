package divinerpg.objects.items.twilight;

import divinerpg.objects.items.base.ItemFastFood;
import divinerpg.utils.LocalizeUtils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSkyFlower extends ItemFastFood {
    public ItemSkyFlower(String name) {
        super(1, 1, false, name);
        setAlwaysEdible();
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack item, World world, EntityLivingBase player) {
        super.onItemUseFinish(item, world, player);
        player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 600, 0, true, false));
        player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 0, true, false));
        return item;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn) {
        super.addInformation(item, worldIn, list, flagIn);
        list.add(LocalizeUtils.i18n("tooltip.sky_flower.breath"));
    }
}