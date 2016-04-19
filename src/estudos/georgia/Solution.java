package estudos.georgia;

public class Solution {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <= 300; i++) {
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c=='1') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
