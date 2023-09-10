package interviewQuestions;

public class StarPatt6 {

	public static void main(String[] args) {
		for(int i = 1; i <=5; i++) {
			for( int j = 1; j<=i;j++) {
				if(!(j%2==0)) {
				System.out.print(i+" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
/*
 * 1
 * 2 *
 * 3 * 3
 * 4 * 4 *
 * 5 * 5 * 5
 */