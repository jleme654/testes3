package hackerranck.lisaworkbook;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chap = sc.nextInt();
		int maxpage = sc.nextInt();
		int[] chapArray = new int[chap];
		for (int i = 0; i < chap; i++) {
			chapArray[i] = sc.nextInt();
		}

		int pagenumber = 0;
		int spcount = 0;

		for (int i = 0; i < chap; i++) {

			int problem = chapArray[i];
			pagenumber++;
			for (int j = 1; j <= problem; j++) {
				if ((j - 1) % maxpage == 0 && j != 1) {
					pagenumber++;
				}
				if (pagenumber == j) {
					spcount++;
				}

			}
		}

		System.out.print(spcount);
	}

}
