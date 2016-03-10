package hackerranck.steadygene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamStr = sc.nextInt();
		String str = sc.next();
		Character[] arr = new Character[]{'A','C','T','G'};
		
		ArrayList<Character> listNum = new ArrayList<Character>();
		HashSet<Character> setNum = new HashSet<Character>();
		int countDiv = tamStr / 4;
		int count = 0, countFinal = 0;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		HashSet<HashMap<?,?>> set = new HashSet<HashMap<?,?>>();
		ArrayList<HashMap<?,?>> list = new ArrayList<HashMap<?,?>>();
		for (int i = 0; i < (tamStr - 1); i++) {
			char c = str.charAt(i);
			for (int j = tamStr - 1; j >= 0; j--) {
				char c2 = str.charAt(j);
//				System.out.println(c + " - " + c2);
				if (c == c2) {
					map.put(c, c2);
					set.add(map);list.add(map);
				}
			}
			System.out.println(map);
			System.out.println("----------------------");
		}
		System.out.println(map.size());
		System.out.println(set.size());
		
	}
}
