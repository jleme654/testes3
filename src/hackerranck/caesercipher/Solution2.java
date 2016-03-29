package hackerranck.caesercipher;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		String s = sc.next();
		int separator = sc.nextInt();
		char[] arr = new char[] {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 
				                 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 
				                 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 
				                 's' , 't' , 'u' , 'v' , 'w' , 'x' , 
				                 'y' , 'z' , 'a' , 'b' , 'c'};
		StringBuilder sb = new StringBuilder();
		if (tam == s.length()) {
			for (int i = 0; i < tam; i++) {
				char c = s.charAt(i);
				if (!Character.isLetter(c)) { sb.append(String.valueOf(c)); }
				for (int j = 0; j < arr.length; j++) {
					if (separator >= arr.length/2) {
						System.out.println(s);return;	
					}if (String.valueOf(c).equals(String.valueOf(arr[j]).toUpperCase()))
					    sb.append(String.valueOf(arr[j+separator]).toUpperCase());
					if (String.valueOf(arr[j]).equals(String.valueOf(c))) 
						sb.append(String.valueOf(arr[j+separator]));
				}
			}
		}
		System.out.println(sb.toString());
	}
}
