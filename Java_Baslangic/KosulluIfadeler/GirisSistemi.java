package KosulluIfadeler;

import java.util.Scanner;

public class GirisSistemi {

	public static void main(String[] args) {
		
		String pw, user, g_pw, g_user, new_pw;
		Scanner input = new Scanner(System.in);
		
		user = "admin";
		pw = "gvn991905";
		
		// Giriş
		
		System.out.print("Kullanıcı adını giriniz: ");
		g_user = input.nextLine();

		
		
		if(user.equals(user)) {
			System.out.print("Şifrenizi giriniz: ");
			g_pw = input.nextLine();
			
			if(pw.equals(g_pw)) {
				System.out.print("Giriş yapıldı.");	
				
			}else {
				System.out.print("Yanlış şifre girdiniz.");
				System.out.print("Yeni şifre belirleyiniz");
				new_pw = input.nextLine();
				
				if (new_pw.equals(pw)) {
					System .out.print("şifreniz eskisi ile aynı olamaz.");
				}else {
					System.out.print("Şifreniz değiştirildi.");
				}
			}
			
		}else {
			System.out.print("Yanlış kullanıcı adı girdiniz.");
			
		}

	}

}
