package practice;

enum IceCream{
	Vanilla(5), Chocolate(3), Strawberry(2);
	IceCream(int scoops){
		this.scoops=scoops;
	}
	public final int scoops;
}
public class A {

	public static void main(String[] args) {
		IceCream cone = IceCream.Chocolate;
		System.out.println(cone.name()+cone.scoops+cone.ordinal()
		
				 );
	}
		
	}