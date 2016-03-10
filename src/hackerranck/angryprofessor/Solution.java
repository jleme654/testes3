package hackerranck.angryprofessor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int i = 0; i < tests; i++) {
			int numHorarios = sc.nextInt();
			int minPresentes = sc.nextInt();
			int countPresentes = 0;
			for (int j = 0; j < numHorarios; j++) {
				int horario = sc.nextInt();
				if (horario <= 0) {
					countPresentes++;
				}
			}
			if (countPresentes >= minPresentes) 
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
