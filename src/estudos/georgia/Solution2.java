package estudos.georgia;

public class Solution2 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 150; i++) {
			String str = String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}
