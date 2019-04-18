package main.java.pulsebeat02.renderer.maingui.ingame.weapons;

public abstract class Weapon implements WeaponInterface {
	
	protected String name;
	protected String ammo;
	protected int count;
	protected int rate;
	protected int damage;
	protected int zoom;
	
	Weapon (String name, String ammoType, int ammoCount, int fireRate, int damage, int zoom) {
		
		this.name = name;
		this.ammo = ammoType;
		this.count = ammoCount;
		this.rate = fireRate;
		this.damage = damage;
		this.zoom = zoom;
		
	}
	
	public String getName(String name) {
		
		return name;
		
	}
	
	public void setName(String n) {
		
		name = n;
		
	}
	
	public int ammo(int amount) {
		
		return amount;
		
	}
	
	public void changeAmmoCount(int c) {
		
		count = c;
		
	}
	
	public int fireRate(int rate) {
		
		return rate;
		
	}
	
	public int damage(int damage) {
		
		return damage;
		
	}
	
	public int recoil(int level) {
		
		return level;
		
	}
	
	public int zoom(int fov) {
		
		return fov;
		
	}
	
//	public void typeOfweapon(boolean isPistol, boolean isAssaultRifle, boolean isSniper, boolean isExplosive, boolean miscalanieous) {
//		
//
//	}
	
	public String toString() {
		
		String message;
        	
            message = "Ammo: " + ammo
                    + "Firerate: " + rate
                    + "Damage: " + damage
                    + "\nZoom: " + zoom
                    + "\nName: " + name;
        
        return message;
		
	}
	
	

	
	
	
	
}
