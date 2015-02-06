public class PerformanceSim {
	public static void main(String[] args){
		Actor robertDowneyJr = new Actor();
		Singer taylorSwift = new Singer();
		System.out.println("Actor:");
		robertDowneyJr.showPerformance();
		robertDowneyJr.showEgo();
		robertDowneyJr.fireManager();
		System.out.println("Singer:");
		taylorSwift.showPerformance();
		taylorSwift.showEgo();
		System.out.println("Uh oh, T-Swiftie made the Billboard Top 10 again...");
		taylorSwift.setEgo(new HugeEgo());
		taylorSwift.fireManager();
		taylorSwift.showEgo();
		
		System.out.println("So the benefits of using the Strategy Pattern are:");
		System.out.println("New behaviors can be added without breaking old objects by");
		System.out.println("forcing them to implement behaviors they will never use.");
		System.out.println("Easily extendable, simplified client code... BUT...");
		System.out.println("Client must know of strategies, number of objects increases, and");
		System.out.println("Even simple subclasses must implement behaviors regardless");
		System.out.println("of whether you want to use them or not!");
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("Strategy Pattern is useful for payment types in web transactions!");
		System.out.println("Card input will come from one place, and most cards will have similar behaviors...");
		System.out.println("But the specific behaviors may differ depending on the card!");
		System.out.println("Visa and MasterCard both have security behaviors, but they're implemented differently!");
		
		
	}
}
