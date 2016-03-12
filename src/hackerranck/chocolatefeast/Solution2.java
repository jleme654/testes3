package hackerranck.chocolatefeast;

import java.util.Scanner;

public class Solution2 {
	
	static int getResult(int a, int b, int c){
		int result = 0;
		int temp = a/b;
		result = temp;
		if (temp >= c) {
			for (int i = 0; i < temp; i++) {
				System.out.print("temp: "+temp);
				System.out.print(" sobra: "+c);
				int resto = temp%c;
				System.out.print(" resto: "+resto);
				result ++;
				System.out.println(" result: " + result);
//				if (resto==0) {	break;}	
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
