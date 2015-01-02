package net.divinerpg.utils.entities;

import net.divinerpg.entities.vanilla.EntityAncientEntity;
import net.divinerpg.entities.vanilla.EntityAridWarrior;
import net.divinerpg.entities.vanilla.EntityAyeracoBlue;
import net.divinerpg.entities.vanilla.EntityAyeracoGreen;
import net.divinerpg.entities.vanilla.EntityAyeracoPurple;
import net.divinerpg.entities.vanilla.EntityAyeracoRed;
import net.divinerpg.entities.vanilla.EntityAyeracoYellow;
import net.divinerpg.entities.vanilla.EntityBabyCrab;
import net.divinerpg.entities.vanilla.EntityCaveCrawler;
import net.divinerpg.entities.vanilla.EntityCaveclops;
import net.divinerpg.entities.vanilla.EntityCrab;
import net.divinerpg.entities.vanilla.EntityCyclops;
import net.divinerpg.entities.vanilla.EntityDesertCrawler;
import net.divinerpg.entities.vanilla.EntityEnderSpider;
import net.divinerpg.entities.vanilla.EntityEnderTriplets;
import net.divinerpg.entities.vanilla.EntityEnderWatcher;
import net.divinerpg.entities.vanilla.EntityEnthralledDramcryx;
import net.divinerpg.entities.vanilla.EntityFrost;
import net.divinerpg.entities.vanilla.EntityGlacon;
import net.divinerpg.entities.vanilla.EntityHellPig;
import net.divinerpg.entities.vanilla.EntityHellSpider;
import net.divinerpg.entities.vanilla.EntityJackOMan;
import net.divinerpg.entities.vanilla.EntityJungleBat;
import net.divinerpg.entities.vanilla.EntityJungleDramcryx;
import net.divinerpg.entities.vanilla.EntityJungleSpider;
import net.divinerpg.entities.vanilla.EntityKingCrab;
import net.divinerpg.entities.vanilla.EntityKingOfScorchers;
import net.divinerpg.entities.vanilla.EntityMiner;
import net.divinerpg.entities.vanilla.EntityNetherWatcher;
import net.divinerpg.entities.vanilla.EntityRainbour;
import net.divinerpg.entities.vanilla.EntityRotatick;
import net.divinerpg.entities.vanilla.EntityScorcher;
import net.divinerpg.entities.vanilla.EntityShark;
import net.divinerpg.entities.vanilla.EntityTheEye;
import net.divinerpg.entities.vanilla.EntityWhale;
import net.divinerpg.entities.vanilla.EntityWildfire;
import net.divinerpg.entities.vanilla.projectile.EntityCaveRock;
import net.divinerpg.entities.vanilla.projectile.EntityCorruptedBullet;
import net.divinerpg.entities.vanilla.projectile.EntityDeath;
import net.divinerpg.entities.vanilla.projectile.EntityDivineArrow;
import net.divinerpg.entities.vanilla.projectile.EntityEnderTripletFireball;
import net.divinerpg.entities.vanilla.projectile.EntityFrostShot;
import net.divinerpg.entities.vanilla.projectile.EntityKingOfScorchersShot;
import net.divinerpg.entities.vanilla.projectile.EntityMaelstorm;
import net.divinerpg.entities.vanilla.projectile.EntityScorcherShot;
import net.divinerpg.entities.vanilla.projectile.EntityScythe;
import net.divinerpg.entities.vanilla.projectile.EntityShooterBullet;
import net.divinerpg.entities.vanilla.projectile.EntityShuriken;
import net.divinerpg.entities.vanilla.projectile.EntityVileStorm;
import net.divinerpg.entities.vanilla.projectile.EntityWatcherShot;
import net.divinerpg.utils.Util;

public class VanillaEntityRegistry {

	public static void init(){
		Util.registerProjectile(EntityScythe.class, "divinerpg.Scythe");
		Util.registerProjectile(EntityShuriken.class, "divinerpg.Shuriken");
		Util.registerProjectile(EntityVileStorm.class, "divinerpg.VileStorm");
		Util.registerProjectile(EntityDeath.class, "divinerpg.Death");
		Util.registerProjectile(EntityKingOfScorchersShot.class, "divinerpg.KOSShot");
		Util.registerProjectile(EntityCaveRock.class, "divinerpg.CaveRock");
		Util.registerProjectile(EntityWatcherShot.class, "divinerpg.WatcherShot");
		Util.registerProjectile(EntityMaelstorm.class, "divinerpg.Maelstorm");
		Util.registerProjectile(EntityFrostShot.class, "divinerpg.FrostShot");
		Util.registerProjectile(EntityScorcherShot.class, "divinerpg.ScorcherShot");
		Util.registerProjectile(EntityCorruptedBullet.class, "divinerpg.CorruptedBullet");
		Util.registerProjectile(EntityDivineArrow.class, "divinerpg.DivineArrow");
		Util.registerProjectile(EntityEnderTripletFireball.class, "divinerpg.TripletFireball");
		Util.registerProjectile(EntityShooterBullet.class, "divinerpg.Bullet");

		Util.registerDivineRPGMob(EntityEnderWatcher.class, "divinerpg.EnderWatcher");		
		Util.registerDivineRPGMob(EntityCrab.class, "divinerpg.Crab");
		Util.registerDivineRPGMob(EntityBabyCrab.class, "divinerpg.BabyCrab");
		Util.registerDivineRPGMob(EntityMiner.class, "divinerpg.UndeadMiner");
		Util.registerDivineRPGMob(EntityKingCrab.class, "divinerpg.KingCrab");
		Util.registerDivineRPGMob(EntityDesertCrawler.class, "divinerpg.DesertCrawler");
		Util.registerDivineRPGMob(EntityCaveCrawler.class, "divinerpg.CaveCrawler");
		Util.registerDivineRPGMob(EntityJungleDramcryx.class, "divinerpg.JungleDramcryx");
		Util.registerDivineRPGMob(EntityJungleSpider.class, "divinerpg.JungleSpider");
		Util.registerDivineRPGMob(EntityCyclops.class, "divinerpg.Cyclops");
		Util.registerDivineRPGMob(EntityCaveclops.class, "divinerpg.Caveclops");
		Util.registerDivineRPGMob(EntityAncientEntity.class, "divinerpg.AncientEntity");
		Util.registerDivineRPGMob(EntityWhale.class, "divinerpg.Whale");
		Util.registerDivineRPGMob(EntityHellSpider.class, "divinerpg.HellSpider");
		Util.registerDivineRPGMob(EntityScorcher.class, "divinerpg.Scorcher");
		Util.registerDivineRPGMob(EntityEnderSpider.class, "divinerpg.EnderSpider");
		Util.registerDivineRPGMob(EntityEnderTriplets.class, "divinerpg.EnderTriplets");
		Util.registerDivineRPGMob(EntityAridWarrior.class, "divinerpg.AridWarrior");
		Util.registerDivineRPGMob(EntityAyeracoBlue.class, "divinerpg.AyeracoBlue");
		Util.registerDivineRPGMob(EntityAyeracoGreen.class, "divinerpg.AyeracoGreen");
		Util.registerDivineRPGMob(EntityAyeracoPurple.class, "divinerpg.AyeracoPurple");
		Util.registerDivineRPGMob(EntityAyeracoRed.class, "divinerpg.AyeracoRed");
		Util.registerDivineRPGMob(EntityAyeracoYellow.class, "divinerpg.AyeracoYellow");
		Util.registerDivineRPGMob(EntityEnthralledDramcryx.class, "divinerpg.EnthralledDramcryx");
		Util.registerDivineRPGMob(EntityTheEye.class, "divinerpg.TheEye");
		Util.registerDivineRPGMob(EntityFrost.class, "divinerpg.Frost");
		Util.registerDivineRPGMob(EntityKingOfScorchers.class, "divinerpg.KingOfScorchers");
		Util.registerDivineRPGMob(EntityRainbour.class, "divinerpg.Rainbour");
		Util.registerDivineRPGMob(EntityRotatick.class, "divinerpg.Rotatick");
		Util.registerDivineRPGMob(EntityShark.class, "divinerpg.Shark");
		Util.registerDivineRPGMob(EntityNetherWatcher.class, "divinerpg.TheWatcher");
		Util.registerDivineRPGMob(EntityWildfire.class, "divinerpg.Wildfire");
		Util.registerDivineRPGMob(EntityGlacon.class, "divinerpg.Glacon");
		Util.registerDivineRPGMob(EntityJackOMan.class, "divinerpg.JackOMan");
		Util.registerDivineRPGMob(EntityJungleBat.class, "divinerpg.JungleBat");
		Util.registerDivineRPGMob(EntityHellPig.class, "divinerpg.HellPig");

	}
}
