package Progrm;

public class Pro8 {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 1, 2 };
		int ans[] = new int[arr.length];
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					ans[j] = -2;
					count++;

				}
			}
			if (ans[i] != -2)
				ans[i] = count;

		}
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] != -2) {

				System.out.println(arr[i] + " " + arr[i]);
			}
		}
	}

}
