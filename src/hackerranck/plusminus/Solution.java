package hackerranck.plusminus;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		int[] arr = new int[tam];
		for (int i = 0; i < tam; i++) {
			int num = sc.nextInt();
			arr[i] = num; 
		}
		int positive = 0, negative = 0, zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			}
			if (arr[i] < 0) {
				negative++;
			}
			if (arr[i] == 0) {
				zero++;
			}
		}
		System.out.println(Float.valueOf(String.valueOf(positive))/Double.valueOf(String.valueOf(tam)));
		System.out.println(Float.valueOf(String.valueOf(negative))/Double.valueOf(String.valueOf(tam)));
		System.out.println(Float.valueOf(String.valueOf(zero))/Double.valueOf(String.valueOf(tam)));
	}
}
