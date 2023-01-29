package DöngüYapilari;

import java.util.Scanner;

public class BaklavaDilimi {

	public static void main(String[] args) {
		 
		Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0 ; i <=n ; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int m = 1 ; m <=n ; m++) {
            for (int l = 0; l < (m); l++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= (2 * (n-m) + 1); s++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

	}

}
