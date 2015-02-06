
public class AndroidStore extends PhoneStore{
	Phone orderPhone(String type) {
		if(type.equals("GalaxyFive")) {
			return new GalaxyFive();
		}
		else if(type.equals("NoteFour")) {
			return new NoteFour();
		}
		else{
			return null;
		}
	}
}
