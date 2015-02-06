
public class AppleStore extends PhoneStore {
	Phone orderPhone(String type) {
		if(type.equals("Six")) {
			return new IphoneSix();
		}
		else if(type.equals("SixPlus")) {
			return new IphoneSixPlus();
		}
		else {
			return null;
		}
	}
}
