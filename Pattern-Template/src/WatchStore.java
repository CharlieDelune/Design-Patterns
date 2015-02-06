import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WatchStore {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String band = null;
		String choice = null;
		
		System.out.print("Welcome to the watch store! Would you like digital or analog?");
		try{
			choice = in.readLine();
		}
		catch (IOException ioex){
			System.err.println("No, man. That doesn't compute.");
		}
		if(choice == null) {
			choice = "no";
		}
		System.out.println("Now choose your watchband type! Would you like rubber or silver?");
		try{
			band = in.readLine();
		}
		catch (IOException ioex){
			System.err.println("No, man. That doesn't compute.");
		}
		if(band == null) {
			band = "rubber";
		}
		System.out.println("Cool, thank you!");
		if(choice.toLowerCase().equals("digital")){
			DigitalWatch dw = new DigitalWatch();
			dw.buildWatch(band);
		}
		else if(choice.toLowerCase().equals("analog")){
			AnalogWatch aw = new AnalogWatch();
			aw.buildWatch(band);
		}
		
		System.out.println("The Template Design pattern is pretty self-explanatory!");
		System.out.println("You use a method template defined in a parent class so that subclasses only need to");
		System.out.println("implement small sections of the method that are unique to them.");
		System.out.println("This cuts down on repetition of unnecessary code and makes it easy to add");
		System.out.println("subclasses that will use these methods! BUT");
		System.out.println("It can be difficult to communicate intent since much of the subclass is intentionally");
		System.out.println("left up to inheritance! Additionally, it can be difficult to maintain this pattern,");
		System.out.println("as changes at one level can disturb levels both below and above!");
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("Template Patterns are used frequently to build frameworks. They're also ");
		System.out.println("used in automatic code generation for forum signatures or web page plugins");
		System.out.println("Some people also use them for UI generation, but those people are lazy...");
		System.out.println("Unless someone from our team does that, in which case they're genius!");
		
		
		
		
	}
}
