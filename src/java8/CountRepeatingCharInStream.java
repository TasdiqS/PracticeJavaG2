package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatingCharInStream {

	public static void main(String[] args) {
		
		String str = "swiftsepaiso";
		
		Map<String, Integer> hm = new HashMap<String,Integer>();
		
		str.chars()
		.mapToObj(i -> (char)i)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((c,f) -> System.out.println("Character = "+c+" freq = "+f));
	}

}
