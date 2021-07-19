package treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyComparator());
		tm.put(1, "ranjith");
		tm.put(2, "sandeep");
		System.out.println(tm);

	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}
