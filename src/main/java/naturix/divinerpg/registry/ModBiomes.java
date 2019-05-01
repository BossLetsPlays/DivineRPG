package naturix.divinerpg.registry;

import java.util.ArrayList;

import naturix.divinerpg.utils.Reference;
import naturix.divinerpg.world.biomes.BiomeApalachia;
import naturix.divinerpg.world.biomes.BiomeEden;
import naturix.divinerpg.world.biomes.BiomeIceika;
import naturix.divinerpg.world.biomes.BiomeMortum;
import naturix.divinerpg.world.biomes.BiomeSkythern;
import naturix.divinerpg.world.biomes.BiomeWildWood;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModBiomes {
	public static ArrayList<Biome> BIOME_LIST = new ArrayList<Biome>();

	/**public static final Biome Eden = new BiomeEden("biome_eden");
	public static final Biome WildWood = new BiomeWildWood("biome_wildwood");
	public static final Biome Apalachia = new BiomeApalachia("biome_apalachia");
	public static final Biome Skythern = new BiomeSkythern("biome_skythern");
	public static final Biome Mortum = new BiomeMortum("biome_mortum");
	public static final Biome Iceika = new BiomeIceika("biome_iceika");*/
	public static final Biome Eden = new BiomeEden();
	public static final Biome WildWood = new BiomeWildWood();
	public static final Biome Apalachia = new BiomeApalachia();
	public static final Biome Skythern = new BiomeSkythern();
	public static final Biome Mortum = new BiomeMortum();
	public static final Biome Iceika = new BiomeIceika();

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		IForgeRegistry<Biome> registry = event.getRegistry();

        initBiome(Eden, "biome_eden", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        initBiome(WildWood, "biome_wildwood", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        initBiome(Apalachia, "biome_apalachia", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        initBiome(Skythern, "biome_skythern", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        initBiome(Mortum, "biome_mortum", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        initBiome(Iceika, "biome_iceika", BiomeType.WARM, Type.VOID, Type.MAGICAL, Type.SPOOKY);
        

	}

	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
    {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 1024));          //set to large spread
//      BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));            //set to general biome spread
        
        
        return biome;
    }
}