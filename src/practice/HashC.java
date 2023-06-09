package practice;

public class HashC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer j = 1;
		Integer k = 2;

		String s1 = "tasdiq";
		String s11 = new String("tasdiq");
		String s2 = "1";
		System.out.println("j = "+j.hashCode()+"\nS2 = "+s2.hashCode());
		System.out.println(s1.equals(s11));
//		for (Integer i = 0; i <= 10; i++) {
//			System.out.println(i.toString().hashCode());
//		}
	}

}
