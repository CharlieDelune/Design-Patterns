public class AppleStore extends PhoneStore {
	
	public Phone orderPhone(String type) {
		Phone phone = null;
		if (type.equals("six")) {
			phone = new IPhoneSix();
		} else if (type.equals("sixPlus")) {
			phone = new IPhoneSixPlus();
		}
		System.out.println("Building " + phone.getName());
		phone.build(type);
		phone.ship();
		return phone;
	}
}