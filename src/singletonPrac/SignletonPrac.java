package singletonPrac;

public class SignletonPrac {

	public static void main(String[] args) {
		// Singleton sObj = new Singleton();
		Singleton sObj = Singleton.getInstance();
	}

}

class Singleton implements Cloneable {
	// without the volatile keyword the double checked locking pattern may not work
	// due to thread caching optimizations
	private static volatile Singleton instance;

	// 1. create a static object in the calss only
	// 2. create private constructor
	private Singleton() {
		/* Using reflection somebody can call the private constructor so we are
		 throwing exception when the constructor is called if the instance already exists*/
		if (instance != null) {
			throw new IllegalStateException("Singletone object already exists, use getInstance() to access it.");
		}
	}

	// create method which will return sObj
	public static Singleton getInstance() {
		// double checked locking pattern is to check instance is null two times for multiple threads
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	// overriding clone() so that nobody creates clone of the Object of Singleton
	// class
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Cloning od singleton OPbjects not supported");
	}
}