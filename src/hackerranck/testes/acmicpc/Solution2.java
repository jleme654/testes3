package hackerranck.testes.acmicpc;

import java.util.Scanner;

/**
 * Version 1.7 - ACM-ICPC concurso
 * 
 * @author Julio Leme
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhaPessoas = sc.nextInt(),colunaTopicos = sc.nextInt(),countSabem=0, countNaosabem=0;	
		int[][] arr = new int[linhaPessoas][colunaTopicos];
		
		for (int i = 0; i < linhaPessoas; i++) {
			for (int j = 0; j < colunaTopicos; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}		
		}
		
		for (int i = 0; i < linhaPessoas; i++) {
			for (int j = 0; j < colunaTopicos; j++) {
				System.out.print(arr[i][j] + " ");
			} System.out.println();
			
		}
		
		for (int i = 0; i < linhaPessoas-1; i++) {
			for (int j = i+1; j < linhaPessoas; j++) {
				 countSabem += (arr[i][j] == 1 || arr[j][i] == 1) ? 1 : 0;
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				int num = sc.nextInt();
//				arr2[j] = num;
//				arr[i] = arr2;
//			} System.out.println();
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//			    System.out.print(arr2[j]  + " ");	
//			    if (arr[i]==1 && arr2[j]==1) 
//					countSabem++;
//			    else
//			    	countNaosabem++;
//			}
//			System.out.println();
//		}
		
		System.out.println(countSabem);
		System.out.println(countNaosabem);
		
	}

}
