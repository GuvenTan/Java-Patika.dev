package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class HarmonicSeries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen dizinizin eleman sayısını giriniz: ");
		int elements = input.nextInt();
		
		double[] series = new double[elements];
		
		
		for (int i = 0; i < elements; i++) {
			System.out.print("Lütfen dizinizin " + (i+1) +". elemanını giriniz: ");
			series[i] = input.nextDouble(); 
		}
		
		System.out.println("Elemanlarınız girldi.");
		System.out.println(Arrays.toString(series));
		
		double sum = 0;
		
		for(double i : series) {
			sum += 1/i;
		}
		
		System.out.println("Dizinizin Harmonik Ort: " + sum);

	}

}
