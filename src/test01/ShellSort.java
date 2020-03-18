package test01;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 99, 2, 10, 18, 7, 20 };
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void shellSort(int[] arr) {
		//遍历所有步长
		for (int d = arr.length / 2; d > 0; d /= 2) {	
			//遍历后半部分
			for (int j = d; j < arr.length; j++) {
				//遍历前半部分
				for (int i = j-d; i>=0; i-=d) {
					if (arr[i] >= arr[i+d]) {
						int temp = arr[i];
						arr[i] = arr[i+d];
						arr[i+d] = temp;
					}
				}
			}
		}

	}
}
