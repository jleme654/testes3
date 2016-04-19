package hackerranck.sherlockandbeast;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int test = sc.nextInt();
			System.out.println(getTest(test));
		}
	}	
	
	static String getTest(int test){
		String str = "";
		if (test==1) {			
			return "-1";
		}
		if (test%3==0) {
			for (int i = 0; i < test; i++) {
				str = str.concat("5");
			}
			return str;
		}
		if (test%5==0) {
			for (int i = 0; i < test; i++) {
				str = str.concat("3");
			}
			return str;
		}
		if (test%3!=0 || test%5!=0) {
			return getResultTest(test);
		}
		return str;
	}
	
	static String getResultTest(int test){
		int pos1 = (test/2+1), pos2 = test/2;
		String str = "";
		for (int i = 0; i < pos1; i++) {
			str = str.concat("5");
		}
		for (int i = 0; i < pos2; i++) {
			str = str.concat("3");
		}
		return str;
	}
}
