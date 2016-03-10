package hackerranck.finddigits;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for (int i = 0; i < total; i++) {
			int num = sc.nextInt(), count = 0;
			String str = String.valueOf(num);
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				int test = Integer.valueOf(String.valueOf(c));
//				System.out.println(test);
				if (test==0) {
					test = Integer.MIN_VALUE;
				}
				if (num%test==0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
