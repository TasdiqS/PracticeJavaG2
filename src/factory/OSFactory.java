package factory;

public class OSFactory {

	public OS getInstance(String str) {
		if (str.equals("Galaxy")) {
			return new Android();
		} else if (str.equals("iPhone")) {
			return new IOS();
		} else
			return new Windows();
	}
}
