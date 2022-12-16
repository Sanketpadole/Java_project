package Roshan;

public class Program12 {

	public static void main(String[] args) {

		int a[] = { 1, 0, 3, 2, 4, 0, 3, 0 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.print(a[i] + " ");

		}

	}

}
