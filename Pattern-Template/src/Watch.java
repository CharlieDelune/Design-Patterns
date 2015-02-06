public abstract class Watch {
	final void buildWatch(String band) {
		addBand(band);
		addBuckle();
		addFace();
	}
	
	void addBand(String band){
		if(band.toLowerCase().equals("rubber")){
			System.out.println("Adding a sweet rubberized watchband!");
		}
		else if(band.toLowerCase().equals("silver")){
			System.out.println("Adding a stunning silver watchband!");
		}
		else {
			System.out.println("This is not working.");
		}
	}
	void addBuckle(){
		System.out.println("Adding a shiny stainless steel watch buckle!");
	}
	abstract void addFace();

}
