package arrays;

public class DupElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 3, 1,10, 10, 60, 45, 45, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " is a duplicate element");
					break;
				}

			}
		}

	}

}
