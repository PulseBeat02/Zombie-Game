package main.java.pulsebeat02.renderer.render;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Camera implements KeyListener{
	public double xPos, yPos, xDir, yDir, xPlane, yPlane;
	public boolean left, right, forward, back, up, down;
	public final double MOVE_SPEED = .08;
	public final double ROTATION_SPEED = .045;
	public Camera(double x, double y, double xd, double yd, double xp, double yp) {
		xPos = x;
		yPos = y;
		xDir = xd;
		yDir = yd;
		xPlane = xp;
		yPlane = yp;
	}
	public void keyPressed(KeyEvent event) {
		
	char key = event.getKeyChar();
	
		if ((key == 'a') || (key == 'A')) left = true;
		else if ((key == 'd') || (key == 'D')) right = true;
		else if ((key == 'w') || (key == 'W')) forward = true;
		else if ((key == 's') || (key == 'S')) back = true;
		
	}
	public void keyReleased(KeyEvent event) {
		
		char key = event.getKeyChar();
		
		if ((key == 'a') || (key == 'A')) left = false;
		else if ((key == 'd') || (key == 'D')) right = false;
		else if ((key == 'w') || (key == 'W')) forward = false;
		else if ((key == 's') || (key == 'S')) back = false;
		
	}
	
	public void mouseMoved(int x, int y) {
		
		Point p = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		
		if (x > p.x) {
			
			right = true;
			
		}
		
		else if (x < p.x) {
			
			left = true;
			
		}
		
		else if (y > p.y) {
			
			up = true;
			
		}
		
		else if (y < p.y) {
			
			down = true;
			
		}

	}
	
	public void update(int[][] map) {
		
		if(forward) {
			if(map[(int)(xPos + xDir * MOVE_SPEED)][(int)yPos] == 0) {
				xPos+=xDir*MOVE_SPEED;
			}
			if(map[(int)xPos][(int)(yPos + yDir * MOVE_SPEED)] == 0)
				yPos+=yDir*MOVE_SPEED;
		}
		
		if(back) {
			if(map[(int)(xPos - xDir * MOVE_SPEED)][(int)yPos] == 0)
				xPos-=xDir*MOVE_SPEED;
			if(map[(int)xPos][(int)(yPos - yDir * MOVE_SPEED)]== 0)
				yPos-=yDir*MOVE_SPEED;
		}
		
		if(right) {
			double oldxDir=xDir;
			xDir=xDir*Math.cos(-ROTATION_SPEED) - yDir*Math.sin(-ROTATION_SPEED);
			yDir=oldxDir*Math.sin(-ROTATION_SPEED) + yDir*Math.cos(-ROTATION_SPEED);
			double oldxPlane = xPlane;
			xPlane=xPlane*Math.cos(-ROTATION_SPEED) - yPlane*Math.sin(-ROTATION_SPEED);
			yPlane=oldxPlane*Math.sin(-ROTATION_SPEED) + yPlane*Math.cos(-ROTATION_SPEED);
		}
		
		if(left) {
			double oldxDir=xDir;
			xDir=xDir*Math.cos(ROTATION_SPEED) - yDir*Math.sin(ROTATION_SPEED);
			yDir=oldxDir*Math.sin(ROTATION_SPEED) + yDir*Math.cos(ROTATION_SPEED);
			double oldxPlane = xPlane;
			xPlane=xPlane*Math.cos(ROTATION_SPEED) - yPlane*Math.sin(ROTATION_SPEED);
			yPlane=oldxPlane*Math.sin(ROTATION_SPEED) + yPlane*Math.cos(ROTATION_SPEED);
		}
	}
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
