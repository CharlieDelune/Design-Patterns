public class BuildTester {
	public static void main(String[] args){
		InventoryBuilder orderSheet = new InventoryBuilder();
		
		PCStore bestBuyLappys = orderSheet.stockLaptops();
		System.out.println("Laptops: \n");
		bestBuyLappys.listInventory();
		System.out.println("Total Capital: " + bestBuyLappys.getCapital());
		
		System.out.println("\n");
		
		PCStore bestBuyDesks = orderSheet.stockDesktops();
		System.out.println("Desktops: \n");
		bestBuyDesks.listInventory();
		System.out.println("Total Capital: " + bestBuyDesks.getCapital());
		
		System.out.println("Builder Design Pattern is extremely useful when class instantiation requires");
		System.out.println("many parameters to be passed into the constructor or when the class requires");
		System.out.println("many logical steps in the process. It makes only the fully constructed object");
		System.out.println("available to the client, makes constructors much more maintainable, and explicit");
		System.out.println("method calls inform the user exactly what they are passing, BUT");
		System.out.println("Since the Builder needs to copy all fields from the item class, there is");
		System.out.println("code duplication abound!");

		System.out.println("And since Jamie wants a real world example:");
		System.out.println("Builders are already frequently used within Java itself in the form of");
		System.out.println("Stringbuilder. Additionally, they are sometimes used in creation of XML files.");

		
	}
}
