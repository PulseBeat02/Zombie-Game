package main.java.pulsebeat02.renderer.maingui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;
	
	private String title;
	
	private int width, height;
	
	JButton gui;
	
	private boolean isResizable, isVisible;
	
	public Display(String title, int width, int height, boolean isResizable, boolean isVisible) {
		
		this.title = title;
		this.width = width;
		this.height = height;
		this.isResizable = isResizable;
		this.isVisible = isVisible;
		
		createDisplay();
		
	}

	private void createDisplay() {
		// TODO Auto-generated method stub
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(isResizable);
		frame.setLocationRelativeTo(null);
		frame.setVisible(isVisible);
		//frame.add(gui);
		
	}

}







