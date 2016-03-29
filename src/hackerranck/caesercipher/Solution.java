package hackerranck.caesercipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = sc.nextInt();
		String str = sc.next();
		int separator = sc.nextInt();
		String[] arr = new String[] {"a" , "b" , "c" , "d" , "e" , "f" , 
                "g" , "h" , "i" , "j" , "k" , "l" , 
                "m" , "n" , "o" , "p" , "q" , "r" , 
                "s" , "t" , "u" , "v" , "w" , "x" , 
                "y" , "z" , "a" , "b" , "c"};
		StringBuilder sb = new StringBuilder();
		if (tam == str.length()) {
			for (int i = 0; i < tam; i++) {
				char c = str.charAt(i);
				List lista = Arrays.asList(arr); 
				ArrayList lista2 = new ArrayList(lista);
				if (lista2.contains(String.valueOf(c))) {
					char c2 = str.charAt(i + separator);
					sb.append(String.valueOf(c2));
				}
			}
		}
		System.out.println(sb.toString());
	}

}
