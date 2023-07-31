package practice;

public class RevAString {

	public static void main(String[] args) {

		String s1 = RevAString.recursion("Tasdiq");
		System.out.println(s1);
	}
	
	public static void revString() {
		String s ="tasdiq";
		char[] c = s.toCharArray();
		System.out.print(c);
		
		int left = 0;
		int right = c.length - 1;
		
		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left ++;
			right --;
		}
		System.out.print("|");
		System.out.println(c);
	}
	
	public static void rev1Str() {
		StringBuilder s = new StringBuilder("tasdiq");
		System.out.println("before = "+s);
		for(int i = 0; i<=s.length()-1;i++) {
			System.out.println(i);
			char temp = s.charAt(i);
			s.insert(i, s.charAt(i+1));
			s.insert(i+1, temp);
			System.out.println("===============");
		}
		System.out.println("After = "+s);
	}
	
	public static String recursion(String str) {
		System.out.println(str);
		if(str.isEmpty()) {
			return str;
		}
		System.out.println("will return now");
		System.out.println("substr = "+str.substring(1));
		System.out.println("charAt 0 = "+str.charAt(0));
		return recursion(str.substring(1))+str.charAt(0);
	}
	
	
		
}
