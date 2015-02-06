import java.util.ArrayList;


public abstract class Phone {
	String name;
	String screenSize;
	String batteryLife;
	ArrayList<String> features = new ArrayList<String>();
	
	public void list(){
		System.out.println(name);
		System.out.println("This phone has a " + screenSize + " screen.");
		System.out.println("This phone has a " + batteryLife + " battery.");
		System.out.println("Other Features:");
		for(int i = 0; i <  features.size();i++) {
			System.out.print(features.get(i) + ", ");
		}
		System.out.println("");
	}

}
