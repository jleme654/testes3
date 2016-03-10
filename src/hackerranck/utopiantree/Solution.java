package hackerranck.utopiantree;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), count = 0;
		for (int i = 0; i < num; i++) {
			int j = sc.nextInt();
			if (j == 0 || j == 1){
				count++;
			} else {
				int count2 = 0;
				for (int j2 = 0; j2 < j; j2++) {
					if (j2%2!=0 || j2==0) {
						count2++;
					}
					if (j2%2==0) {
						count2 = 2*count2;
					}
				}				
				count = count2;
			}
			System.out.println(count);
		}
	}
}
