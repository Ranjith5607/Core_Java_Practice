package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		System.out.println(ts);

	}

}

class UserSorting implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}