package hackerranck.timeconvertion;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dataStr = sc.nextLine();
		int hora = Integer.parseInt(dataStr.substring(0, 2));
		String horaStr = "";
		String ampm = dataStr.substring(dataStr.length() - 2, dataStr.length());
		if (hora < 12 && hora > 0 && ampm.equals("PM")) {
			hora = hora + 12;
			horaStr = String.valueOf(hora);
			dataStr = dataStr.replaceAll(dataStr.substring(0, 2), horaStr).replaceAll(ampm, "");
			System.out.println(dataStr);
		}
		if (hora <= 12 && ampm.equals("AM")) {
			horaStr = String.valueOf(hora);
			dataStr = dataStr.replaceAll(dataStr.substring(0, 2), horaStr).replaceAll(ampm, "");
			System.out.println(dataStr);
		}
//		if (hora == 12) {
//			horaStr = "12";
//			dataStr = dataStr.replaceAll(dataStr.substring(0, 2), horaStr).replaceAll(ampm, "");
//			System.out.println(dataStr);
//		}
	}
}
