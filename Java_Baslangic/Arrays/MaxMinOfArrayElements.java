package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinOfArrayElements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen dizinizin eleman sayısını giriniz: ");
		int elements = input.nextInt();
		
		double[] series = new double[elements+1];
		double test = 0;
		
		for (int i = 0; i < elements+1; i++) {

			if (i == elements) {
				System.out.print("Girilen Sayı: ");
				test = input.nextDouble();
				series[i] = test;
			}else {
				System.out.print("Lütfen dizinizin " + (i+1) +". elemanını giriniz: ");
				series[i] = input.nextDouble();
			}
		}
		
		System.out.println("Elemanlarınız girldi.");
		
		Arrays.sort(series);
		
		Arrays.binarySearch(series, series[elements]);
		
		int index = Arrays.binarySearch(series, test);
		
		if (index == 0) {
			System.out.println("Girilen sayıdan büyük en yakın değer: " + series[index + 1]);
			System.out.println("Girilen sayıdan küçük en yakın değer yok");
		}else if (index == elements){
			System.out.println("Girilen sayıdan küçük en yakın değer: " + series[index - 1]);
			System.out.println("Girilen sayıdan büyük en yakın değer yok");
		}else {
			System.out.println("Girilen sayıdan küçük en yakın değer: " + series[index - 1]);
			System.out.println("Girilen sayıdan büyük en yakın değer: " + series[index + 1]);	
		}
		
		
		
		

		

	}

}
