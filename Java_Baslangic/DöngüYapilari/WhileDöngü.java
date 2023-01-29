package DöngüYapilari;

import java.util.Scanner;

public class WhileDöngü {

	public static void main(String[] args) {
		
//		int i = 0;
//		
//		while (i <= 10) {
//			
//			System.out.println(i);
//			i++;
//		}
		
		int pw;
		boolean ispw = false;
		Scanner input = new Scanner(System.in);
		
		while (!ispw) {
			System.out.println("Şifre girinniz: ");
			pw = input.nextInt();
			
			if (pw == 1234) {
				System.out.println("Doğru");
				ispw = true;
			}else {
				System.out.println("Yanlış");
			}	
			
		}
		
		
	}

}
