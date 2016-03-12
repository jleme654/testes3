package hackerranck.inova;

public class Solution {
	public static void main(String[] args) {
		int num = 3749;
		int tam = 2;
		String numStr = String.valueOf(num);
		int[] arr = new int[numStr.length()];
		int[] arr2 = new int[tam];
		for (int i = 0; i < numStr.length(); i++) {
			char c = numStr.charAt(i);
			int numTest = Integer.valueOf(String.valueOf(c));
			arr[i] = numTest;
		}
		int maior = arr[0], pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maior) {
				arr2[pos] = arr[i];
				maior = arr2[pos];
				/*System.out.print(arr2[pos]); */
				pos++;
				if (pos >= tam) {
					break;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
	}

}
