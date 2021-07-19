package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamSearch {

	public static void main(String[] args) {
		System.out.println("please search the word ");
		Scanner scanner = new Scanner(System.in);
		String search = scanner.next();
		List<String> asList = Arrays.asList("ranjith", "swathi", "pranitha");
		List<String> collect = asList.stream().filter(p -> p.equals(search)).collect(Collectors.toList());

		if (collect.isEmpty()) {

			System.out.println("search result are not found");
		} else {

			System.out.println("you are search result is :" + collect);

		}

	}
}
