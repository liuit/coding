package test01;

import java.util.Arrays;
/**
 * ��������
 * �����Ȱ���λ���򣬸�λ��ͬ�����ŵ� ͬһ�������У������ǰ�0~9��������
 * ��λ������ɺ󣬰�˳���������ȡ���ŵ�ԭ������
 * Ȼ���λ��ǧλ�����˹������
 * @author Administrator
 *
 */
public class RadixSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,99,2,10,18,7,20};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * ���������㷨
	 * @param arr
	 */
	private static void radixSort(int[] arr) {
		int times = 0;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]+"").length()>times) {
				times=(arr[i]+"").length();
			}
		}
		for (int i = 0,n=1; i < times; i++,n*=10) {
			int[][] temp = new int[10][10];
			int[] addr = new int[10];
			for (int j = 0; j < arr.length; j++) {
				int index = arr[j]/n%10;
				temp[index][addr[index]]=arr[j];
				addr[index]+=1;
			}
			int index = 0;
			for (int j = 0; j < addr.length; j++) {
				if(addr[j]>0) {
					for (int j2 = 0; j2 < addr[j]; j2++) {
						arr[index]=temp[j][j2];
						index++;
					}
				}
			}
		}
		
	}


}
