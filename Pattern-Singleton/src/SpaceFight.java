
public class SpaceFight {

	public static void main(String[] args) {
		SuperWeapon deathStar = SuperWeapon.getInstance();
		System.out.println(deathStar.getHealth());
		XWing red1 = new XWing();
		XWing red2 = new XWing();
		XWing red3 = new XWing();
		red1.fire();
		System.out.println(deathStar.getHealth());
		red2.fire();
		System.out.println(deathStar.getHealth());
		red3.fire();
		System.out.println(deathStar.getHealth());
		red1.fire();
		System.out.println(deathStar.getHealth());
		red2.fire();
		red3.fire();
		
		
		
		System.out.println("Singleton Design Pattern makes it so only one object of a class can be created!");
		System.out.println("Singleton is extremely easy to debug, and super easy to understand! BUT");
		System.out.println("Singleton classes cannot be subclassed, and (unless creation is delegated to a");
		System.out.println("factory) often have \"too many\" responsibilities. Also, too many synchronized");
		System.out.println("methods will bog down your program with threads fighting for access.");
		
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("Singletons are used for global access points and service providers.");
		System.out.println("For example, they are often used in Loggers (since you really only need one");
		System.out.println("instance of a logger) and managing network connections if your program only");
		System.out.println("needs to access one connection.");
		
		
		
	}

}