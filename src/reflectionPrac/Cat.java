package reflectionPrac;

public class Cat {

	private final String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void publicVMethod() {
		System.out.println("pv meow");
	}
	
	private void privateVoidMethod() {
		System.out.println("Private void This is private");
	}
	
	public static void publicSvMethod() {
		System.out.println("im public static");
	}
	
	private static void privateSvMethod() {
		System.out.println("im private and static");
	}
}
