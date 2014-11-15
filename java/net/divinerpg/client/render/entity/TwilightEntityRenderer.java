package net.divinerpg.client.render.entity;

import net.divinerpg.api.entity.EntityStats;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineArrow;
import net.divinerpg.client.render.RenderDivineBoss;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.entity.twilight.RenderBunny;
import net.divinerpg.client.render.entity.twilight.model.ModelAngryBunny;
import net.divinerpg.client.render.entity.twilight.model.ModelBasalisk;
import net.divinerpg.client.render.entity.twilight.model.ModelBunny;
import net.divinerpg.client.render.entity.twilight.model.ModelCadillion;
import net.divinerpg.client.render.entity.twilight.model.ModelCori;
import net.divinerpg.client.render.entity.twilight.model.ModelDenseDemon;
import net.divinerpg.client.render.entity.twilight.model.ModelDensos;
import net.divinerpg.client.render.entity.twilight.model.ModelEnchantedArcher;
import net.divinerpg.client.render.entity.twilight.model.ModelEnchantedWarrior;
import net.divinerpg.client.render.entity.twilight.model.ModelKarot;
import net.divinerpg.client.render.entity.twilight.model.ModelMadivel;
import net.divinerpg.client.render.entity.twilight.model.ModelMoonWolf;
import net.divinerpg.client.render.entity.twilight.model.ModelMytrilFiend;
import net.divinerpg.client.render.entity.twilight.model.ModelNesro;
import net.divinerpg.client.render.entity.twilight.model.ModelSamek;
import net.divinerpg.client.render.entity.twilight.model.ModelSoulFiend;
import net.divinerpg.client.render.entity.twilight.model.ModelSoulStealer;
import net.divinerpg.client.render.entity.twilight.model.ModelTomo;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightDemon;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightGolem;
import net.divinerpg.client.render.entity.twilight.model.ModelVamacheron;
import net.divinerpg.entities.twilight.EntityAngryBunny;
import net.divinerpg.entities.twilight.EntityApalachiaArcher;
import net.divinerpg.entities.twilight.EntityApalachiaCadillion;
import net.divinerpg.entities.twilight.EntityApalachiaGolem;
import net.divinerpg.entities.twilight.EntityApalachiaTomo;
import net.divinerpg.entities.twilight.EntityApalachiaWarrior;
import net.divinerpg.entities.twilight.EntityBaslisk;
import net.divinerpg.entities.twilight.EntityBunny;
import net.divinerpg.entities.twilight.EntityDensos;
import net.divinerpg.entities.twilight.EntityEdenCadillion;
import net.divinerpg.entities.twilight.EntityEdenCori;
import net.divinerpg.entities.twilight.EntityEdenTomo;
import net.divinerpg.entities.twilight.EntityKarot;
import net.divinerpg.entities.twilight.EntityMadivel;
import net.divinerpg.entities.twilight.EntityMoonWolf;
import net.divinerpg.entities.twilight.EntityMortumCadillion;
import net.divinerpg.entities.twilight.EntityMortumDemon;
import net.divinerpg.entities.twilight.EntityNesro;
import net.divinerpg.entities.twilight.EntityReyvor;
import net.divinerpg.entities.twilight.EntitySamek;
import net.divinerpg.entities.twilight.EntitySkythernArcher;
import net.divinerpg.entities.twilight.EntitySkythernCori;
import net.divinerpg.entities.twilight.EntitySkythernFiend;
import net.divinerpg.entities.twilight.EntitySkythernGolem;
import net.divinerpg.entities.twilight.EntitySoulFiend;
import net.divinerpg.entities.twilight.EntitySoulStealer;
import net.divinerpg.entities.twilight.EntityTwilightDemon;
import net.divinerpg.entities.twilight.EntityVamacheron;
import net.divinerpg.entities.twilight.EntityVerek;
import net.divinerpg.entities.twilight.EntityWildWoodGolem;
import net.divinerpg.entities.twilight.EntityWildWoodTomo;
import net.divinerpg.entities.twilight.projectile.EntityApalachiaArrow;
import net.divinerpg.entities.twilight.projectile.EntityBlitzApalachia;
import net.divinerpg.entities.twilight.projectile.EntityBlitzEden;
import net.divinerpg.entities.twilight.projectile.EntityBlitzHalite;
import net.divinerpg.entities.twilight.projectile.EntityBlitzMortum;
import net.divinerpg.entities.twilight.projectile.EntityBlitzSkythern;
import net.divinerpg.entities.twilight.projectile.EntityBlitzWildWood;
import net.divinerpg.entities.twilight.projectile.EntityCoriShot;
import net.divinerpg.entities.twilight.projectile.EntityEdenArrow;
import net.divinerpg.entities.twilight.projectile.EntityHaliteArrow;
import net.divinerpg.entities.twilight.projectile.EntityMortumArrow;
import net.divinerpg.entities.twilight.projectile.EntityPhaserApalachia;
import net.divinerpg.entities.twilight.projectile.EntityPhaserEden;
import net.divinerpg.entities.twilight.projectile.EntityPhaserHalite;
import net.divinerpg.entities.twilight.projectile.EntityPhaserMortum;
import net.divinerpg.entities.twilight.projectile.EntityPhaserSkythern;
import net.divinerpg.entities.twilight.projectile.EntityPhaserWildWood;
import net.divinerpg.entities.twilight.projectile.EntitySkythernArrow;
import net.divinerpg.entities.twilight.projectile.EntitySlicerApalachia;
import net.divinerpg.entities.twilight.projectile.EntitySlicerEden;
import net.divinerpg.entities.twilight.projectile.EntitySlicerHalite;
import net.divinerpg.entities.twilight.projectile.EntitySlicerMortum;
import net.divinerpg.entities.twilight.projectile.EntitySlicerSkythern;
import net.divinerpg.entities.twilight.projectile.EntitySlicerWildWoods;
import net.divinerpg.entities.twilight.projectile.EntityWildWoodArrow;
import net.divinerpg.utils.items.TwilightItemsWeapons;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	
	private static EntityResourceLocation x;
	private static EntityStats s;
	
	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerEden.class, new RenderIconProjectile(TwilightItemsWeapons.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerWildWoods.class, new RenderIconProjectile(TwilightItemsWeapons.wildwoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerApalachia.class, new RenderIconProjectile(TwilightItemsWeapons.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerSkythern.class, new RenderIconProjectile(TwilightItemsWeapons.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMortum.class, new RenderIconProjectile(TwilightItemsWeapons.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderIconProjectile(TwilightItemsWeapons.haliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEden.class, new RenderProjectile(x.blitzEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzWildWood.class, new RenderProjectile(x.blitzWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzApalachia.class, new RenderProjectile(x.blitzApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSkythern.class, new RenderProjectile(x.blitzSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMortum.class, new RenderProjectile(x.blitzMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderProjectile(x.blitzHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserEden.class, new RenderProjectile(x.phaserEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserWildWood.class, new RenderProjectile(x.phaserWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserApalachia.class, new RenderProjectile(x.phaserApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserSkythern.class, new RenderProjectile(x.phaserSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMortum.class, new RenderProjectile(x.phaserMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderProjectile(x.phaserHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderProjectile(x.coriShot));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.edenTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderBunny(new ModelBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderBunny(new ModelAngryBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenCori.class, new RenderDivineMob(new ModelCori(), 0.0F, x.edenCori));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineMob(new ModelMadivel(), 0.0F, x.madivel));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderDivineMob(new ModelNesro(), 0.0F, x.nesro));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.wildWoodGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.wildWoodTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.varek));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineMob(new ModelMoonWolf(), 0.0F, x.wildWoodWolf));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.apalachiaTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.apalachiaGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaWarrior.class, new RenderDivineMob(new ModelEnchantedWarrior(), 0.0F, x.apalachiaWarrior));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, x.apalachiaArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, x.skythernArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.samek));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernCori.class, new RenderDivineMob(new ModelCori(), 0.0F, x.skythernCori));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernFiend.class, new RenderDivineMob(new ModelMytrilFiend(), 0.0F, x.skythernFiend));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.mortumCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumDemon.class, new RenderDivineMob(new ModelDenseDemon(), 0.0F, x.mortumDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineMob(new ModelBasalisk(), 0.0F, x.basalisk));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineMob(new ModelSoulStealer(), 0.0F, x.soulStealer));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDivineBoss(new ModelDensos(), 0.0F, x.densos, s.densosBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderDivineBoss(new ModelDensos(), 0.0F, x.reyvor, s.reyvorBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderDivineBoss(new ModelTwilightDemon(), 0.0F, 2.0F, x.twilightDemon, s.twilightDemonBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderDivineBoss(new ModelSoulFiend(), 0.0F, 1.0F, x.soulFiend, s.soulFiendBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderDivineBoss(new ModelVamacheron(), 0.0F, 3.0F, x.vamacheron, s.vamacheronBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderDivineBoss(new ModelKarot(), 0.0F, 5.0F, x.karot, s.karotBossID));
	
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenArrow.class, new RenderDivineArrow(x.edenArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodArrow.class, new RenderDivineArrow(x.wildArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArrow.class, new RenderDivineArrow(x.apalachiaArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArrow.class, new RenderDivineArrow(x.skythernArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumArrow.class, new RenderDivineArrow(x.mortumArrow));
        RenderingRegistry.registerEntityRenderingHandler(EntityHaliteArrow.class, new RenderDivineArrow(x.haliteArrow));
	}	
}