package Baslangic;

import java.util.Scanner;

public class ManavHesap {

	public static void main(String[] args) {
		
		double elma, armut, domates, muz, patlıcan;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaç kilo elma: ");
		elma = input.nextDouble();
		
		System.out.print("Kaç kilo armut: ");
		armut = input.nextDouble();
		
		System.out.print("Kaç kilo patlıcan: ");
		patlıcan = input.nextDouble();
		
		System.out.print("Kaç kilo muz: ");
		muz = input.nextDouble();
		
		System.out.print("Kaç kilo domates: ");
		domates = input.nextDouble();
		
		double armut_kilo = 2.14 * armut;
		double elma_kilo = 3.67 * elma;
		double muz_kilo = 0.95 * muz;
		double patlıcan_kilo = 5.0 * patlıcan;
		double domates_kilo = 1.11 * domates;
		
		
		double hesap = armut_kilo + elma_kilo + muz_kilo + patlıcan_kilo + domates_kilo;
		System.out.print("Toplam hesap: " + hesap);
	}

}
