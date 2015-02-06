public class AndroidStore extends PhoneStore {

	public Phone orderPhone(String type) {
		Phone phone = null;
		if (type.equals("noteFour")) {
			phone = new NoteFour();
		} else if (type.equals("galFive")) {
			phone = new GalaxyFive();
		}
		System.out.println("Building " + phone.getName());
		phone.build(type);
		phone.ship();
		return phone;
	}
}