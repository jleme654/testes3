package hackerranck.staircase;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		String[][] arr = new String[tam][tam];
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int i2 = arr.length - 1; i2 >= 0; i2--) {
//				System.out.print("["+i +" "+i2 + "]");
				if (i == i2)
					System.out.print(str.append("#"));
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
