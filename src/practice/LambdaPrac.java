package practice;

import java.util.function.BiConsumer;

public class LambdaPrac {

	public static void main(String[] args) {
		//Integer a = 9;
		//Integer b = 5;
		
		BiConsumer<Integer, Integer> bi = (a,b) -> System.out.println(a+b);
		bi.accept(7, 9);

	}

}
