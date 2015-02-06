public class XWing {
	private String name;
	private static int unit;
	private SuperWeapon deathStar = SuperWeapon.getInstance();
	
	public XWing(){
		unit++;
		this.name = "Red " + unit + " ";
	}
	
	public void fire(){
		if(deathStar.getAlive()){
			System.out.println(name + "Firing!");
			deathStar.hit();
			if(deathStar.getFiring() && deathStar.getAlive()){
				System.out.println("That thing is about to fire! " + name + "firing again!");
				deathStar.hit();
			}
			else if(!deathStar.getAlive()){
				System.out.println(name + "breaking off!");
			}
		}
		else if(!deathStar.getAlive()){
			System.out.println(name + "breaking off!");
		}
	}
}
