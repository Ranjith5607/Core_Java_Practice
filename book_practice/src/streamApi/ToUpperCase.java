package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
	public static void main(String[] args) {
		List<String> arrayList = Arrays.asList("A", "B", "C", "D");
		List<String> collect = arrayList.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
		List<Integer> collectNumber = numberList.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(collectNumber);

	}

}
