package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamPrac {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 4, 9, 2, 8, 3);
		
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		
		

		nums.stream()
		.filter(i -> i%2==0)
			.map(t->t*2)
				.forEach(i -> System.out.println(i));
	}

}
