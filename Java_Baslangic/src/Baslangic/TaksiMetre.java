package Baslangic;

import java.util.Scanner;

public class TaksiMetre {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double net = 10;
		
		System.out.println("Kaç km mesafe katedildi: ");
		double km = input.nextDouble();
		
		double ücret_hesap = km * 2.20;
		
		double son_ücret = (ücret_hesap > 20.0) ? ücret_hesap : 20.0; 
		System.out.println("Total ücret: " + son_ücret);
	}

}
