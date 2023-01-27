package KosulluIfadeler;

public class KosulMain {

	public static void main(String[] args) {
		
		int  a = 5, b = 10, c = 3;
//		System.out.println(a == b); // Eşit mi?
//		System.out.println(a != b); // Eşit değil mi?
//		System.out.println(a >= b);
//...	
		// Mantıksal Operatörler
		
		boolean kosul1 = (a < b);
		System.out.println(kosul1);
		
		boolean kosul2 = (a < c);
		System.out.println(kosul2);
		
		// a sayısı b den küçük ve a sayısı c den büyük.
		
		boolean sonuc = kosul1 && kosul2;
		System.out.println(sonuc);
		
		// a sayısı b den küçük veya a sayısı c den küçük.
		boolean sonuc2 = kosul1 || kosul2;
		System.out.println(sonuc2);
		
	}

}
