package interviewQuestions;

public class StarPatt2 {

	public static void main(String[] args) {

		boolean num;
		for(int i=1;i<=4;i++) {
			
			if(! (i%2==0)) {
				num = true;
			} else {
				num =false;
			}
			
			 for(int j = 1;j<=4;j++) {
				 System.out.print(num? 1+" " : 0+" ");
				 num=!num;
			 }
			 System.out.println();
			 
		}
	}

}
/*1 0 1 0 
  0 1 0 1
  1 0 1 0
  0 1 0 1*/