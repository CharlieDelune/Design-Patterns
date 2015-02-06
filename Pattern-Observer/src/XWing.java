import java.util.Observable;
import java.util.Observer;

public class XWing implements Observer {
	private String name;
	Observable observable;
	private static int unit;
	
	public XWing(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
		unit++;
		this.name = "Red " + unit;
	}
	
	public void update(Observable obs, Object arg){
		if(obs instanceof SuperWeapon){
			SuperWeapon deathStar = (SuperWeapon)obs;
			if(deathStar.getAlive()){
				deathStar.hit();
				System.out.println(this.name + " firing! Death Star health at " + deathStar.getHealth());
			}
			if(deathStar.getAlive() && deathStar.getFiring()){
				deathStar.hit();
				System.out.println("That thing is about to fire! " + this.name + " firing again! Death Star health at " + deathStar.getHealth());
			}
			else if(!deathStar.getAlive()){
				System.out.println(this.name + " breaking off, nice shooting boys!");
			}
		}
	}
}
