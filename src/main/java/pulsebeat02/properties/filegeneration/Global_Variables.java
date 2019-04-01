package main.java.pulsebeat02.properties.filegeneration;

public class Global_Variables {
	
	public static double version = 1.0;
	public static double mouseX = 0.5;
	public static double mouseY = 0.5;
	public static double [] sensitivity = {mouseX, mouseY};
	
	int chosenparticleSetting = 2;
	int chosenlightingSetting = 2;
	
	public static int [] particles = {0, 1, 2}; // 0 - None, 1 - Minimal, 2 - Everything
	public static int [] lighting = {0, 1, 2}; // 0 - None, 1 - Minimal, 2 - Everything
	
	public static double chatHeight = 1.0;
	public static double chatScale = 1.0;
	public static double chatWidth = 1.0;
	
	public static boolean isFullScreen = false;
	public static boolean enableUpdates = true;
	public static boolean enableNarrator = false;
	public static boolean enableMusic = true;
	
	//------------------------------------- Lighting
	
	public static boolean noLighting = false;
	public static boolean minimalLighting = false;
	public static boolean fullLighting = false;
	
	//------------------------------------- Particles
	
	public static boolean noParticles = false;
	public static boolean minimalParticles = false;
	public static boolean fullParticles = false;
	
	{
	
	// Define Arrays (Particles)
	
	if (chosenparticleSetting == 0) {
		
		noParticles = true; 	
		minimalParticles = false; 
		fullParticles = false;
		
	}
	
	if (chosenparticleSetting == 1) {
		
		minimalParticles = true; 
		noParticles = false; 
		fullParticles = false;
		
	}
	
	if (chosenparticleSetting == 2) {
		
		fullParticles = true; 
		minimalParticles = false; 
		noParticles = false;

		}

	}
	
	// Define Arrays (Lighting)
	
	{ 
	
	if (chosenlightingSetting == 0) {
		
		noLighting = true; 	
		minimalLighting = false; 
		fullLighting = false;
		
	}
	
	if (chosenlightingSetting == 1) {
		
		minimalLighting = true; 
		noLighting = false; 
		fullLighting = false;
		
	}
	
	if (chosenlightingSetting == 2) {
		
		fullLighting = true; 
		minimalLighting = false; 
		noLighting = false;

		}

	}

}








