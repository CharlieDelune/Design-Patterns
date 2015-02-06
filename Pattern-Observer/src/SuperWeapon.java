import java.util.Observable;
public class SuperWeapon extends Observable {
	private int health;
	private boolean firing=false;
	private boolean alive=false;
	public SuperWeapon(){
	}
	public void statusChanges(){
		this.setChanged();
		this.notifyObservers();
	}
	public void setAlive(){
		this.health = 9;
		this.alive = true;
		this.statusChanges();
	}
	public void move(){
		this.statusChanges();
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
	public int getHealth(){
		return this.health;
	}
	public boolean getFiring(){
		return this.firing;
	}
	public boolean getAlive(){
		return this.alive;
	}
}
