package hackerranck.timeconvertion;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		int hora = Integer.parseInt(data.substring(0, 2));
		String ampm = data.substring(8, 10);
		if (ampm.equals("PM")) {
			hora = hora + 12;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(String.valueOf(hora)).append(data.substring(2, 8));
		System.out.println(sb.toString());
	}
}
