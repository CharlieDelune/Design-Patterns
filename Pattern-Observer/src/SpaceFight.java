
public class SpaceFight {

	public static void main(String[] args) {
		SuperWeapon deathStar = new SuperWeapon();
		XWing red1 = new XWing(deathStar);
		XWing red2 = new XWing(deathStar);
		XWing red3 = new XWing(deathStar);
		deathStar.setAlive();
		deathStar.move();
		deathStar.move();
		
		
		
		System.out.println("Observers can be added and removed at any time! That's pretty handy!");
		System.out.println("If some new class wants to join in - no problem, the Observable doesn't care!");
		System.out.println("Observables and Observers can be used and changed independently! BUT");
		System.out.println("The pattern can become overly complex for .. like .. no reason.");
		System.out.println("The order of Observer notification is also super unreliable.");
		
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("The Observer Pattern is extremely useful for email notifications!");
		System.out.println("Oh no! Your account has been overdrawn! notifyAllObservers()!");
		System.out.println("EventListeners are already Observers!");
		
		
		
	}

}