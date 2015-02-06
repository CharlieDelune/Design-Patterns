public abstract class Desktop implements Computer {
	public Case casing(){
		return new BigCase();
	}
	public abstract float price();
}
