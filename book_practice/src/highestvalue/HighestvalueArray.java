package highestvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HighestvalueArray {

	public static void main(String[] args) {

		// this is general logic

		Integer arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		int max = arr[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		System.out.println(max);

		// this is using predefine methods
		List<Integer> data = Arrays.asList(14, 46, 47, 94, 94, 52, 86, 36, 94, 89);
		HashSet<Integer> duplicate = new HashSet<>(data);
		List<Integer> freshData = new ArrayList<>(duplicate);
		Collections.sort(freshData);
		System.out.println(freshData.get(freshData.size() - 1));

	}
}
