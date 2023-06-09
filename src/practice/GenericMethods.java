package practice;

public class GenericMethods {

	public static void main(String[] a) {

		shout("Tasdiq");
		shout(5);
		shout(3.14);
	}

	// takes any type of parameter and prints it with !!!! can also take multiple
	// generic types by adding it in parameter to accept like <T, U> 
	private static <T> void shout(T a) {
		System.out.println(a + "!!!!");
	}

}
