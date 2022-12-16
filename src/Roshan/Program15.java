package Roshan;

public class Program15 {
	public static void main(String[] args) {

		int arr[] = { 4, 3, 1, 8, 9, 2, 3 };
		int arr1[] = { 1, 3, 2, 4, 3, 0, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr[i]);
				}

			}
		}
	}

}
