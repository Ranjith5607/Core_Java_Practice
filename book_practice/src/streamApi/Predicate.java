package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 34, 5, 6, 7, 8, 9);
		List<Integer> collect = asList.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

	}

}
