package hackerranck.sherlockandsquares;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long testCases = sc.nextLong(), i = 0;
		for (i = 0; i < testCases; i++) {
			float range1 = sc.nextFloat(), range2 = sc.nextFloat(), result = 0, count = 0;
			for (double j = range1; j <= range2; j++) {
				result = (float) Math.sqrt(j);
				if (j % result == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
