package hackerranck.workbook;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int capitulos = sc.nextInt();
		int maxProblemas = sc.nextInt();
		int testProblemas = 0, erros = 0, paginas = 1;
		for (int i = 1; i <= capitulos; i++) {
			testProblemas = sc.nextInt();
			for (int j = 1; j <= testProblemas; j++) {
				if (j == paginas) {
					erros++;
				}
				if (j%maxProblemas==0) {
					paginas++;
				}
			}		
			if (paginas == testProblemas) 
				paginas = paginas;
			else 
				paginas++;
		}
		System.out.println(erros);
	}
}
