package hackerranck.steadygene;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamStr = sc.nextInt();
		String str = sc.next();
		int numCompare = tamStr/4, count = 0, countFinal = 0;
		Character[] arr = new Character[]{'A','C','T','G'};
    	for (int i = 0; i < tamStr; i++) {
			for (int j = 0; j < arr.length; j++) {
				char c = str.charAt(i), c2 = arr[j];
				if (c==c2) {
					System.out.println(c + " - " + c2);
					count++;
					if (count > numCompare) {
						countFinal++;
						c = str.charAt(i-1);
						count = countFinal;
					}
				}
			}
		}
    	System.out.println(countFinal);
	}
}
