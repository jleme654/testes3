package hackerranck.staircase;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		String[][] arr = new String[tam][tam];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = "#";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
