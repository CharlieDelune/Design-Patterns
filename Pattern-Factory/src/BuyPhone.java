public class BuyPhone {

	public static void main(String[] args) {
		
		AppleStore appleStore = new AppleStore();
		AndroidStore androidStore = new AndroidStore();
		
		Phone phone = appleStore.orderPhone("SixPlus");
		System.out.println("Jamie ordered a: ");
		phone.list();
		
		phone = androidStore.orderPhone("GalaxyFive");
		System.out.println("Jeff ordered a: ");
		phone.list();
		
		
		System.out.println("Factory Patterns are useful because they require minimal changes from");
		System.out.println("the client side to create different objects. Implementing a menu system");
		System.out.println("could even make this faster! BUT");
		System.out.println("Adding new products means writing TWO new classes.");
		System.out.println("Designed for families of products. If the new product doesn't extend a");
		System.out.println("common class, it's difficult to implement in a factory pattern.");
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("The factory pattern is used often when a user can choose a local mode or");
		System.out.println("remote mode for their programs. In local mode, the program may instantiate");
		System.out.println("objects that work on local databases, while remote mode may instantiate objects");
		System.out.println("with more or different behaviors like connecting to remote databases or downloading.");

	}

}
