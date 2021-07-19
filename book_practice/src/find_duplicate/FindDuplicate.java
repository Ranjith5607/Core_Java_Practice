package find_duplicate;

import java.util.HashSet;

public class FindDuplicate {
	
	

	public static void main(String[] args) {

		HashSet<String> findDuplicte = new HashSet<String>();
		for (String string : args) {
			findDuplicte.add(string);
			 System.out.println(findDuplicte.size() + " distinct words: " + findDuplicte+":"+string);

		}
		
		
	}

	

}
