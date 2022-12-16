package Roshan;

public class Program11 {
	public static void main(String[] args) {

		int a[] = { 1, 0, 3, 2, 4, 0, 3, 0 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			// for (int j = i + 1; j < a.length; j++) {
			// System.out.println(a[i]);
			if (a[i] == 0) {
				temp = a[i];
				// System.out.println("jjj" + temp);
				a[i] = a[i + 1];
				a[i + 1] = temp;

			}
			System.out.println(a[i]);

		}

	}

}
