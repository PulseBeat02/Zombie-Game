package main.java.pulsebeat02.renderer.maingui.ingame.player;

public interface Character {
	
	public String getName();
	
	public void setName(String name);
	
	public int weaponHolding(int weapon);
	
	public int setWeapon(int weapon);
	
	public int getHealth();
	
	public void setHealth(int h);
	
	public void move(int x, int y, int z);
	
	public int getXPos();
	
	public int getYPos();
	
	public int getZPos();
	
	public String toString();
	
	
}
