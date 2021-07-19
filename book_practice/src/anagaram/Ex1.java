package anagaram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex1 {

	static int count = 0;

	public String checkAnagaram(String data) {

		String[] split = data.split(" ");
		
		


		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();


		for (String string : split) {
			count++;

			map.put(count, string);

		}
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			String value = entry.getValue();

			int countMapData=1;

			for (String string : split) {

				if (value.length() != string.length()) {

				}

				else {

					
					char[] charArray1 = string.toLowerCase().toCharArray();
					char[] charArray2 = value.toLowerCase().toCharArray();

					    Arrays.sort(charArray1);
					 
			            Arrays.sort(charArray2);
					if (true==Arrays.equals(charArray1, charArray2)) {

						if (string.equals(value)) {
							

						}
						else {
							
							if (entry.getValue().equals(value)) {
								countMapData++;
							}
						
							
							countMap.put(entry.getValue(), countMapData);
							System.out.println(string + "--------" + value);

							
						}
					}

				}

			}
		}

		System.out.println(map);
		System.out.println(countMap);

		return null;

	}

	public static void main(String[] args) {

		Ex1 ex1 = new Ex1();
		ex1.checkAnagaram("san nas this word ant tna");
	}

}
