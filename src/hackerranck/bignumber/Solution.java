package hackerranck.bignumber;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		long sum = 0l;
		for (int i = 0; i < tam; i++) {
			long num = sc.nextLong();
			sum += num;
		}
		System.out.println(sum);
	}
}
