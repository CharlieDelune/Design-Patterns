public class SuperWeapon {
	private volatile static SuperWeapon deathStar;
	private int health;
	private boolean firing=false;
	private boolean alive=false;
	private SuperWeapon(){
		this.alive = true;
		this.health = 6;
	}
	public static SuperWeapon getInstance(){
		if(deathStar == null){
			synchronized (SuperWeapon.class){
				if (deathStar == null) {
					deathStar = new SuperWeapon();
				}
			}
		}
		return deathStar;
	}
	public void hit(){
		this.health--;
		if(this.health > 5){
		}
		else if(this.health > 0 && this.health < 5){
			this.firing = true;
		}
		else if (this.health <= 0){
			this.alive = false;
		}
	}
	public boolean getFiring(){
		return this.firing;
	}
	public boolean getAlive(){
		return this.alive;
	}
	public int getHealth(){
		return this.health;
	}
}
