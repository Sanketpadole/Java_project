package Roshan;

public class Program16 {
	public static void main(String[] args) {
		int arr[] = { 4, 89, 88, 21, 5, 8, 9, 66, 80, 65 };
		int temp;
		for (int i = 0; i <= arr.length - 1; i++) {
			temp = arr[0];
			arr[0] = arr[2];
			arr[2] = temp;
			System.out.println(arr[i]);

		}

	}

}

//{1,3,4,5,8,9}