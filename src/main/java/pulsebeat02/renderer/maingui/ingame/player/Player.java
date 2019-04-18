package main.java.pulsebeat02.renderer.maingui.ingame.player;

public abstract class Player implements CharacterInterface {
	
	 	protected String name;
	    protected int health;
	    protected int xPos;
	    protected int yPos;
	    protected int zPos;

	    private static int numHumans;

	    public Player (String str, int health, int x, int y, int z) {
	    	
	        this.name = str;
	        this.health = health;
	        this.xPos = x;
	        this.yPos = y;
	        this.zPos = z;
	        numHumans++;
	        
	    }

	    public void move (int x, int y, int z) {
	    	
	        xPos = x;
	        yPos = y;
	        zPos = z;
	        
	    }

	    public int getXPos() {
	    	
	        return xPos;
	        
	    }

	    public int getYPos() {
	    	
	        return yPos;
	        
	    }

	    public void setHealth(int h) {
	    	
	        health = h;
	        
	    }

	    public int getHealth() {
	    	
	        return health;
	        
	    }

	    public void setName(String n) {
	    	
	        name = n;
	        
	    }

	    public String getName() {
	    	
	        return name;
	        
	    }

	    public void setNumHumans(int n) {
	    	
	        numHumans = n;
	        
	    }

	    public static int getNumHumans() {
	    	
	        return numHumans;
	        
	    }

	    // General toString method
	    
	    public String toString() {
	    	
	        String message;
	        
	        if (health <= 0) {
	        	
	            message = "\n[HUMAN]"
	                    + "\n" + name + " is dead.";
	            
	        } else {
	        	
	            message = "xPos: " + xPos
	                    + "\nyPos: " + yPos
	                    + "\nName: " + name
	                    + "\nHealth: " + health;

	        }
	        
	        return message;
	        
	    }

}
