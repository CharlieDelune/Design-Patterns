public class PerformanceSim {
	public static void main(String[] args){
		Actor robertDowneyJr = new Actor();
		Singer taylorSwift = new Singer();
		Writer georgeRRMartin = new Writer();
		PerformanceArtist writerAdapter = new WriterAdapter(georgeRRMartin);
		System.out.println("Actor:");
		robertDowneyJr.perform();
		robertDowneyJr.showEgo();
		robertDowneyJr.fireManager();
		System.out.println("Singer:");
		taylorSwift.perform();
		taylorSwift.showEgo();
		System.out.println("Uh oh, T-Swiftie made the Billboard Top 10 again...");
		taylorSwift.fireManager();
		writerAdapter.perform();
		writerAdapter.showEgo();
		
		System.out.println("The Adapter Design Pattern is useful for making new classes behave like");
		System.out.println("old classes without rewriting existing code. This can be useful for making");
		System.out.println("existing software work with new vender libraries! Repurpose old code! BUT");
		System.out.println("If you create an adapter for a base class, the base's subclasses can't use it!");
		System.out.println("It can arbitrarily increase code size due to repetition and lack of inheritance.");
		System.out.println("Adaptation chains are possible and a pain in the bum to work with.");
		
		
		System.out.println("And since Jamie wants a real world example:");
		System.out.println("Adapter Pattern is useful for data display. For example, adapters are used to turn");
		System.out.println("XML documentation into tree structure displays.");
		System.out.println("Actually, a lot of data conversion can be done this way! Language translation, too!");
		
		
	}
}
