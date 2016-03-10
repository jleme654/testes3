package hackerranck.sherlockandsquares;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long testCases = sc.nextLong(), i = 0;
		for (int j = 0; j < testCases; j++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double square = 1;
			i = 1;
			int count = 0;
			while (square <= b) {
				square = Math.pow(i, 2);
				if (square <= b) {
					if (square >= a) {
						count++;
					}
				}
				i++;

			}
			System.out.println(count);
		}
	}
}
