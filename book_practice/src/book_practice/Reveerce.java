package book_practice;

public class Reveerce {

	static String str="Ranjith";
	public static void main(String[] args) {
		
		char[] ch=str.toCharArray();
		for (int i = ch.length-1; i >=0;--i) {
			System.out.print(ch[i]);
			
		}

	}
}
