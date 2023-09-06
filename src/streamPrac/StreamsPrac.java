package streamPrac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsPrac {

	public static void main(String[] args) {
		filterPra();
		mapPra();
	}

	public static void filterPra() {
		List<Integer> nums = Arrays.asList(1, 4, 9, 2, 8, 3);
		// only print even elements
		// Predicate is a functional interface which has test() abstract method
		// and retruns true or false.
		Stream<Integer> data = nums.stream();
		Predicate<Integer> predi = new Predicate<Integer>() {
			@Override
			// we are creating anonymous inner class here
			public boolean test(Integer n) {
				if (n % 2 == 0) {
					return true;
				} else
					return false;
			}
		};
		// filter takes Predicate type as parameter
		Stream<Integer> filteredData = data.filter(predi);
		filteredData.forEach(System.out::print);
		// nums.stream().filter(i -> i%2==0).forEach(i -> System.out.println(i));
	}

	public static void mapPra() {
		List<Integer> nums = Arrays.asList(1, 4, 9, 2, 8, 3);
		Stream<Integer> data = nums.stream();
		// multiply all elements by 2
		// functions is functionsl interface which has apply
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer n) {
				return n * 2;
			}
		};
		// map accepts Function type parameter
		Stream<Integer> mappedData = data.map(fun);
		mappedData.forEach(System.out::print);
	}

}
