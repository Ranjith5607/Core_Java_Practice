package book_practice;

public class ReverceImpl {

	public static void main(String[] args) {
		IReverce IReverce = () -> {

			String str = "Ande Ranjith";
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));

			}
			};
			
			IReverce.revere();
	}
}
