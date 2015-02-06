import java.util.List;
import java.util.ArrayList;

public class PCStore {
	private List<Computer> inventory = new ArrayList<Computer>();
	
	public void addComp(Computer comp){
		inventory.add(comp);
	}
	public float getCapital(){
		float capital = 0.0f;
		
		for(Computer comp : inventory){
			capital += comp.price();
		}
		return capital;
	}
	public void listInventory(){
		for(Computer comp : inventory){
			System.out.println(comp.name() + ":");
			System.out.println("Case: " + comp.casing().build());
			System.out.println("Price: " + (float)comp.price());
			System.out.println("");
		}
	}
}
