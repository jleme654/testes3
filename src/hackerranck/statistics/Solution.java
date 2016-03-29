package hackerranck.statistics;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		double sum = 0, m = 0;
		for (int i = 0; i < n; i++) {
			double test = sc.nextDouble();
			arr[i] = test;
			sum += test;
		}
		m = getMedium(sum, n);
		System.out.println(m);
		System.out.println(getArrMedian(arr, n));
		System.out.println(getMode(arr));
		System.out.println(getStandardDeviaton(arr, m));
	}
	
	static String getStandardDeviaton(double[] arr, double m) {
		double standardDeviation = 0, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			double a = (arr[i] - m);
			sum += Math.pow(a, 2);
		}
		standardDeviation = Math.sqrt(sum/arr.length);
		NumberFormat nf = new DecimalFormat ("###.#", new DecimalFormatSymbols (new Locale ("pt", "BR")));
        String str = nf.format(standardDeviation);
        str = str.replaceAll(",", ".");
		return str;
	}

	static double getMedium(double sum, int n){
		return sum/n;
	}

    static double getArrMedian(double[] arr, int n) {
		double pos = 0, pos2 = 0, average = 0;
		int t = n/2;
		if (n%2==0) {
			pos = arr[t];
			pos2 = arr[t-1];
			average = (pos + pos2)/2;
			return average;
		}
		pos = arr[t+1];
		return pos;
	}
    
    static double getMode(double[] arr){
    	double mode = arr[0];
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i] < mode) {
				mode = arr[i];
			}
		}
    	return mode;
    }
}
