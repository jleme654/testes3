package hackerranck.steadygene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamStr = sc.nextInt();
		String str = sc.next();
		int numCompare = tamStr/4, count = 0, countFinal = 0;
		Character[] arr = new Character[]{'A','C','T','G'};
//		HashMap<Character, Character> map = new HashMap<Character, Character>();
//		HashSet<HashMap<Character, Character>> set = new HashSet<HashMap<Character, Character>>();
//		ArrayList<HashMap<Character, Character>> list = new ArrayList<HashMap<Character, Character>>();
    	for (int i = 0; i < tamStr; i++) {
			for (int j = 0; j < arr.length; j++) {
				char c = str.charAt(i), c2 = arr[j];
				if (c==c2) {
					count++;
					if (count < numCompare || count > numCompare) {
						countFinal++;
					}
//					System.out.println(c + " - " + c2);
//					map.put(c, c2);
//					System.out.println(map);
//					set.add(map);list.add(map);
				}
			}
		}
    	System.out.println(countFinal);
//    	System.out.println("-----------------------------");
//    	for (HashMap<Character, Character> hashMap : list) {
//			System.out.println(hashMap);
//		}
//    	System.out.println("-----------------------------");
//    	for (HashMap<Character, Character> hashMap : set) {
//			System.out.println(hashMap);
//		}
//    	for (HashMap<Character, Character> hashMap : list) {
//			System.out.println(hashMap);
//		}
//		System.out.println(set.size() + " "+list.size());
	}
}
