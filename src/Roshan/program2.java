package Roshan;

public class program2 {
	public static void main(String[] args) {
		String str = "sanket is a good boy";
		String nstr = "";
		char ch;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			// System.out.println(ch);
			if (ch == ' ') {
				System.out.println();

			}

			else {
				count++;
			}

		}
		System.out.print(" " + count);

	}

}
