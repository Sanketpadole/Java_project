package Roshan;

import java.util.ArrayList;
import java.util.List;

public class Program9 {
	public static void main(String[] args) {
		String str = "Java";
		String nstr = " ";
		String san = "Java is good language";

		char ch;

		List ch1 = new ArrayList();
		for (int i = 0; i <= san.length() - 1; i++) {
			// ch = str.charAt(i);
			san = san.replaceAll("\\s", "");
			System.out.println(san.trim().charAt(i));

		}
	}

}

//System.out.println(san.trim().charAt(i));
