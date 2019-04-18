package main.java.pulsebeat02.renderer.maingui.ingame.weapons;

public interface WeaponInterface {
	
	public String getName();
	
	public void setName(String name);
	
	public int ammo(int amount);
	
	public void changeAmmoCount();
	
	public int fireRate(int rate);
	
	public int damage(int damage);
	
	public int recoil(int level);
	
	public int zoom(int fov);
	
	public void typeOfweapon(boolean isPistol, boolean isAssaultRifle, boolean isSniper, boolean isExplosive, boolean miscalanieous);
	
	public String toString();

}
