package remove_duplicate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "A");
		map.put("2", "B");
		map.put("3", "A");
		map.put("4", "B");
		map.put("5", "C");
		map.put("7", "C");
		System.out.println("this is duplicate values:" + map);

		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		HashMap<String, String> uniqueMap = new HashMap<String, String>();

		while (iterator.hasNext()) {
			String value = iterator.next().getValue();
			for (Entry<String, String> entry : entrySet) {
				if (value.equals(entry.getValue()) && !uniqueMap.containsValue(value)) {

					uniqueMap.put(entry.getKey(), entry.getValue());
				}

			}

		}

		System.out.println(uniqueMap);

	}
}
