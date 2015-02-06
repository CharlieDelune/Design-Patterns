public abstract class Laptop implements Computer {
	public Case casing(){
		return new SmallCase();
	}
	public abstract float price();
}
