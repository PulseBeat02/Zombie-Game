package main.java.pulsebeat02.renderer.maingui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonHandler {
	
	JFrame frame;
	
	JButton button;
		
	private int xPos, yPos, width, height;

	private String text;
	
	private String error = "error";
	
	private boolean isOpaque, isBorderPainted, isClickable;
		
	public ButtonHandler(JFrame frame, String text, String color, int xPos, int yPos, int width, int height, boolean isOpaque, boolean isBorderPainted, boolean isClickable) {
		
		this.frame = frame;
		this.text = text;
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.isOpaque = isOpaque;
		this.isBorderPainted = isBorderPainted;
		this.isClickable = isClickable;
		
		if (frame == null) {
			
			System.out.println(error);
			
		}
		
		else {
			
			createButton();
			
		}
			
	}
		
	public void createButton() {
			
		button = new JButton();
		button.setText(text);
		button.setBounds(xPos, yPos, width, height);
		button.setOpaque(isOpaque);
		button.setBorderPainted(isBorderPainted);
		button.setEnabled(isClickable);
		
		frame.add(button);
		
	}


}
