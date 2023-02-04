package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sıralama {

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

		
		Arrays.sort(series);
		
		System.out.println("Sıralama: " + Arrays.toString(series));

	}

}
