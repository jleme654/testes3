package hackerranck.testes.library;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt(), day2 = sc.nextInt(), month2 = sc.nextInt(),
				year2 = sc.nextInt(), dif = 0, result = 0;

		if (month == month2 && day > day2) {
			dif = day - day2;
			result = 15 * dif;
		}
		if (year == year2 && month > month2) {
			dif = month - month2;
			result = 500 * dif;

		}
		if (year > year2) {
			result = 10000;
		}
		System.out.println(result);
	}

}
