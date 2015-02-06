public abstract class Phone {
	String name;
	String screen;
	String battery;

	abstract void build(String type);
	
	void ship() {
		System.out.println("The phone is on its way!");
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(name);
		if (screen != null) {
			result.append(" with a " + screen);
		}
		if (battery != null) {
			result.append(" and a " + battery);
		}
		return result.toString();
	}
}