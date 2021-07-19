package exception;

public class OwnExcepation {

	public static void main(String[] args) {

		try {

			throw new Ranjith("this is Ranjith exception");

		} catch (Ranjith e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
