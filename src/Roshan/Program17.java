package Roshan;

public class Program17 {
	public static void main(String[] args) {
		int arr[] = { 9, 1, 4, 2, 8, 7, 3 };
		int temp;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] <= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);

		}
	}

}

//public static void main(String[] args) {
//
//	int a[] = { 12, 3, 4, 5, 6 };
//	int temp;
//
//	for (int i = 0; i < a.length; i++) {
//		for (int j = i + 1; j < a.length; j++) {
//			if (a[i] > a[j]) {
//				temp = a[i];
//				a[i] = a[j];
//				a[j] = temp;
//			}
//
//		}
//		System.out.println(a[i]);
//	}
//}
