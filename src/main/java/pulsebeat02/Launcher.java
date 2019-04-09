package main.java.pulsebeat02;

import main.java.pulsebeat02.renderer.maingui.Display;
import main.java.pulsebeat02.renderer.render.GameRenderer;

public class Launcher {
	
	public static void main(String[] args) {
		
		new Display("Zombie Shooter", 800, 700, false, true);
		GameRenderer.main(null);
		
	}

}
