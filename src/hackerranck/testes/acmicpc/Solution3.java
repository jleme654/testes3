package hackerranck.testes.acmicpc;

import java.util.Scanner;

/**
 * Version 1.7 - ACM-ICPC concurso
 * 
 * @author Julio Leme
 *
 */
public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhaPessoas = sc.nextInt(), colunaTopicos = sc.nextInt(), num = 0, countSabem = 0, countNaosabem = 0;
		int[][] arr = new int[linhaPessoas][colunaTopicos];

		for (int i = 0; i < linhaPessoas - 1; i++) {
			num = sc.nextInt();
			for (int j = 0; j < colunaTopicos - 1; j++) {
				arr[i][j] = num;
			}
		}
		for (int i = 0; i < linhaPessoas - 1; i++) {
			for (int j = i + 1; j < linhaPessoas; j++) {
				if (arr[i][j] == 1 || arr[j][i] == 1)
					countSabem++;
				else
					countSabem++;
			}
		}
		System.out.println(countSabem);
		System.out.println(countNaosabem);
	}

}
