package eleminate_duplicate_key_values;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ToEleminateKeysAndValues {
	public static void main(String[] args) {

		int count = 0;
		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, String> uniquMap = new HashMap<String, String>();

		map.put("1", "Nirvigna");
		map.put("2", "Nirvigna");

		map.put("3", "Ranjith");
		map.put("4", "Ranjith");

		map.put("5", "Vignan");
		map.put("6", "Vignan");

		map.put("7", "Swathi");
		map.put("8", "Swathi");

		map.put("9", "Raja Shekar");
		map.put("10", "Raja Shekar");
		Set<Entry<String, String>> keySet = map.entrySet();

		// TreeSet<String> treeSet = new TreeSet<String>(map.values());

		Iterator<Entry<String, String>> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			String value = entry.getValue();
			for (Entry<String, String> entry2 : keySet) {

				if (value.equals(entry2.getValue()) && !uniquMap.containsValue(value)) {
					uniquMap.put(entry2.getKey(), entry2.getValue());

				}
			}

		}
		System.out.println(uniquMap);

	}

}
