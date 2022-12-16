package Roshan;

public class program {
	public static void main(String[] args) {
		String str = "sanket is a good boy";
		String nstr = "";
		char ch;
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			System.out.print(" " + count);
			count++;

		}
	}

}
