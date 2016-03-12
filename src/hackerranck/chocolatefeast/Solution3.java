package hackerranck.chocolatefeast;

import java.util.Scanner;

public class Solution3 {
	
	static int getResult(int a, int b, int c){
		int result = 0;
		int temp = a/b;
		result = temp;
		if (temp >= c) {
			for (int i = 0; i < temp; i++) {
				int resto = temp%c;
				if (resto==0) {result++; break;}
				result ++;
				temp--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(getResult(a, b, c));
		}
	}
	
}
