package main.java.pulsebeat02.renderer.maingui.ingame;

import java.awt.Rectangle;

import javax.swing.JFrame;

import main.java.pulsebeat02.renderer.maingui.ButtonHandler;

public class Background {
	
	static int [][] world;
	
	static int ROWS, COLS;
	static int cellSize = 25;
	
	public static void main(String[] args) {
		
		String settings = "Settings";
	
		JFrame frame = new JFrame("Zombie Game");
	
		@SuppressWarnings("unused")
		ButtonHandler button = new ButtonHandler(frame, settings, null, 50, 50, 60, 60, false, true, true);
	
	}
	
	void drawWorld() {
		
		for (int i = 0; i < world.length; i++) { // Per Row
			
			for (int c = 0; c < world[0].length; c++) { // Per Column
				
			      int x = c * cellSize;
			      int y = c * cellSize;
			      
			      @SuppressWarnings("unused")
				int currentCell = world[i][c];

			      @SuppressWarnings("unused")
				Rectangle draw = new Rectangle(x, y, cellSize, cellSize);
			      
				
			}
			
		}
		
	}
	

	

}
