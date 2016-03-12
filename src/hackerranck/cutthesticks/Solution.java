package hackerranck.cutthesticks;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static int getCutStick(int[] arr) {
		int menor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < menor) {
				menor = arr[i];
			}
		}
		return menor;
	}

	static int[] getNewArray(int menor, int[] arr) {
		ArrayList<Object> lista = new ArrayList<Object>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] - menor;
			if (arr[i] > 0) {
				lista.add(arr[i]);
			}
		}
		int tam = lista.size();
		int[] arrNew = new int[tam];
		for (int i = 0; i < lista.size(); i++) {
			arrNew[i] = (int) lista.get(i);
		}
		return arrNew;
	}
	
	static int[] getNewCut(int[] arr){
		int menor = getCutStick(arr);
		int[] arrNew = getNewArray(menor, arr);
		return arrNew;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] arr = new int[total];
		for (int i = 0; i < total; i++) {
			arr[i] = sc.nextInt();
		}
		int tamanho = arr.length;
		System.out.println(tamanho);
		while (tamanho > 0) {
			int[] arrNew = getNewCut(arr);
			tamanho = arrNew.length;
			System.out.println(tamanho);
			if (tamanho == 1) {	break; }
			arr = arrNew;
		}
	}
}
	