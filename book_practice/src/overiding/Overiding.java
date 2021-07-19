package overiding;

public class Overiding {

	static void v1(int a) {
		System.out.println("this is parent");

	}
}

class ChildOverding extends Overiding {

	static void v1() {
		System.out.println("this is child");

	}
	static void v1(int a) {
		System.out.println("this is child");

	}

	public static void main(String[] args) {
		Overiding overiding = new ChildOverding();
		overiding.v1(5);

	}

}
