package count_iterator;

public class CountIterator {

	public int count(String input) {

		if (input.length() == 0 || input == null) {

			return 0;
		}

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals("A")) {

				count++;
			}

		}
		System.out.println(count);

		return count;
	}

	public static void main(String[] args) {

		CountIterator countIterator = new CountIterator();
		countIterator.count("AAAA");

	}
}
