package main.java.pulsebeat02.renderer.maingui.ingame;

import java.util.Random;

public class BiomeGenerator {
	
	// BIOME ID's
	
	public static int NORMAL_GRASSLAND = 0;
	public static int TEMPERATE_GRASSLAND = 1;
	
	public static int TUNDRA = 2;
	public static int DESSERT = 3;
	
	public static int FRESH_WATER_LAKE = 4;
	public static int FRESH_WATER_SEA = 5;
	public static int FRESH_WATER_OCEAN = 6;
	
	public static int SALT_WATER_LAKE = 7;
	public static int SALT_WATER_SEA = 8;
	public static int SALT_WATER_OCEAN = 9;
	
	public static int CORAL_REEF = 10;
//	public static int ESTUARY = 11;
	
//	public static int CHAPARRAL = 12;
	public static int TAIGA = 13;
	public static int SAVANNA = 14;
	public static int MESA = 15;
	
	public static int SAND_BEACH = 16;
	public static int GRAVEL_BEACH = 17;
	public static int VOLCANIC_BEACH = 18;
	public static int PINK_BEACH = 19;
	
	public static int NORMAL_FOREST = 20;
	public static int TROPICAL_RAINFOREST = 21;
	public static int TEMPERATE_DECIDUOUS_FOREST = 22;
	public static int TEMPERATE_CONIFEROUS_FOREST = 23;
	public static int THORN_FOREST = 24;
	public static int MANGROVE_FOREST = 25;
	public static int SPARSE_FOREST = 26;
	public static int NEEDLE_LEAF_FOREST = 27;
	public static int DECIDOUS_FOREST = 28;
	
	public static int VOLCANO = 29;
	
	public static int SWAMP = 0;
	
	public static int currentBiome = -1;
	
	private String biome_name = "biome_name";
	
	@SuppressWarnings("unused")
	private int Biome_ID = -1;
	
	@SuppressWarnings("unused")
	private double chance = 0;
	
	BiomeGenerator (String name, int Biome_ID, double chance_of_spawn, int [] color, int [] images) {
		
		this.biome_name = name;
		this.Biome_ID = Biome_ID;
		this.chance = chance_of_spawn;
		
		if (biome_name == null) {
			
			this.Biome_ID = Biome_ID;
			this.chance = chance_of_spawn;
			this.biome_name = name;
			
		}
		
	}
	
	int pickRandomBiome () {
		
		Random rand = new Random(); 
		int selected = rand.nextInt(1); 
		
		if (selected < 0.1) return 0;
		
		
//		else if (selected >= 0.1 && selected < 0.15) return 1;
//			
//		
//		else if (selected >= 0.15 && selected < 0.25) return 2;
//			
//		
//		else if (selected >= 0.25 && selected < 0.3) return 3;
//		
//		
//		else if (selected >= 0.3 && selected < 0.35) return 4;
//		
//		
//		else if (selected >= 0.35 && selected < 0.4) return 5;
//		
//		
//		else if (selected >= 0.4 && selected < 0.42) return 4;
//		
//		
//		else if (selected >= 0.42 && selected < 0.5) return 4;
//		
//		
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		
//		
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
//		else if (selected >= 0.25 && selected < 0.3) return 4;
		
		//TUNDRA.chance = 0.05;
		
			
		
		else {
			
			return -1;
			
		}

		
		
	}
	

}








