public class PhoneOrder {
 
	public static void main(String[] args) {
		PhoneStore aaplStore = new AppleStore();
		PhoneStore andStore = new AndroidStore();
 
		Phone phone = aaplStore.orderPhone("six");
		System.out.println("Kiran ordered a " + phone);
 
		phone = andStore.orderPhone("galFive");
		System.out.println("Sesha ordered a " + phone);

		phone = aaplStore.orderPhone("sixPlus");
		System.out.println("GK ordered a " + phone);
 
		phone = andStore.orderPhone("noteFour");
		System.out.println("Ankit ordered a " + phone);
		
		System.out.println("Abstract Factory patterns are useful for creating whole families");
		System.out.println("of related objects without worrying about what their actual classes are.");
		System.out.println("There's also a metric ton of encapsulation, which is nice. BUT");
		System.out.println("MANY changes must be made to include a new kind of object, and there's a");
		System.out.println("bit of performance degradation that stems from virtual function calling");
		System.out.println("to avoid instantiation of concrete classes from the get-go.");
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("These are useful for providing data to two places.");
		System.out.println("You might have two different data translation classes that inherit their methods");
		System.out.println("from one base class. The data source doesn't change the way the databases receive");
		System.out.println("their data, so the Abstract Factory correctly knows where the data is going");
		System.out.println("without keeping much track of where it's coming from.");
		
		
	}
}
