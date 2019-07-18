package naturix.divinerpg.objects.items.vethea;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.capabilities.ArcanaProvider;
import naturix.divinerpg.capabilities.IArcana;
import naturix.divinerpg.objects.entities.entity.projectiles.EntityBouncingProjectile;
import naturix.divinerpg.objects.entities.entity.projectiles.EntityEvernightProjectile;
import naturix.divinerpg.objects.items.base.ItemMod;
import naturix.divinerpg.registry.DivineRPGTabs;
import naturix.divinerpg.registry.ModItems;
import naturix.divinerpg.registry.ModSounds;
import naturix.divinerpg.utils.TooltipHelper;
import naturix.divinerpg.utils.TooltipLocalizer;
import naturix.divinerpg.utils.Utils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemStaff extends ItemMod {
	
	public static List<Item> staffList = new ArrayList<Item>();
	
	protected int damage;
	protected int cost;

	public ItemStaff(int dam, int cos, String name) {
		super(name);
		this.maxStackSize = 1;
		this.damage = dam;
		this.cost = cos;
		this.setCreativeTab(DivineRPGTabs.vethea);
		this.setFull3D();
		staffList.add(this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn) {
	    	list.add(TooltipLocalizer.arcanaDam(damage));
		list.add(TooltipHelper.getInfoText("tooltip.staff.bounce"));
		if(stack.getItem() == ModItems.evernight) list.add(TooltipHelper.getInfoText("tooltip.staff.evernight.damage"));
		list.add(TooltipLocalizer.arcanaConsumed(cost));
		list.add(TooltipLocalizer.vethean());
	}

	 @Override
	 public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
	       	ItemStack par1 = new ItemStack(player.getHeldItem(hand).getItem());
	       	IArcana arcana = player.getCapability(ArcanaProvider.ARCANA_CAP, null);
    		if (!world.isRemote && arcana.getArcana() >= cost) {
			 arcana.consume(cost);
			if(par1.getItem() == ModItems.evernight){
				player.attackEntityFrom(Utils.arcanaSource, 20);
				EntityThrowable projectile = new EntityEvernightProjectile(world, player, this.damage);
				projectile.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 0.4F);
	            world.spawnEntity(projectile);
			} else { 
				EntityThrowable projectile = new EntityBouncingProjectile(world, player, this.damage);
				projectile.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 0.4F);
	            world.spawnEntity(projectile);
			}
			world.playSound(player, player.getPosition(), ModSounds.STAFF, SoundCategory.PLAYERS, 1, 1);
		}
	       	return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	        }
}