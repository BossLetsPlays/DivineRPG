package divinerpg.registries;

import com.google.common.base.*;
import com.google.common.collect.*;
import divinerpg.*;
import divinerpg.client.models.arcana.*;
import divinerpg.client.models.boss.*;
import divinerpg.client.models.iceika.*;
import divinerpg.client.models.twilight.*;
import divinerpg.client.models.vanilla.*;
import divinerpg.client.renders.base.*;
import divinerpg.client.renders.entity.arcana.*;
import divinerpg.client.renders.entity.boss.*;
import divinerpg.client.renders.entity.iceika.*;
import divinerpg.client.renders.entity.projectile.*;
import divinerpg.client.renders.entity.twilight.*;
import divinerpg.client.renders.entity.vanilla.*;
import divinerpg.entities.apalachia.*;
import divinerpg.entities.arcana.*;
import divinerpg.entities.boss.*;
import divinerpg.entities.boss.ayeraco.*;
import divinerpg.entities.eden.*;
import divinerpg.entities.iceika.*;
import divinerpg.entities.mortum.*;
import divinerpg.entities.projectile.*;
import divinerpg.entities.skythern.*;
import divinerpg.entities.vanilla.end.*;
import divinerpg.entities.vanilla.nether.*;
import divinerpg.entities.vanilla.overworld.*;
import divinerpg.entities.wildwood.*;
import divinerpg.util.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;

import java.util.*;

@Mod.EventBusSubscriber(modid = DivineRPG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistry {
    private static final List<EntityType<?>> ENTITIES = Lists.newArrayList();
    private static final List<Item> SPAWN_EGGS = Lists.newArrayList();

    //Projectile
    public static final EntityType ATTRACTOR = registerProjectile(EntityAttractor::new, "attractor");
    public static final EntityType BOUNCING_PROJECTILE = registerProjectile(EntityBouncingProjectile::new, "bouncing_projectile");
    public static final EntityType CAVE_ROCK = registerProjectile(EntityCaveRock::new, "cave_rock");
    public static final EntityType COLORED_BULLET = registerProjectile(EntityColoredBullet::new, "colored_bullet");
    public static final EntityType CORI_SHOT = registerProjectile(EntityCoriShot::new, "cori_shot");
    public static final EntityType CORRUPTED_BULLET = registerProjectile(EntityCorruptedBullet::new, "corrupted_bullet");
    public static final EntityType DISK = registerProjectile(EntityDisk::new, "disk");
    public static final EntityType DISSIMENT_SHOT = registerProjectile(EntityDissimentShot::new, "dissiment_shot");
    public static final EntityType ARROW_SHOT = registerArrowProjectile(EntityDivineArrow::new, "arrow_shot");
    public static final EntityType ENDER_TRIPLETS_FIREBALL = registerFireballProjectile(EntityEnderTripletsFireball::new, "ender_triplets_fireball");
    public static final EntityType FIREFLY = registerProjectile(EntityFirefly::new, "firefly");
    public static final EntityType FRACTITE_SHOT = registerFireballProjectile(EntityFractiteShot::new, "fractite_shot");
    public static final EntityType FROST_CLOUD = registerProjectileNoThrow(EntityFrostCloud::new, "frost_cloud");
    public static final EntityType FROST_SHOT = registerFireballProjectile(EntityFrostShot::new, "frost_shot");
    public static final EntityType FYRACRYX_FIREBALL = registerFireballProjectile(EntityFyracryxFireball::new, "fyracryx_fireball");
    public static final EntityType GENERALS_STAFF = registerProjectile(EntityGeneralsStaff::new, "generals_staff");
    public static final EntityType GRENADE = registerSnowballProjectile(EntityGrenade::new, "grenade");
    public static final EntityType KAZROTIC_SHOT = registerProjectile(EntityKazroticShot::new, "kazrotic_shot");
    public static final EntityType KING_OF_SCORCHERS_METEOR = registerProjectile(EntityKingOfScorchersMeteor::new, "king_of_scorchers_meteor");
    public static final EntityType KING_OF_SCORCHERS_SHOT = registerProjectile(EntityKingOfScorchersShot::new, "king_of_scorchers_shot");
    public static final EntityType LADY_LUNA_SPARKLER = registerProjectile(EntityLadyLunaSparkler::new, "lady_luna_sparkler");
    public static final EntityType MANDRAGORA_PROJECTILE = registerProjectile(EntityMandragoraProjectile::new, "mandragora_projectile");
    public static final EntityType MERIKS_MISSILE = registerProjectile(EntityMerikMissile::new, "meriks_missile");
    public static final EntityType METEOR = registerProjectile(EntityMeteor::new, "meteor");
    public static final EntityType PARTICLE_BULLET = registerProjectile(EntityParticleBullet::new, "particle_bullet");
    public static final EntityType RAGLOK_BOMB = registerProjectile(EntityRaglokBomb::new, "raglok_bomb");
    public static final EntityType REFLECTOR = registerProjectile(EntityReflector::new, "reflector");
    public static final EntityType SAGUARO_WORM_SHOT = registerProjectile(EntitySaguaroWormShot::new, "saguaro_worm_shot");
    public static final EntityType SCORCHER_SHOT = registerFireballProjectile(EntityScorcherShot::new, "scorcher_shot");
    public static final EntityType SERENADE_OF_DEATH = registerProjectile(EntitySerenadeOfDeath::new, "serenade_of_death");
    public static final EntityType SERENADE_OF_ICE = registerProjectile(EntitySerenadeOfIce::new, "serenade_of_ice");
    public static final EntityType SHOOTER_BULLET = registerProjectile(EntityShooterBullet::new, "shooter_bullet");
    public static final EntityType SHURIKEN = registerProjectile(EntityShuriken::new, "shuriken");
    public static final EntityType SNOWFLAKE_SHURIKEN = registerProjectile(EntitySnowflakeShuriken::new, "snowflake_shuriken");
    public static final EntityType SOUL_FIEND_SHOT = registerProjectile(EntitySoulFiendShot::new, "soul_fiend_shot");
    public static final EntityType SOUND_OF_CAROLS = registerProjectile(EntitySoundOfCarols::new, "sound_of_carols");
    public static final EntityType SOUND_OF_MUSIC = registerProjectile(EntitySoundOfMusic::new, "sound_of_music");
    public static final EntityType SPARKLER = registerProjectile(EntitySparkler::new, "sparkler");
    public static final EntityType STARLIGHT = registerProjectile(EntityStar::new, "star");
    public static final EntityType TWILIGHT_DEMON_SHOT = registerProjectile(EntityTwilightDemonShot::new, "twilight_demon_shot");
    public static final EntityType TWILIGHT_MAGE_SHOT = registerProjectile(EntityTwilightMageShot::new, "twilight_mage_shot");
    public static final EntityType VILE_STORM = registerProjectile(EntityVileStorm::new, "vile_storm");
    public static final EntityType WATCHER_SHOT = registerProjectile(EntityWatcherShot::new, "watcher_shot");
    public static final EntityType WILDWOOD_LOG = registerProjectile(EntityWildwoodLog::new, "wildwood_log");
    public static final EntityType WRECK_BOUNCING_PROJECTILE = registerProjectile(EntityWreckBouncingProjectile::new, "wreck_bouncing_projectile");
    public static final EntityType WRECK_EXPLOSIVE_SHOT = registerProjectile(EntityWreckExplosiveShot::new, "wreck_explosive_shot");
    public static final EntityType WRECK_SHOT = registerProjectile(EntityWreckShot::new, "wreck_shot");
    public static final EntityType ZORAGON_BOMB = registerProjectile(EntityZoragonBomb::new, "zoragon_bomb");

    // Boss
    public static final EntityType ANCIENT_ENTITY = registerEntity(EntityAncientEntity::new, "ancient_entity",4.0F, 6.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType AYERACO_BLUE = registerEntity(EntityAyeracoBlue::new, "ayeraco_blue",2.8F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType AYERACO_GREEN = registerEntity(EntityAyeracoGreen::new, "ayeraco_green",2.8F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType AYERACO_PURPLE = registerEntity(EntityAyeracoPurple::new, "ayeraco_purple",2.8F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType AYERACO_RED = registerEntity(EntityAyeracoRed::new, "ayeraco_red",2.8F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType AYERACO_YELLOW = registerEntity(EntityAyeracoYellow::new, "ayeraco_yellow",2.8F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType DENSOS = registerEntity(EntityDensos::new, "densos",1.0F, 2.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType DRAMIX = registerEntity(EntityDramix::new, "dramix",0.85F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType ETERNAL_ARCHER = registerEntity(EntityEternalArcher::new, "eternal_archer",3.0F, 5.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType EXPERIENCED_CORI = registerEntity(EntityExperiencedCori::new, "experienced_cori",4F, 6.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType HIVE_QUEEN = registerEntity(EntityHiveQueen::new, "hive_queen",1.5F, 4.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType KAROT = registerEntity(EntityKarot::new, "karot",3.25F, 4F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType KAROS = registerEntity(EntityKaros::new, "karos",1.0F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType KING_OF_SCORCHERS = registerEntity(EntityKingOfScorchers::new, "king_of_scorchers",2.0F, 2.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType LADY_LUNA = registerEntity(EntityLadyLuna::new, "lady_luna",1.0F, 3.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType PARASECTA = registerEntity(EntityParasecta::new, "parasecta",1.3F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType QUADRO = registerEntity(EntityQuadro::new, "quadro",1.2F, 2.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType RAGLOK = registerEntity(EntityRaglok::new, "raglok",3.0F, 5.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType REYVOR = registerEntity(EntityReyvor::new, "reyvor",1.0F, 2.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType SOUL_FIEND = registerEntity(EntitySoulFiend::new, "soul_fiend",0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType SUNSTORM = registerEntity(EntitySunstorm::new, "sunstorm",0.9F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType TERMASECT = registerEntity(EntityTermasect::new, "termasect",5.9F, 8.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType THE_WATCHER = registerEntity(EntityTheWatcher::new, "the_watcher",4F, 4F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType TWILIGHT_DEMON = registerEntity(EntityTwilightDemon::new, "twilight_demon",2.0F, 4.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType VAMACHERON = registerEntity(EntityVamacheron::new, "vamacheron",1.45F, 2.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);
    public static final EntityType WRECK = registerEntity(EntityWreck::new, "wreck",2.0F, 2.4F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.BOSS), EntityClassification.MONSTER);



    // Vanilla
    public static final EntityType ARID_WARRIOR = registerEntity(EntityAridWarrior::new, "arid_warrior",1.4F, 2.8f, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType BROWN_GRIZZLE = registerEntity(EntityBrownGrizzle::new, "brown_grizzle",0.8F, 1.4F, EntityClassification.MONSTER);
    public static final EntityType CAVE_CRAWLER = registerEntity(EntityCaveCrawler::new, "cave_crawler",1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType CAVECLOPS = registerEntity(EntityCaveclops::new, "caveclops", 1.2F, 4.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType CRAB = registerEntity(EntityCrab::new, "crab", 0.9F, 0.6F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType CYCLOPS = registerEntity(EntityCyclops::new, "cyclops", 1.2F, 4.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType DESERT_CRAWLER = registerEntity(EntityDesertCrawler::new, "desert_crawler", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType EHU = registerEntity(EntityEhu::new, "ehu", 0.6F, 1.0F, EntityClassification.MONSTER);
    public static final EntityType ENTHRALLED_DRAMCRYX = registerEntity(EntityEnthralledDramcryx::new, "enthralled_dramcryx", 1.35F, 1.75F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType FROST = registerEntity(EntityFrost::new, "frost", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType GLACON = registerEntity(EntityGlacon::new, "glacon", 0.8F, 1.4F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType HUSK = registerEntity(EntityHusk::new, "husk", 0.8F, 1.5F, EntityClassification.MONSTER);
    public static final EntityType JACK_O_MAN = registerEntity(EntityJackOMan::new, "jack_o_man", 0.8F, 2F, EntityClassification.MISC);
    public static final EntityType JUNGLE_BAT = registerEntity(EntityJungleBat::new, "jungle_bat", 0.7F, 1F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType JUNGLE_DRAMCRYX = registerEntity(EntityJungleDramcryx::new, "jungle_dramcryx", 1F, 1.3F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType JUNGLE_SPIDER = registerEntity(EntityJungleSpider::new, "jungle_spider", 1.4F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType KING_CRAB = registerEntity(EntityKingCrab::new, "king_crab", 1.8F, 1.7F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType KOBBLIN = registerEntity(EntityKobblin::new, "kobblin", 0.75F, 1F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType LIOPLEURODON = registerEntity(EntityLiopleurodon::new, "liopleurodon", 4F, 1f, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType LIVESTOCK_MERCHANT = registerEntity(EntityLivestockMerchant::new, "livestock_merchant", 0.8F, 2f, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType MINER = registerEntity(EntityMiner::new, "miner", 0.6F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType PUMPKIN_SPIDER = registerEntity(EntityPumpkinSpider::new, "pumpkin_spider", 1.25F, 1F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType RAINBOUR = registerEntity(EntityRainbour::new, "rainbour", 1F, 1F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType ROTATICK = registerEntity(EntityRotatick::new, "rotatick", 0.85F, 0.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType SAGUARO_WORM = registerEntity(EntitySaguaroWorm::new, "saguaro_worm", 1F, 3F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType SHARK = registerEntity(EntityShark::new, "shark", 1.0F, 0.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.WATER_CREATURE);
    public static final EntityType SMELTER = registerEntity(EntitySmelter::new, "smelter", 1.5F, 3.5F, EntityClassification.MONSTER);
    public static final EntityType SNAPPER = registerEntity(EntitySnapper::new, "snapper", 0.6F, 0.5F, EntityClassification.MONSTER);
    public static final EntityType STONE_GOLEM = registerEntity(EntityStoneGolem::new, "stone_golem", 1.5F, 3.5F, EntityClassification.MONSTER);
    public static final EntityType THE_EYE = registerEntity(EntityTheEye::new, "the_eye", 1.3F, 2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType THE_GRUE = registerEntity(EntityTheGrue::new, "the_grue", 0.8F, 1.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.MONSTER);
    public static final EntityType WHALE = registerEntity(EntityWhale::new, "whale", 3F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.OVERWORLD), EntityClassification.WATER_CREATURE);
    public static final EntityType WHITE_GRIZZLE = registerEntity(EntityWhiteGrizzle::new, "white_grizzle",0.8F, 1.4F, EntityClassification.MONSTER);

    //Nether
    public static final EntityType HELL_BAT = registerEntity(EntityHellBat::new, "hell_bat",0.7F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.NETHER), EntityClassification.MONSTER);
    public static final EntityType HELL_PIG = registerEntity(EntityHellPig::new, "hell_pig",1F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.NETHER), EntityClassification.MONSTER);
    public static final EntityType HELL_SPIDER = registerEntity(EntityHellSpider::new, "hell_spider",1.4F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.NETHER), EntityClassification.MONSTER);
    public static final EntityType SCORCHER = registerEntity(EntityScorcher::new, "scorcher",1.2F, 2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.NETHER), EntityClassification.MONSTER);
    public static final EntityType WILDFIRE = registerEntity(EntityWildfire::new, "wildfire",0.8F, 2.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.NETHER), EntityClassification.MONSTER);

    // End
    public static final EntityType ENDER_SPIDER = registerEntity(EntityEnderSpider::new, "ender_spider",0.5F, 0.55F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.END), EntityClassification.MONSTER);
    public static final EntityType ENDER_TRIPLETS = registerEntity(EntityEnderTriplets::new, "ender_triplets",2.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.END), EntityClassification.MONSTER);
    public static final EntityType ENDER_WATCHER = registerEntity(EntityEnderWatcher::new, "ender_watcher",0.7F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.END), EntityClassification.MONSTER);

    // Iceika
    public static final EntityType ALICANTO = registerEntity(EntityAlicanto::new, "alicanto",1.2F, 1.6F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType FRACTITE = registerEntity(EntityFractite::new, "fractite",1.7F, 1.3F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType FROST_ARCHER = registerEntity(EntityFrostArcher::new, "frost_archer",0.6F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType FROSTY = registerEntity(EntityFrosty::new, "frosty",0.9F, 2.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType GLACIDE = registerEntity(EntityGlacide::new, "glacide",0.9F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType HASTREUS = registerEntity(EntityHastreus::new, "hastreus",1.0F, 1.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType ROLLUM = registerEntity(EntityRollum::new, "rollum",1.2F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MONSTER);
    public static final EntityType WORKSHOP_MERCHANT = registerEntity(EntityWorkshopMerchant::new, "workshop_merchant",1.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MISC);
    public static final EntityType WORKSHOP_TINKERER = registerEntity(EntityWorkshopTinkerer::new, "workshop_tinkerer",1.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ICEIKA), EntityClassification.MISC);

    // Eden
    public static final EntityType BUNNY = registerEntity(EntityBunny::new, "bunny",0.5F, 0.7F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MISC);
    public static final EntityType EDEN_CADILLION = registerEntity(EntityEdenCadillion::new, "eden_cadillion", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);
    public static final EntityType EDEN_TOMO = registerEntity(EntityEdenTomo::new, "eden_tomo", 1.0F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);
    public static final EntityType GREENFEET = registerEntity(EntityGreenfeet::new, "greenfeet", 1.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);
    public static final EntityType MADIVEL = registerEntity(EntityMadivel::new, "madivel", 0.6F, 2.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);
    public static final EntityType SUN_ARCHER = registerEntity(EntitySunArcher::new, "sun_archer", 0.8F, 2.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);
    public static final EntityType WEAK_CORI = registerEntity(EntityWeakCori::new, "weak_cori", 0.6F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.EDEN), EntityClassification.MONSTER);

    // Wildwood
    public static final EntityType BEHEMOTH = registerEntity(EntityBehemoth::new, "behemoth", 1.0F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType EPIPHITE = registerEntity(EntityEpiphite::new, "epiphite", 0.9F, 1.3F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType MAGE = registerEntity(EntityMage::new, "mage", 0.5F, 2.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType MOON_WOLF = registerEntity(EntityMoonWolf::new, "moon_wolf", 0.6F, 0.85F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MISC);
    public static final EntityType TERMID = registerEntity(EntityTermid::new, "termid", 0.4F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType VEREK = registerEntity(EntityVerek::new, "verek", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType WILDWOOD_CADILLION = registerEntity(EntityWildwoodCadillion::new, "wildwood_cadillion", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType WILDWOOD_GOLEM = registerEntity(EntityWildwoodGolem::new, "wildwood_golem", 1.3F, 2.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);
    public static final EntityType WILDWOOD_TOMO = registerEntity(EntityWildwoodTomo::new, "wildwood_tomo", 1.0F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.WILDWOOD), EntityClassification.MONSTER);

    // Apalachia
    public static final EntityType APALACHIA_CADILLION = registerEntity(EntityApalachiaCadillion::new, "apalachia_cadillion", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);
    public static final EntityType APALACHIA_GOLEM = registerEntity(EntityApalachiaGolem::new, "apalachia_golem", 1.3F, 2.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);
    public static final EntityType APALACHIA_TOMO = registerEntity(EntityApalachiaTomo::new, "apalachia_tomo", 1.0F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);
    public static final EntityType ENCHANTED_ARCHER = registerEntity(EntityEnchantedArcher::new, "enchanted_archer", 1.8F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);
    public static final EntityType ENCHANTED_WARRIOR = registerEntity(EntityEnchantedWarrior::new, "enchanted_warrior", 0.6F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);
    public static final EntityType SPELLBINDER = registerEntity(EntitySpellbinder::new, "spellbinder", 1.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.APALACHIA), EntityClassification.MONSTER);

    // Skythern
    public static final EntityType ADVANCED_CORI = registerEntity(EntityAdvancedCori::new, "advanced_cori", 0.6F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType MEGALITH = registerEntity(EntityMegalith::new, "megalith", 1.2F, 4.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType MYSTIC = registerEntity(EntityMystic::new, "mystic", 1.0F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType SAMEK = registerEntity(EntitySamek::new, "samek", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType SKYTHERN_ARCHER = registerEntity(EntitySkythernArcher::new, "skythern_archer", 1.8F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType SKYTHERN_FIEND = registerEntity(EntitySkythernFiend::new, "skythern_fiend", 0.6F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);
    public static final EntityType SKYTHERN_GOLEM = registerEntity(EntitySkythernGolem::new, "skythern_golem", 1.3F, 2.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.SKYTHERN), EntityClassification.MONSTER);

    // Mortum
    public static final EntityType ANGRY_BUNNY = registerEntity(EntityAngryBunny::new, "angry_bunny", 1.1F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType BASILISK = registerEntity(EntityBasilisk::new, "basilisk", 0.7F, 0.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType DEMON_OF_DARKNESS = registerEntity(EntityDemonOfDarkness::new, "demon_of_darkness", 0.8F, 1.6F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType MORTUM_CADILLION = registerEntity(EntityMortumCadillion::new, "mortum_cadillion", 1.0F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType SORCERER = registerEntity(EntitySorcerer::new, "sorcerer", 0.6F, 1.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType SOUL_SPIDER = registerEntity(EntitySoulSpider::new, "soul_spider", 0.3F, 0.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType SOUL_STEALER = registerEntity(EntitySoulStealer::new, "soul_stealer", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);
    public static final EntityType TWILIGHT_ARCHER = registerEntity(EntityTwilightArcher::new, "twilight_archer", 1.8F, 3.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.MORTUM), EntityClassification.MONSTER);

    // Arcana
    public static final EntityType CAPTAIN_MERIK = registerEntity(EntityCaptainMerik::new, "captain_merik", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType DATTICON = registerEntity(EntityDatticon::new, "datticon", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType DEATHCRYX = registerEntity(EntityDeathcryx::new, "deathcryx", 1.0F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType DEATH_HOUND = registerEntity(EntityDeathHound::new, "death_hound", 0.8F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType DUNGEON_CONSTRUCTOR = registerEntity(EntityDungeonConstructor::new, "dungeon_constructor", 0.5F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType DUNGEON_DEMON = registerEntity(EntityDungeonDemon::new, "dungeon_demon", 0.6F, 2.15F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType DUNGEON_PRISONER = registerEntity(EntityDungeonPrisoner::new, "dungeon_prisoner", 0.6F, 2.15F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType FYRACRYX = registerEntity(EntityFyracryx::new, "fyracryx", 1.0F, 1.2F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType GOLEM_OF_REJUVENATION = registerEntity(EntityGolemOfRejuvenation::new, "golem_of_rejuvenation", 1F, 2.35F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType KAZARI = registerEntity(EntityKazari::new, "kazari", 0.8F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType LEORNA = registerEntity(EntityLeorna::new, "leorna", 0.8F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType LIVING_STATUE = registerEntity(EntityLivingStatue::new, "living_statue", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType LORD_VATTICUS = registerEntity(EntityLordVatticus::new, "lord_vatticus", 0.8F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType PARATIKU = registerEntity(EntityParatiku::new, "paratiku", 0.5F, 0.9F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType RAZORBACK = registerEntity(EntityRazorback::new, "razorback", 0.6F, 0.5F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType ROAMER = registerEntity(EntityRoamer::new, "roamer", 0.6F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MONSTER);
    public static final EntityType SEIMER = registerEntity(EntitySeimer::new, "seimer", 1.0F, 1.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType WAR_GENERAL = registerEntity(EntityWarGeneral::new, "war_general", 0.8F, 2.0F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType WRAITH = registerEntity(EntityWraith::new, "wraith", 0.9F, 1.4F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
    public static final EntityType ZELUS = registerEntity(EntityZelus::new, "zelus", 0.8F, 1.8F, SpawnEggColors.getColorsForDimension(SpawnEggColors.Dimension.ARCANA), EntityClassification.MISC);
//
//    // Vethea //TODO - Add Vethean mobs
//    buildEntityEntry(EntityAcidHag.class, "acid_hag", VETHEA),
//    buildEntityEntry(EntityBiphron.class, "biphron", VETHEA),
//    buildEntityEntry(EntityBohemite.class, "bohemite", VETHEA),
//    buildEntityEntry(EntityCryptKeeper.class, "crypt_keeper", VETHEA),
//    buildEntityEntry(EntityCymesoid.class, "cymesoid", VETHEA),
//    buildEntityEntry(EntityDissiment.class, "dissiment", VETHEA),
//    buildEntityEntry(EntityDreamwrecker.class, "dreamwrecker", VETHEA),
//    buildEntityEntry(EntityDuo.class, "duo", VETHEA),
//    buildEntityEntry(EntityEnt.class, "ent", VETHEA),
//    buildEntityEntry(EntityFakeVhraak.class, "fake_vhraak", VETHEA),
//    buildEntityEntry(EntityGalroid.class, "galroid", VETHEA),
//    buildEntityEntry(EntityGorgosion.class, "gorgosion", VETHEA),
//    buildEntityEntry(EntityHelio.class, "helio", VETHEA),
//    buildEntityEntry(EntityHiveSoldier.class, "hive_soldier", VETHEA),
//    buildEntityEntry(EntityHoverStinger.class, "hover_stinger", VETHEA),
//    buildEntityEntry(EntityKazrotic.class, "kazrotic", VETHEA),
//    buildEntityEntry(EntityLheiva.class, "lheiva", VETHEA),
//    buildEntityEntry(EntityLorga.class, "lorga", VETHEA),
//    buildEntityEntry(EntityLorgaflight.class, "lorga_flight", VETHEA),
//    buildEntityEntry(EntityMandragora.class, "mandragora", VETHEA),
//    buildEntityEntry(EntityMysteriousManLayer1.class, "mysterious_man_layer_1", VETHEA),
//    buildEntityEntry(EntityMysteriousManLayer2.class, "mysterious_man_layer_2", VETHEA),
//    buildEntityEntry(EntityMysteriousManLayer3.class, "mysterious_man_layer_3", VETHEA),
//    buildEntityEntry(EntityShadahier.class, "shadahier", VETHEA),
//    buildEntityEntry(EntityTheHunger.class, "the_hunger", VETHEA),
//    buildEntityEntry(EntityTempleGuardian.class, "temple_guardian", VETHEA),
//    buildEntityEntry(EntityTocaxin.class, "tocaxin", VETHEA),
//    buildEntityEntry(EntityTwins.class, "twins", VETHEA),
//    buildEntityEntry(EntityVermenous.class, "vermenous", VETHEA),
//    buildEntityEntry(EntityVhraak.class, "vhraak", VETHEA),
//    buildEntityEntry(EntityZone.class, "zone", VETHEA),
//    buildEntityEntry(EntityZoragon.class, "zoragon", VETHEA),

    @SubscribeEvent
    public static void registerGlobalEntityAttributes(EntityAttributeCreationEvent event) {
        // Vanilla
        event.put(ARID_WARRIOR, EntityAridWarrior.attributes().build());
        event.put(BROWN_GRIZZLE, EntityBrownGrizzle.attributes().build());
        event.put(CAVE_CRAWLER, EntityCaveCrawler.attributes().build());
        event.put(CAVECLOPS, EntityCaveclops.attributes().build());
        event.put(CRAB, EntityCrab.attributes().build());
        event.put(CYCLOPS, EntityCyclops.attributes().build());
        event.put(DESERT_CRAWLER, EntityDesertCrawler.attributes().build());
        event.put(EHU, EntityEhu.attributes().build());
        event.put(ENTHRALLED_DRAMCRYX, EntityEnthralledDramcryx.attributes().build());
        event.put(FROST, EntityFrost.attributes().build());
        event.put(GLACON, EntityGlacon.attributes().build());
        event.put(HUSK, EntityHusk.attributes().build());
        event.put(JUNGLE_BAT, EntityJungleBat.attributes().build());
        event.put(JACK_O_MAN, EntityJackOMan.attributes().build());
        event.put(JUNGLE_DRAMCRYX, EntityJungleDramcryx.attributes().build());
        event.put(JUNGLE_SPIDER, EntityJungleSpider.attributes().build());
        event.put(KING_CRAB, EntityKingCrab.attributes().build());
        event.put(KOBBLIN, EntityKobblin.attributes().build());
        event.put(LIOPLEURODON, EntityLiopleurodon.attributes().build());
        event.put(LIVESTOCK_MERCHANT, EntityLivestockMerchant.attributes().build());
        event.put(MINER, EntityMiner.attributes().build());
        event.put(PUMPKIN_SPIDER, EntityPumpkinSpider.attributes().build());
        event.put(RAINBOUR, EntityRainbour.attributes().build());
        event.put(ROTATICK, EntityRotatick.attributes().build());
        event.put(SAGUARO_WORM, EntitySaguaroWorm.attributes().build());
        event.put(SHARK, EntityShark.attributes().build());
        event.put(SMELTER, EntitySmelter.attributes().build());
        event.put(SNAPPER, EntitySnapper.attributes().build());
        event.put(STONE_GOLEM, EntityStoneGolem.attributes().build());
        event.put(THE_EYE, EntityTheEye.attributes().build());
        event.put(THE_GRUE, EntityTheGrue.attributes().build());
        event.put(WHALE, EntityWhale.attributes().build());
        event.put(WHITE_GRIZZLE, EntityWhiteGrizzle.attributes().build());

        //Nether
        event.put(HELL_BAT, EntityHellBat.attributes().build());
        event.put(HELL_PIG, EntityHellPig.attributes().build());
        event.put(HELL_SPIDER, EntityHellSpider.attributes().build());
        event.put(SCORCHER, EntityScorcher.attributes().build());
        event.put(WILDFIRE, EntityWildfire.attributes().build());

        //End
        event.put(ENDER_SPIDER, EntityEnderSpider.attributes().build());
        event.put(ENDER_TRIPLETS, EntityEnderTriplets.attributes().build());
        event.put(ENDER_WATCHER, EntityEnderWatcher.attributes().build());

        //Boss
        event.put(ANCIENT_ENTITY, EntityAncientEntity.attributes().build());
        event.put(AYERACO_BLUE, EntityAyeracoBlue.attributes().build());
        event.put(AYERACO_GREEN, EntityAyeracoGreen.attributes().build());
        event.put(AYERACO_PURPLE, EntityAyeracoPurple.attributes().build());
        event.put(AYERACO_RED, EntityAyeracoRed.attributes().build());
        event.put(AYERACO_YELLOW, EntityAyeracoYellow.attributes().build());
        event.put(DENSOS, EntityDensos.attributes().build());
        event.put(DRAMIX, EntityDramix.attributes().build());
        event.put(ETERNAL_ARCHER, EntityEternalArcher.attributes().build());
        event.put(EXPERIENCED_CORI, EntityExperiencedCori.attributes().build());
        event.put(HIVE_QUEEN, EntityHiveQueen.attributes().build());
        event.put(KAROT, EntityKarot.attributes().build());
        event.put(KAROS, EntityKaros.attributes().build());
        event.put(KING_OF_SCORCHERS, EntityKingOfScorchers.attributes().build());
        event.put(LADY_LUNA, EntityLadyLuna.attributes().build());
        event.put(PARASECTA, EntityParasecta.attributes().build());
        event.put(QUADRO, EntityQuadro.attributes().build());
        event.put(RAGLOK, EntityRaglok.attributes().build());
        event.put(REYVOR, EntityReyvor.attributes().build());
        event.put(SOUL_FIEND, EntitySoulFiend.attributes().build());
        event.put(SUNSTORM, EntitySunstorm.attributes().build());
        event.put(TERMASECT, EntityTermasect.attributes().build());
        event.put(THE_WATCHER, EntityTheWatcher.attributes().build());
        event.put(TWILIGHT_DEMON, EntityTwilightDemon.attributes().build());
        event.put(VAMACHERON, EntityVamacheron.attributes().build());
        event.put(WRECK, EntityWreck.attributes().build());

        //Iceika
        event.put(ALICANTO, EntityAlicanto.attributes().build());
        event.put(FRACTITE, EntityFractite.attributes().build());
        event.put(FROST_ARCHER, EntityFrostArcher.attributes().build());
        event.put(FROSTY, EntityFrosty.attributes().build());
        event.put(GLACIDE, EntityGlacide.attributes().build());
        event.put(HASTREUS, EntityHastreus.attributes().build());
        event.put(ROLLUM, EntityRollum.attributes().build());
        event.put(WORKSHOP_MERCHANT, EntityWorkshopMerchant.attributes().build());
        event.put(WORKSHOP_TINKERER, EntityWorkshopTinkerer.attributes().build());

        //Eden
        event.put(BUNNY, EntityBunny.attributes().build());
        event.put(EDEN_CADILLION, EntityEdenCadillion.attributes().build());
        event.put(EDEN_TOMO, EntityEdenTomo.attributes().build());
        event.put(GREENFEET, EntityGreenfeet.attributes().build());
        event.put(MADIVEL, EntityMadivel.attributes().build());
        event.put(SUN_ARCHER, EntitySunArcher.attributes().build());
        event.put(WEAK_CORI, EntityWeakCori.attributes().build());

        //Wildwood
        event.put(BEHEMOTH, EntityBehemoth.attributes().build());
        event.put(EPIPHITE, EntityEpiphite.attributes().build());
        event.put(MAGE, EntityMage.attributes().build());
        event.put(MOON_WOLF, EntityMoonWolf.attributes().build());
        event.put(TERMID, EntityTermid.attributes().build());
        event.put(VEREK, EntityVerek.attributes().build());
        event.put(WILDWOOD_CADILLION, EntityWildwoodCadillion.attributes().build());
        event.put(WILDWOOD_GOLEM, EntityWildwoodGolem.attributes().build());
        event.put(WILDWOOD_TOMO, EntityWildwoodTomo.attributes().build());

        //Apalachia
        event.put(APALACHIA_CADILLION, EntityApalachiaCadillion.attributes().build());
        event.put(APALACHIA_GOLEM, EntityApalachiaGolem.attributes().build());
        event.put(APALACHIA_TOMO, EntityApalachiaTomo.attributes().build());
        event.put(ENCHANTED_ARCHER, EntityEnchantedArcher.attributes().build());
        event.put(ENCHANTED_WARRIOR, EntityEnchantedWarrior.attributes().build());
        event.put(SPELLBINDER, EntitySpellbinder.attributes().build());

        //Skythern
        event.put(ADVANCED_CORI, EntityAdvancedCori.attributes().build());
        event.put(MEGALITH, EntityMegalith.attributes().build());
        event.put(MYSTIC, EntityMystic.attributes().build());
        event.put(SAMEK, EntitySamek.attributes().build());
        event.put(SKYTHERN_ARCHER, EntitySkythernArcher.attributes().build());
        event.put(SKYTHERN_FIEND, EntitySkythernFiend.attributes().build());
        event.put(SKYTHERN_GOLEM, EntitySkythernGolem.attributes().build());

        //Mortum
        event.put(ANGRY_BUNNY, EntityAngryBunny.attributes().build());
        event.put(BASILISK, EntityBasilisk.attributes().build());
        event.put(DEMON_OF_DARKNESS, EntityDemonOfDarkness.attributes().build());
        event.put(MORTUM_CADILLION, EntityMortumCadillion.attributes().build());
        event.put(SORCERER, EntitySorcerer.attributes().build());
        event.put(SOUL_SPIDER, EntitySoulSpider.attributes().build());
        event.put(SOUL_STEALER, EntitySoulStealer.attributes().build());
        event.put(TWILIGHT_ARCHER, EntityTwilightArcher.attributes().build());

        //Arcana
        event.put(CAPTAIN_MERIK, EntityCaptainMerik.attributes().build());
        event.put(DATTICON, EntityDatticon.attributes().build());
        event.put(DEATHCRYX, EntityDeathcryx.attributes().build());
        event.put(DEATH_HOUND, EntityDeathHound.attributes().build());
        event.put(DUNGEON_CONSTRUCTOR, EntityDungeonConstructor.attributes().build());
        event.put(DUNGEON_DEMON, EntityDungeonDemon.attributes().build());
        event.put(DUNGEON_PRISONER, EntityDungeonPrisoner.attributes().build());
        event.put(FYRACRYX, EntityFyracryx.attributes().build());
        event.put(GOLEM_OF_REJUVENATION, EntityGolemOfRejuvenation.attributes().build());
        event.put(KAZARI, EntityKazari.attributes().build());
        event.put(LEORNA, EntityLeorna.attributes().build());
        event.put(LORD_VATTICUS, EntityLordVatticus.attributes().build());
        event.put(LIVING_STATUE, EntityLivingStatue.attributes().build());
        event.put(PARATIKU, EntityParatiku.attributes().build());
        event.put(RAZORBACK, EntityRazorback.attributes().build());
        event.put(ROAMER, EntityRoamer.attributes().build());
        event.put(SEIMER, EntitySeimer.attributes().build());
        event.put(WAR_GENERAL, EntityWarGeneral.attributes().build());
        event.put(WRAITH, EntityWraith.attributes().build());
        event.put(ZELUS, EntityZelus.attributes().build());
    }

    private static <T extends MobEntity> void registerWaterSpawn(final EntityType<T> type, EntitySpawnPlacementRegistry.IPlacementPredicate<T> predicate) {
        EntitySpawnPlacementRegistry.register(type, EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, predicate);
    }
    private static <T extends MobEntity> void registerLandSpawn(final EntityType<T> type, EntitySpawnPlacementRegistry.IPlacementPredicate<T> predicate) {
        EntitySpawnPlacementRegistry.register(type, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, predicate);
    }
    public static void registerSpawns() {
        registerLandSpawn(ARID_WARRIOR, EntityAridWarrior::canSpawnOn);
        registerLandSpawn(BROWN_GRIZZLE, EntityBrownGrizzle::canSpawnOn);
        registerLandSpawn(CAVE_CRAWLER, EntityCaveCrawler::canSpawnOn);
        registerLandSpawn(CAVECLOPS, EntityCaveclops::canSpawnOn);
        registerLandSpawn(CRAB, EntityCrab::canSpawnOn);
        registerLandSpawn(CYCLOPS, EntityCyclops::canSpawnOn);
        registerLandSpawn(DESERT_CRAWLER, EntityDesertCrawler::canSpawnOn);
        registerLandSpawn(EHU, EntityEhu::canSpawnOn);
        registerLandSpawn(ENTHRALLED_DRAMCRYX, EntityEnthralledDramcryx::canSpawnOn);
        registerLandSpawn(FROST, EntityFrost::canSpawnOn);
        registerLandSpawn(GLACON, EntityGlacon::canSpawnOn);
        registerLandSpawn(HUSK, EntityHusk::canSpawnOn);
        registerLandSpawn(JACK_O_MAN, EntityJackOMan::canSpawnOn);
        registerLandSpawn(JUNGLE_BAT, EntityJungleBat::canSpawnOn);
        registerLandSpawn(JUNGLE_DRAMCRYX, EntityJungleDramcryx::canSpawnOn);
        registerLandSpawn(JUNGLE_SPIDER, EntityJungleSpider::canSpawnOn);
        registerLandSpawn(KING_CRAB, EntityKingCrab::canSpawnOn);
        registerLandSpawn(KOBBLIN, EntityKobblin::canSpawnOn);
        registerWaterSpawn(LIOPLEURODON, EntityLiopleurodon::canSpawnOn);
        registerLandSpawn(LIVESTOCK_MERCHANT, EntityLivestockMerchant::canSpawnOn);
        registerLandSpawn(MINER, EntityMiner::canSpawnOn);
        registerLandSpawn(PUMPKIN_SPIDER, EntityPumpkinSpider::canSpawnOn);
        registerLandSpawn(RAINBOUR, EntityRainbour::canSpawnOn);
        registerLandSpawn(ROTATICK, EntityRotatick::canSpawnOn);
        registerLandSpawn(SAGUARO_WORM, EntitySaguaroWorm::canSpawnOn);
        registerWaterSpawn(SHARK, EntityShark::canSpawnOn);
        registerLandSpawn(SMELTER, EntitySmelter::canSpawnOn);
        registerLandSpawn(SNAPPER, EntitySnapper::canSpawnOn);
        registerLandSpawn(STONE_GOLEM, EntityStoneGolem::canSpawnOn);
        registerLandSpawn(THE_EYE, EntityTheEye::canSpawnOn);
        registerLandSpawn(THE_GRUE, EntityTheGrue::canSpawnOn);
        registerWaterSpawn(WHALE, EntityWhale::canSpawnOn);
        registerLandSpawn(WHITE_GRIZZLE, EntityWhiteGrizzle::canSpawnOn);

        //Nether
        registerLandSpawn(HELL_BAT, EntityHellBat::canSpawnOn);
        registerLandSpawn(HELL_PIG, EntityHellPig::canSpawnOn);
        registerLandSpawn(HELL_SPIDER, EntityHellSpider::canSpawnOn);
        registerLandSpawn(SCORCHER, EntityScorcher::canSpawnOn);
        registerLandSpawn(WILDFIRE, EntityWildfire::canSpawnOn);

        //End
        registerLandSpawn(ENDER_SPIDER, EntityEnderSpider::canSpawnOn);
        registerLandSpawn(ENDER_TRIPLETS, EntityEnderTriplets::canSpawnOn);
        registerLandSpawn(ENDER_WATCHER, EntityEnderWatcher::canSpawnOn);

        //Iceika
        registerLandSpawn(ALICANTO, EntityAlicanto::canSpawnOn);
        registerLandSpawn(FRACTITE, EntityFractite::canSpawnOn);
        registerLandSpawn(FROST_ARCHER, EntityFrostArcher::canSpawnOn);
        registerLandSpawn(FROSTY, EntityFrosty::canSpawnOn);
        registerLandSpawn(GLACIDE, EntityGlacide::canSpawnOn);
        registerLandSpawn(HASTREUS, EntityHastreus::canSpawnOn);
        registerLandSpawn(ROLLUM, EntityRollum::canSpawnOn);
        registerLandSpawn(WORKSHOP_MERCHANT, EntityWorkshopMerchant::canSpawnOn);
        registerLandSpawn(WORKSHOP_TINKERER, EntityWorkshopTinkerer::canSpawnOn);

        //Eden
        registerLandSpawn(BUNNY, EntityBunny::canSpawnOn);
        registerLandSpawn(EDEN_CADILLION, EntityEdenCadillion::canSpawnOn);
        registerLandSpawn(EDEN_TOMO, EntityEdenTomo::canSpawnOn);
        registerLandSpawn(GREENFEET, EntityGreenfeet::canSpawnOn);
        registerLandSpawn(MADIVEL, EntityMadivel::canSpawnOn);
        registerLandSpawn(SUN_ARCHER, EntitySunArcher::canSpawnOn);
        registerLandSpawn(WEAK_CORI, EntityWeakCori::canSpawnOn);

        //Wildwood
        registerLandSpawn(BEHEMOTH, EntityBehemoth::canSpawnOn);
        registerLandSpawn(EPIPHITE, EntityEpiphite::canSpawnOn);
        registerLandSpawn(MAGE, EntityMage::canSpawnOn);
        registerLandSpawn(MOON_WOLF, EntityMoonWolf::canSpawnOn);
        registerLandSpawn(TERMID, EntityTermid::canSpawnOn);
        registerLandSpawn(VEREK, EntityVerek::canSpawnOn);
        registerLandSpawn(WILDWOOD_CADILLION, EntityWildwoodCadillion::canSpawnOn);
        registerLandSpawn(WILDWOOD_GOLEM, EntityWildwoodGolem::canSpawnOn);
        registerLandSpawn(WILDWOOD_TOMO, EntityWildwoodTomo::canSpawnOn);

        //Apalachia
        registerLandSpawn(APALACHIA_CADILLION, EntityApalachiaCadillion::canSpawnOn);
        registerLandSpawn(APALACHIA_GOLEM, EntityApalachiaGolem::canSpawnOn);
        registerLandSpawn(APALACHIA_TOMO, EntityApalachiaTomo::canSpawnOn);
        registerLandSpawn(ENCHANTED_ARCHER, EntityEnchantedArcher::canSpawnOn);
        registerLandSpawn(ENCHANTED_WARRIOR, EntityEnchantedWarrior::canSpawnOn);
        registerLandSpawn(SPELLBINDER, EntitySpellbinder::canSpawnOn);

        //Skythern
        registerLandSpawn(ADVANCED_CORI, EntityAdvancedCori::canSpawnOn);
        registerLandSpawn(MEGALITH, EntityMegalith::canSpawnOn);
        registerLandSpawn(MYSTIC, EntityMystic::canSpawnOn);
        registerLandSpawn(SAMEK, EntitySamek::canSpawnOn);
        registerLandSpawn(SKYTHERN_ARCHER, EntitySkythernArcher::canSpawnOn);
        registerLandSpawn(SKYTHERN_FIEND, EntitySkythernFiend::canSpawnOn);
        registerLandSpawn(SKYTHERN_GOLEM, EntitySkythernGolem::canSpawnOn);

        //Mortum
        registerLandSpawn(ANGRY_BUNNY, EntityAngryBunny::canSpawnOn);
        registerLandSpawn(BASILISK, EntityBasilisk::canSpawnOn);
        registerLandSpawn(DEMON_OF_DARKNESS, EntityDemonOfDarkness::canSpawnOn);
        registerLandSpawn(MORTUM_CADILLION, EntityMortumCadillion::canSpawnOn);
        registerLandSpawn(SORCERER, EntitySorcerer::canSpawnOn);
        registerLandSpawn(SOUL_SPIDER, EntitySoulSpider::canSpawnOn);
        registerLandSpawn(SOUL_STEALER, EntitySoulStealer::canSpawnOn);
        registerLandSpawn(TWILIGHT_ARCHER, EntityTwilightArcher::canSpawnOn);

        //Arcana
        registerLandSpawn(CAPTAIN_MERIK, EntityCaptainMerik::canSpawnOn);
        registerLandSpawn(DATTICON, EntityDatticon::canSpawnOn);
        registerLandSpawn(DEATHCRYX, EntityDeathcryx::canSpawnOn);
        registerLandSpawn(DEATH_HOUND, EntityDeathHound::canSpawnOn);
        registerLandSpawn(DUNGEON_CONSTRUCTOR, EntityCaptainMerik::canSpawnOn);
        registerLandSpawn(DUNGEON_DEMON, EntityDungeonDemon::canSpawnOn);
        registerLandSpawn(DUNGEON_PRISONER, EntityDungeonPrisoner::canSpawnOn);
        registerLandSpawn(FYRACRYX, EntityFyracryx::canSpawnOn);
        registerLandSpawn(GOLEM_OF_REJUVENATION, EntityGolemOfRejuvenation::canSpawnOn);
        registerLandSpawn(KAZARI, EntityKazari::canSpawnOn);
        registerLandSpawn(LEORNA, EntityLeorna::canSpawnOn);
        registerLandSpawn(LORD_VATTICUS, EntityLordVatticus::canSpawnOn);
        registerLandSpawn(LIVING_STATUE, EntityLivingStatue::canSpawnOn);
        registerLandSpawn(PARATIKU, EntityParatiku::canSpawnOn);
        registerLandSpawn(RAZORBACK, EntityRazorback::canSpawnOn);
        registerLandSpawn(ROAMER, EntityRoamer::canSpawnOn);
        registerLandSpawn(SEIMER, EntitySeimer::canSpawnOn);
        registerLandSpawn(WAR_GENERAL, EntityCaptainMerik::canSpawnOn);
        registerLandSpawn(WRAITH, EntityWarGeneral::canSpawnOn);
        registerLandSpawn(ZELUS, EntityWraith::canSpawnOn);
    }

    public static void spawnStuff(BiomeLoadingEvent event) {
        ArrayList<Biome.Category> overworldCats = new ArrayList<>();
        overworldCats.add(Biome.Category.TAIGA);
        overworldCats.add(Biome.Category.EXTREME_HILLS);
        overworldCats.add(Biome.Category.JUNGLE);
        overworldCats.add(Biome.Category.MESA);
        overworldCats.add(Biome.Category.PLAINS);
        overworldCats.add(Biome.Category.SAVANNA);
        overworldCats.add(Biome.Category.ICY);
        overworldCats.add(Biome.Category.BEACH);
        overworldCats.add(Biome.Category.FOREST);
        overworldCats.add(Biome.Category.OCEAN);
        overworldCats.add(Biome.Category.DESERT);
        overworldCats.add(Biome.Category.RIVER);
        overworldCats.add(Biome.Category.SWAMP);
        overworldCats.add(Biome.Category.MUSHROOM);
        Biome.Category biome = event.getCategory();

        if (biome == Biome.Category.THEEND) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ENDER_SPIDER,  2, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ENDER_TRIPLETS,  1, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ENDER_TRIPLETS,  10, 4, 4));
        }
        if (biome == Biome.Category.NETHER) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(HELL_BAT, 50, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(HELL_PIG, 25, 5, 50));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(HELL_SPIDER, 50, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(SCORCHER, 7, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(WILDFIRE, 50, 1, 1));
        }
        if (overworldCats.contains(biome)) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CAVE_CRAWLER, 70, 2, 3));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(CAVECLOPS, 70, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ENDER_SPIDER,  4, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ENTHRALLED_DRAMCRYX, 70, 3, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(JACK_O_MAN, 5, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(MINER, 5, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(RAINBOUR, 1, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ROTATICK, 70, 3, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(THE_EYE, 30, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(THE_GRUE, 30, 1, 4));
        }
        if (biome == Biome.Category.ICY) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(FROST, 50, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(GLACON, 30, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(GLACON, 30, 1, 1));
        }
        if (biome == Biome.Category.DESERT) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(ARID_WARRIOR, 35, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(DESERT_CRAWLER, 50, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(SAGUARO_WORM, 20, 1, 4));
        }
        if (biome == Biome.Category.BEACH) {
            event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(CRAB, 100, 4, 4));
            event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(KING_CRAB, 40, 4, 4));
        }
        if (biome == Biome.Category.JUNGLE) {
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(JUNGLE_BAT, 50, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(JUNGLE_DRAMCRYX, 80, 1, 4));
            event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(JUNGLE_SPIDER , 80, 1, 4));
        }
        if (biome == Biome.Category.PLAINS) {
            event.getSpawns().getSpawner(EntityClassification.MISC).add(new MobSpawnInfo.Spawners(CYCLOPS, 10, 2, 4));
            event.getSpawns().getSpawner(EntityClassification.MISC).add(new MobSpawnInfo.Spawners(KOBBLIN, 5, 1, 1));
        }
        if (biome == Biome.Category.FOREST) {
            event.getSpawns().getSpawner(EntityClassification.MISC).add(new MobSpawnInfo.Spawners(PUMPKIN_SPIDER, 20, 1, 1));
        }
        if (biome == Biome.Category.OCEAN) {
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(LIOPLEURODON, 1, 1, 1));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(SHARK, 2, 1, 2));
            event.getSpawns().getSpawner(EntityClassification.WATER_CREATURE).add(new MobSpawnInfo.Spawners(WHALE, 3, 1, 3));
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void render() {
        EntityRendererManager manager = Minecraft.getInstance().getEntityRenderDispatcher();

        //Projectile
        manager.register(ATTRACTOR, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/blank.png")));
        manager.register(BOUNCING_PROJECTILE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/bouncing_projectile.png")));
        manager.register(CAVE_ROCK, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/cave_rock.png")));
        manager.register(CORI_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/cori_shot.png")));
        manager.register(CORRUPTED_BULLET, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/items/corrupted_bullet.png")));
        manager.register(COLORED_BULLET, new RenderShooterBullet(manager));
        manager.register(DISK, new RenderDisk(manager));
        manager.register(DISSIMENT_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/dissiment_shot.png")));
        manager.register(ARROW_SHOT, new RenderDivineArrow(manager));
        manager.register(ENDER_TRIPLETS_FIREBALL, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/ender_triplets_fireball.png")));
        manager.register(FIREFLY, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/firefly.png")));
        manager.register(FRACTITE_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/fractite_shot.png")));
        manager.register(FROST_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/frost_shot.png")));
        manager.register(FYRACRYX_FIREBALL, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation("minecraft:textures/items/fireball.png")));
        manager.register(GENERALS_STAFF, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/generals_staff.png")));
        manager.register(GRENADE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/items/grenade.png")));
        manager.register(KAZROTIC_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/kazrotic_shot.png")));
        manager.register(KING_OF_SCORCHERS_METEOR, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/king_of_scorchers_meteor.png")));
        manager.register(KING_OF_SCORCHERS_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/king_of_scorchers_shot.png")));
        manager.register(LADY_LUNA_SPARKLER, new RenderShooterBullet(manager));
        manager.register(MANDRAGORA_PROJECTILE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/mandragora_projectile.png")));
        manager.register(MERIKS_MISSILE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/meriks_missile.png")));
        manager.register(METEOR, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/meteor.png")));
        manager.register(PARTICLE_BULLET, new RenderShooterBullet(manager));
        manager.register(RAGLOK_BOMB, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/raglok_bomb.png")));
        manager.register(REFLECTOR, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/blank.png")));
        manager.register(SAGUARO_WORM_SHOT, new RenderSaguaroWormShot(manager));
        manager.register(SCORCHER_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/scorcher_shot.png")));
        manager.register(SERENADE_OF_DEATH, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/serenade_of_death.png")));
        manager.register(SERENADE_OF_ICE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/blank.png")));
        manager.register(SHOOTER_BULLET, new RenderShooterBullet(manager));
        manager.register(SHURIKEN, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/items/shuriken.png")));
        manager.register(SNOWFLAKE_SHURIKEN, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/items/snowflake_shuriken.png")));
        manager.register(SOUL_FIEND_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/blank.png")));
        manager.register(SOUND_OF_CAROLS, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/music.png")));
        manager.register(SOUND_OF_MUSIC, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/music.png")));
        manager.register(SPARKLER, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/sparkler.png")));
        manager.register(STARLIGHT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/starlight.png")));
        manager.register(TWILIGHT_DEMON_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/twilight_demon_shot.png")));
        manager.register(TWILIGHT_MAGE_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/blank.png")));
        manager.register(VILE_STORM, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/items/vile_storm.png")));
        manager.register(WATCHER_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/watcher_shot.png")));
        manager.register(WRECK_BOUNCING_PROJECTILE, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/wreck_bouncing_projectile.png")));
        manager.register(WRECK_EXPLOSIVE_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/wreck_explosive_shot.png")));
        manager.register(WRECK_SHOT, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/wreck_shot.png")));
        manager.register(ZORAGON_BOMB, new RenderDivineProjectile<DivineThrowable>(manager, new ResourceLocation(DivineRPG.MODID, "textures/projectiles/zoragon_bomb.png")));
        manager.register(WILDWOOD_LOG, new RenderWildwoodLog(manager));
        manager.register(FROST_CLOUD, new RenderFrostCloud(manager));

        //Overworld
        manager.register(ARID_WARRIOR, new RenderAridWarrior(manager));
        manager.register(CAVE_CRAWLER, new RenderDivineMob(manager, new ModelCrawler(), new ResourceLocation(DivineRPG.MODID, "textures/entity/cave_crawler.png")));
        manager.register(BROWN_GRIZZLE, new RenderDivineMob(manager, new ModelGrizzle(), new ResourceLocation(DivineRPG.MODID, "textures/entity/brown_grizzle.png")));
        manager.register(CAVECLOPS, new RenderCaveclops(manager));
        manager.register(CRAB, new RenderDivineMob(manager, new ModelCrab(), new ResourceLocation(DivineRPG.MODID, "textures/entity/crab.png")));
        manager.register(CYCLOPS, new RenderCyclops(manager));
        manager.register(DESERT_CRAWLER, new RenderDivineMob(manager, new ModelCrawler(), new ResourceLocation(DivineRPG.MODID, "textures/entity/desert_crawler.png")));
        manager.register(EHU, new RenderDivineMob(manager, new ModelEhu(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ehu.png")));
        manager.register(ENTHRALLED_DRAMCRYX, new RenderDivineMob(manager, new ModelEnthralledDramcryx(), 1.5F, new ResourceLocation(DivineRPG.MODID, "textures/entity/enthralled_dramcryx.png")));
        manager.register(FROST, new RenderDivineMob(manager, new ModelFrost(), 1.5F, new ResourceLocation(DivineRPG.MODID, "textures/entity/frost.png")));
        manager.register(GLACON, new RenderDivineMob(manager, new ModelGlacon(), new ResourceLocation(DivineRPG.MODID, "textures/entity/glacon.png")));
        manager.register(HUSK, new RenderDivineMob(manager, new ModelHusk(), new ResourceLocation(DivineRPG.MODID, "textures/entity/husk.png")));
        manager.register(JACK_O_MAN, new RenderJackOMan(manager));
        manager.register(JUNGLE_BAT, new RenderDivineMob(manager, new ModelJungleBat(), new ResourceLocation(DivineRPG.MODID, "textures/entity/jungle_bat.png")));
        manager.register(JUNGLE_DRAMCRYX, new RenderDivineMob(manager, new ModelDramcryx(), new ResourceLocation(DivineRPG.MODID, "textures/entity/jungle_dramcryx.png")));
        manager.register(JUNGLE_SPIDER, new RenderDivineMob(manager, new ModelJungleSpider(), new ResourceLocation(DivineRPG.MODID, "textures/entity/jungle_spider.png")));
        manager.register(KING_CRAB, new RenderDivineMob(manager, new ModelKingCrab(), 2F, new ResourceLocation(DivineRPG.MODID, "textures/entity/king_crab.png")));
        manager.register(KOBBLIN, new RenderKobblin(manager));
        manager.register(LIOPLEURODON, new RenderDivineMob(manager, new ModelLiopleurodon(), 2F, new ResourceLocation(DivineRPG.MODID, "textures/entity/liopleurodon.png")));
        manager.register(LIVESTOCK_MERCHANT, new RenderDivineMob(manager, new ModelLivestockMerchant(), new ResourceLocation(DivineRPG.MODID, "textures/entity/livestock_merchant.png")));
        manager.register(MINER, new RenderMiner(manager));
        manager.register(PUMPKIN_SPIDER, new RenderDivineMob(manager, new ModelPumpkinSpider(), new ResourceLocation(DivineRPG.MODID, "textures/entity/pumpkin_spider.png"), 0));
        manager.register(RAINBOUR, new RenderDivineMob(manager, new ModelRainbour(), new ResourceLocation(DivineRPG.MODID, "textures/entity/rainbour.png"), 0));
        manager.register(ROTATICK, new RenderDivineMob(manager, new ModelRotatick(), new ResourceLocation(DivineRPG.MODID, "textures/entity/rotatick.png"), 0));
        manager.register(SAGUARO_WORM, new RenderDivineMob(manager, new ModelSaguaroWorm(), new ResourceLocation(DivineRPG.MODID, "textures/entity/saguaro_worm.png"), 0));
        manager.register(SHARK, new RenderShark(manager));
        manager.register(SMELTER, new RenderDivineMob(manager, new ModelStoneGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/smelter.png"), 0));
        manager.register(SNAPPER, new RenderDivineMob(manager, new ModelSnapper(), new ResourceLocation(DivineRPG.MODID, "textures/entity/snapper.png"), 0));
        manager.register(STONE_GOLEM, new RenderDivineMob(manager, new ModelStoneGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/stone_golem.png"), 0));
        manager.register(THE_EYE, new RenderDivineMob(manager, new ModelTheEye(), new ResourceLocation(DivineRPG.MODID, "textures/entity/the_eye.png"), 0));
        manager.register(THE_GRUE, new RenderDivineMob(manager, new ModelTheGrue(), new ResourceLocation(DivineRPG.MODID, "textures/entity/the_grue.png"), 0));
        manager.register(WHALE, new RenderWhale(manager));
        manager.register(WHITE_GRIZZLE, new RenderDivineMob(manager, new ModelGrizzle(), new ResourceLocation(DivineRPG.MODID, "textures/entity/white_grizzle.png")));

        //Nether
        manager.register(HELL_BAT, new RenderDivineMob(manager, new ModelHellBat(), new ResourceLocation(DivineRPG.MODID, "textures/entity/hell_bat.png")));
        manager.register(HELL_PIG, new RenderHellPig(manager));
        manager.register(HELL_SPIDER, new RenderDivineMob(manager, new ModelHellSpider(), new ResourceLocation(DivineRPG.MODID, "textures/entity/hell_spider.png")));
        manager.register(SCORCHER, new RenderDivineMob(manager, new ModelScorcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/scorcher.png")));
        manager.register(WILDFIRE, new RenderWildfire(manager));

        //End
        manager.register(ENDER_SPIDER, new RenderDivineMob(manager, new ModelEnderSpider(), 0.5F, new ResourceLocation(DivineRPG.MODID, "textures/entity/ender_spider.png")));
        manager.register(ENDER_TRIPLETS, new RenderDivineMob(manager, new ModelEnderTriplets(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ender_triplets.png")));
        manager.register(ENDER_WATCHER, new RenderDivineMob(manager, new ModelEnderWatcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ender_watcher.png")));

        //Boss
        manager.register(ANCIENT_ENTITY, new RenderDivineMob(manager, new ModelAncientEntity(), 6F, new ResourceLocation(DivineRPG.MODID, "textures/entity/ancient_entity.png")));
        manager.register(AYERACO_BLUE, new RenderDivineMob(manager, new ModelAyeraco(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ayeraco_blue.png")));
        manager.register(AYERACO_GREEN, new RenderDivineMob(manager, new ModelAyeraco(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ayeraco_green.png")));
        manager.register(AYERACO_RED, new RenderDivineMob(manager, new ModelAyeraco(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ayeraco_red.png")));
        manager.register(AYERACO_PURPLE, new RenderDivineMob(manager, new ModelAyeraco(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ayeraco_purple.png")));
        manager.register(AYERACO_YELLOW, new RenderDivineMob(manager, new ModelAyeraco(), new ResourceLocation(DivineRPG.MODID, "textures/entity/ayeraco_yellow.png")));
        manager.register(DENSOS, new RenderDivineMob(manager, new ModelDensos(), new ResourceLocation(DivineRPG.MODID, "textures/entity/densos.png")));
        manager.register(DRAMIX, new RenderDivineMob(manager, new ModelDramix(), new ResourceLocation(DivineRPG.MODID, "textures/entity/dramix.png")));
        manager.register(ETERNAL_ARCHER, new RenderDivineMob(manager, new ModelEternalArcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/eternal_archer.png")));
        manager.register(EXPERIENCED_CORI, new RenderDivineMob(manager, new ModelExperiencedCori(), new ResourceLocation(DivineRPG.MODID, "textures/entity/experienced_cori.png")));
        manager.register(HIVE_QUEEN, new RenderDivineMob(manager, new ModelHiveQueen(), new ResourceLocation(DivineRPG.MODID, "textures/entity/hive_queen.png")));
        manager.register(KAROT, new RenderDivineMob(manager, new ModelKarot(), new ResourceLocation(DivineRPG.MODID, "textures/entity/karot.png")));
        manager.register(KAROS, new RenderDivineMob(manager, new ModelKaros(), new ResourceLocation(DivineRPG.MODID, "textures/entity/karos.png")));
        manager.register(KING_OF_SCORCHERS, new RenderDivineMob(manager, new ModelKingScorcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/king_of_scorchers.png")));
        manager.register(LADY_LUNA, new RenderDivineMob(manager, new ModelLadyLuna(), new ResourceLocation(DivineRPG.MODID, "textures/entity/lady_luna.png")));
        manager.register(PARASECTA, new RenderDivineMob(manager, new ModelParasecta(), new ResourceLocation(DivineRPG.MODID, "textures/entity/parasecta.png")));
        manager.register(QUADRO, new RenderDivineMob(manager, new ModelQuadro(), new ResourceLocation(DivineRPG.MODID, "textures/entity/quadro.png")));
        manager.register(RAGLOK, new RenderDivineMob(manager, new ModelRaglok(), new ResourceLocation(DivineRPG.MODID, "textures/entity/raglok.png")));
        manager.register(REYVOR, new RenderReyvor(manager));
        manager.register(SOUL_FIEND, new RenderDivineMob(manager, new ModelSoulFiend(), new ResourceLocation(DivineRPG.MODID, "textures/entity/soul_fiend.png")));
        manager.register(SUNSTORM, new RenderDivineMob(manager, new ModelSunstorm(), new ResourceLocation(DivineRPG.MODID, "textures/entity/sunstorm.png")));
        manager.register(TERMASECT, new RenderDivineMob(manager, new ModelTermasect(), 5F, new ResourceLocation(DivineRPG.MODID, "textures/entity/termasect.png")));
        manager.register(THE_WATCHER, new RenderDivineMob(manager, new ModelTheWatcher(), 6F, new ResourceLocation(DivineRPG.MODID, "textures/entity/the_watcher.png")));
        manager.register(TWILIGHT_DEMON, new RenderDivineMob(manager, new ModelTwilightDemon(), new ResourceLocation(DivineRPG.MODID, "textures/entity/twilight_demon.png")));
        manager.register(VAMACHERON, new RenderDivineMob(manager, new ModelVamacheron(), new ResourceLocation(DivineRPG.MODID, "textures/entity/vamacheron.png")));
        manager.register(WRECK, new RenderWreck(manager));

        //Iceika
        manager.register(ALICANTO, new RenderDivineMob(manager, new ModelAlicanto(), new ResourceLocation(DivineRPG.MODID, "textures/entity/alicanto.png")));
        manager.register(FRACTITE, new RenderDivineMob(manager, new ModelFractite(), new ResourceLocation(DivineRPG.MODID, "textures/entity/fractite.png")));
        manager.register(FROST_ARCHER, new RenderFrostArcher(manager));
        manager.register(FROSTY, new RenderDivineMob(manager, new ModelFrosty(), new ResourceLocation(DivineRPG.MODID, "textures/entity/frosty.png")));
        manager.register(GLACIDE, new RenderDivineMob(manager, new ModelGlacide(), new ResourceLocation(DivineRPG.MODID, "textures/entity/glacon.png")));
        manager.register(HASTREUS, new RenderDivineMob(manager, new ModelHastreus(), new ResourceLocation(DivineRPG.MODID, "textures/entity/hastreus.png")));
        manager.register(ROLLUM, new RenderDivineMob(manager, new ModelRollum(), new ResourceLocation(DivineRPG.MODID, "textures/entity/rollum.png")));
        manager.register(WORKSHOP_MERCHANT, new RenderDivineMob(manager, new ModelWorkshop(), new ResourceLocation(DivineRPG.MODID, "textures/entity/workshop_merchant.png")));
        manager.register(WORKSHOP_TINKERER, new RenderDivineMob(manager, new ModelWorkshop(), new ResourceLocation(DivineRPG.MODID, "textures/entity/workshop_tinkerer.png")));

        //Eden
        manager.register(BUNNY, new RenderDivineMob(manager, new ModelBunny(), new ResourceLocation(DivineRPG.MODID, "textures/entity/bunny.png")));
        manager.register(EDEN_CADILLION, new RenderDivineMob(manager, new ModelCadillion(), new ResourceLocation(DivineRPG.MODID, "textures/entity/eden_cadillion.png")));
        manager.register(EDEN_TOMO, new RenderDivineMob(manager, new ModelTomo(), new ResourceLocation(DivineRPG.MODID, "textures/entity/eden_tomo.png")));
        manager.register(GREENFEET, new RenderDivineMob(manager, new ModelGreenfeet(), new ResourceLocation(DivineRPG.MODID, "textures/entity/greenfeet.png")));
        manager.register(MADIVEL, new RenderDivineMob(manager, new ModelMadivel(), new ResourceLocation(DivineRPG.MODID, "textures/entity/madivel.png")));
        manager.register(SUN_ARCHER, new RenderSunArcher(manager));
        manager.register(WEAK_CORI, new RenderDivineMob(manager, new ModelCori(), new ResourceLocation(DivineRPG.MODID, "textures/entity/weak_cori.png")));

        //Wildwood
        manager.register(BEHEMOTH, new RenderDivineMob(manager, new ModelBehemoth(), new ResourceLocation(DivineRPG.MODID, "textures/entity/behemoth.png")));
        manager.register(EPIPHITE, new RenderDivineMob(manager, new ModelEpiphite(), new ResourceLocation(DivineRPG.MODID, "textures/entity/epiphite.png")));
        manager.register(MAGE, new RenderDivineMob(manager, new ModelMage(), new ResourceLocation(DivineRPG.MODID, "textures/entity/mage.png")));
        manager.register(MOON_WOLF, new RenderDivineMob(manager, new ModelMoonWolf(), new ResourceLocation(DivineRPG.MODID, "textures/entity/moon_wolf.png")));
        manager.register(TERMID, new RenderDivineMob(manager, new ModelTermid(), new ResourceLocation(DivineRPG.MODID, "textures/entity/termid.png")));
        manager.register(VEREK, new RenderDivineMob(manager, new ModelSamek(), new ResourceLocation(DivineRPG.MODID, "textures/entity/verek.png")));
        manager.register(WILDWOOD_CADILLION, new RenderDivineMob(manager, new ModelCadillionTEMP(), new ResourceLocation(DivineRPG.MODID, "textures/entity/wildwood_cadillion.png")));
        manager.register(WILDWOOD_GOLEM, new RenderDivineMob(manager, new ModelTwilightGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/wildwood_golem.png")));
        manager.register(WILDWOOD_TOMO, new RenderDivineMob(manager, new ModelTomo(), new ResourceLocation(DivineRPG.MODID, "textures/entity/wildwood_tomo.png")));

        //Apalachia
        manager.register(APALACHIA_CADILLION, new RenderDivineMob(manager, new ModelCadillionTEMP(), new ResourceLocation(DivineRPG.MODID, "textures/entity/apalachia_cadillion.png")));
        manager.register(APALACHIA_GOLEM, new RenderDivineMob(manager, new ModelTwilightGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/apalachia_golem.png")));
        manager.register(APALACHIA_TOMO, new RenderDivineMob(manager, new ModelTomo(), new ResourceLocation(DivineRPG.MODID, "textures/entity/apalachia_tomo.png")));
        manager.register(ENCHANTED_ARCHER, new RenderDivineMob(manager, new ModelEnchantedArcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/enchanted_archer.png"))); //TODO - bow
        manager.register(ENCHANTED_WARRIOR, new RenderEnchantedWarrior(manager));
        manager.register(SPELLBINDER, new RenderDivineMob(manager, new ModelMystic(), new ResourceLocation(DivineRPG.MODID, "textures/entity/spellbinder.png")));

        //Skythern
        manager.register(ADVANCED_CORI, new RenderDivineMob(manager, new ModelCori(), new ResourceLocation(DivineRPG.MODID, "textures/entity/advanced_cori.png")));
        manager.register(MEGALITH, new RenderDivineMob(manager, new ModelMegalith(), new ResourceLocation(DivineRPG.MODID, "textures/entity/megalith.png")));
        manager.register(MYSTIC, new RenderDivineMob(manager, new ModelMystic(), new ResourceLocation(DivineRPG.MODID, "textures/entity/mystic.png")));
        manager.register(SAMEK, new RenderDivineMob(manager, new ModelSamek(), new ResourceLocation(DivineRPG.MODID, "textures/entity/samek.png")));
        manager.register(SKYTHERN_ARCHER, new RenderDivineMob(manager, new ModelTwilightArcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/skythern_archer.png"))); //TODO - bow
        manager.register(SKYTHERN_FIEND, new RenderDivineMob(manager, new ModelSkythernFiend(), new ResourceLocation(DivineRPG.MODID, "textures/entity/skythern_fiend.png")));
        manager.register(SKYTHERN_GOLEM, new RenderDivineMob(manager, new ModelTwilightGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/skythern_golem.png")));

        //Mortum
        manager.register(ANGRY_BUNNY, new RenderDivineMob(manager, new ModelAngryBunny(), new ResourceLocation(DivineRPG.MODID, "textures/entity/angry_bunny.png")));
        manager.register(BASILISK, new RenderDivineMob(manager, new ModelBasilisk(), new ResourceLocation(DivineRPG.MODID, "textures/entity/basilisk.png")));
        manager.register(DEMON_OF_DARKNESS, new RenderDivineMob(manager, new ModelDemonOfDarkness(), new ResourceLocation(DivineRPG.MODID, "textures/entity/demon_of_darkness.png")));
        manager.register(MORTUM_CADILLION, new RenderDivineMob(manager, new ModelCadillionTEMP(), new ResourceLocation(DivineRPG.MODID, "textures/entity/mortum_cadillion.png")));
        manager.register(SORCERER, new RenderDivineMob(manager, new ModelSorcerer(), new ResourceLocation(DivineRPG.MODID, "textures/entity/sorcerer.png")));
        manager.register(SOUL_SPIDER, new RenderDivineMob(manager, new ModelSoulSpider(), new ResourceLocation(DivineRPG.MODID, "textures/entity/soul_spider.png")));
        manager.register(SOUL_STEALER, new RenderDivineMob(manager, new ModelSoulStealer(), new ResourceLocation(DivineRPG.MODID, "textures/entity/soul_stealer.png")));
        manager.register(TWILIGHT_ARCHER, new RenderDivineMob(manager, new ModelTwilightArcher(), new ResourceLocation(DivineRPG.MODID, "textures/entity/twilight_archer.png"))); //TODO - bow

        //Arcana
        manager.register(CAPTAIN_MERIK, new RenderDivineMob(manager, new ModelSamek(), new ResourceLocation(DivineRPG.MODID, "textures/entity/captain_merik.png")));
        manager.register(DATTICON, new RenderDivineMob(manager, new ModelSamek(), new ResourceLocation(DivineRPG.MODID, "textures/entity/datticon.png")));
        manager.register(DEATHCRYX, new RenderDivineMob(manager, new ModelDeathcryx(), new ResourceLocation(DivineRPG.MODID, "textures/entity/deathcryx.png")));
        manager.register(DEATH_HOUND, new RenderDivineMob(manager, new ModelDeathHound(), new ResourceLocation(DivineRPG.MODID, "textures/entity/death_hound.png")));
        manager.register(DUNGEON_CONSTRUCTOR, new RenderDungeonConstructor(manager));
        manager.register(DUNGEON_DEMON, new RenderDivineMob(manager, new ModelDungeonDemon(), new ResourceLocation(DivineRPG.MODID, "textures/entity/dungeon_demon.png")));
        manager.register(DUNGEON_PRISONER, new RenderDivineMob(manager, new ModelDungeonPrisoner(), new ResourceLocation(DivineRPG.MODID, "textures/entity/dungeon_prisoner.png")));
        manager.register(FYRACRYX, new RenderDivineMob(manager, new ModelDeathcryx(), new ResourceLocation(DivineRPG.MODID, "textures/entity/fyracryx.png")));
        manager.register(GOLEM_OF_REJUVENATION, new RenderDivineMob(manager, new ModelRejuvGolem(), new ResourceLocation(DivineRPG.MODID, "textures/entity/golem_of_rejuvenation.png")));
        manager.register(KAZARI, new RenderKazari(manager));
        manager.register(LEORNA, new RenderDivineMob(manager, new ModelLeorna(), new ResourceLocation(DivineRPG.MODID, "textures/entity/leorna.png")));
        manager.register(LORD_VATTICUS, new RenderLordVatticus(manager));
        manager.register(LIVING_STATUE, new RenderLivingStatue(manager));
        manager.register(PARATIKU, new RenderDivineMob(manager, new ModelParatiku(), new ResourceLocation(DivineRPG.MODID, "textures/entity/paratiku.png")));
        manager.register(RAZORBACK, new RenderDivineMob(manager, new ModelRazorback(), new ResourceLocation(DivineRPG.MODID, "textures/entity/razorback.png")));
        manager.register(ROAMER, new RenderDivineMob(manager, new ModelRoamer(), new ResourceLocation(DivineRPG.MODID, "textures/entity/roamer.png")));
        manager.register(SEIMER, new RenderDivineMob(manager, new ModelSeimer(), new ResourceLocation(DivineRPG.MODID, "textures/entity/seimer.png")));
        manager.register(WAR_GENERAL, new RenderDivineMob(manager, new ModelSamek(), new ResourceLocation(DivineRPG.MODID, "textures/entity/war_general.png")));
        manager.register(WRAITH, new RenderDivineMob(manager, new ModelWraith(), new ResourceLocation(DivineRPG.MODID, "textures/entity/wraith.png")));
        manager.register(ZELUS, new RenderZelus(manager));
    }



    private static <T extends Entity> EntityType<T> registerEntity(EntityType.IFactory<T> factory, String entityName, float width, float height, SpawnEggColors colors, EntityClassification classification) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, classification).sized(width, height).setTrackingRange(120).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        Item spawnEgg = new SpawnEggItem(entity, colors.getPrimaryColor(), colors.getSecondaryColor(), (new Item.Properties()).tab(DivineRPG.tabs.spawners)).setRegistryName(entityName +"_spawn_egg");
        SPAWN_EGGS.add(spawnEgg);
        return entity;
    }

    private static <T extends Entity> EntityType<T> registerEntity(EntityType.IFactory<T> factory, String entityName, float width, float height, EntityClassification classification) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, classification).sized(width, height).setTrackingRange(120).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }

    private static <T extends Entity> EntityType<T> registerProjectileNoThrow(EntityType.IFactory<T> factory, String entityName) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MISC).sized(0.5F, 0.5F).setTrackingRange(120).setUpdateInterval(20).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }

    private static <T extends ThrowableEntity> EntityType<T> registerProjectile(EntityType.IFactory<T> factory, String entityName) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MISC).sized(0.25F, 0.25F).setTrackingRange(120).setUpdateInterval(20).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }
    private static <T extends ArrowEntity> EntityType<T> registerArrowProjectile(EntityType.IFactory<T> factory, String entityName) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MISC).sized(0.25F, 0.25F).setTrackingRange(120).setUpdateInterval(20).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }
    private static <T extends FireballEntity> EntityType<T> registerFireballProjectile(EntityType.IFactory<T> factory, String entityName) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MISC).sized(0.25F, 0.25F).setTrackingRange(120).setUpdateInterval(20).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }
    private static <T extends SnowballEntity> EntityType<T> registerSnowballProjectile(EntityType.IFactory<T> factory, String entityName) {
        ResourceLocation location = new ResourceLocation(DivineRPG.MODID, entityName);
        boolean cache = SharedConstants.CHECK_DATA_FIXER_SCHEMA;
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = false;
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MISC).sized(0.25F, 0.25F).setTrackingRange(120).setUpdateInterval(20).build(location.getPath());
        entity.setRegistryName(location);
        SharedConstants.CHECK_DATA_FIXER_SCHEMA = cache;
        ENTITIES.add(entity);
        return entity;
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        for (EntityType entity : ENTITIES) {
            Preconditions.checkNotNull(entity.getRegistryName(), "registryName");
            event.getRegistry().register(entity);
        }
    }
    @SubscribeEvent
    public static void registerSpawnEggs(final RegistryEvent.Register<Item> event) {
        for (Item spawnEgg : SPAWN_EGGS) {
            Preconditions.checkNotNull(spawnEgg.getRegistryName(), "registryName");
            event.getRegistry().register(spawnEgg);
        }
    }
}