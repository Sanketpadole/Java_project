package Roshan;

import java.util.ArrayList;
import java.util.List;

public class Program13 {
	public static void main(String[] args) {
		int[] arr = { 3, 42, 5, 7, 8, 7, 33, 7 };
		int temp = 1;
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 7 * (i + 1)) {
				List ad = new ArrayList();
				ad.add(arr[i]);
				System.out.println(ad);

			} else if (arr[i] == 7) {
				List ad = new ArrayList();
				ad.add(arr[i]);

			}

		}

	}
}
