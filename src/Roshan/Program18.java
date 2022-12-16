package Roshan;

public class Program18 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int temp;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 6; j >= i; j--) {
				if (arr[i] <= arr[j] + 1) {
					temp = arr[i];
					arr[i] = arr[j] + 1;

					arr[j] = temp;

				}
				System.out.println(arr[i] - 1);

			}

		}

	}

}
