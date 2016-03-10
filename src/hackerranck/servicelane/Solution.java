package hackerranck.servicelane;

import java.util.Scanner;

public class Solution {

	static int bike = 1, car = 2, truck = 3;

	static int getVehicle(int indexVehicle) {
		switch (indexVehicle) {
		case 1:
			return bike;
		case 2:
			return car;
		case 3:
			return truck;
		default:
			break;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamArr = sc.nextInt(), testCases = sc.nextInt();
		int[] arr = new int[tamArr];
		int width = 0;
		for (int i = 0; i < arr.length; i++) {
			width = sc.nextInt();
			arr[i] = width;
		}
		for (int i = 0; i < testCases; i++) {
			int position1 = sc.nextInt();
			int position2 = sc.nextInt();
			int menor = arr[position1];
			for (int j = position1; j <= position2; j++) {
				if (arr[j] <= menor) {
					menor = arr[j];
				}
			}
			System.out.println(getVehicle(menor));
		}

	}
}
