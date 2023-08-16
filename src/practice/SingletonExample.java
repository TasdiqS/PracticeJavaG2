package practice;

public class SingletonExample {
	/*it is a concept in java that we can create a singleton class
	 * follow 3 steps
	 * 1. create static object inside the class itself
	 * 2. make the constructor private so that nobody outside the class can create the object
	 * 3. create static method getIntance() which will return the object created in the first step
	 * or just use the @Singleton annotation*/
	static Integer num;

	static SingletonExample obj = new SingletonExample(num);
	private SingletonExample(Integer num) {
		num = 1;		
	}
	public static SingletonExample getInstance() {
		return obj;
	}

}
class SingletonExample2{
	public static void main(String[] args) {
		SingletonExample obj1 = SingletonExample.getInstance();
		obj1.num = 5;
		System.out.println("OG "+obj1.num);
	}
}