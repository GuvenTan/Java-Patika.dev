package Baslangic;

public class TemelOperatorler {

	public static void main(String[] args) {
		int a = 5, b =2;
		System.out.println(a+b);
		System.out.println(a*b);

		System.out.println(a-b);

		System.out.println(a/b);

		System.out.println(a%b);
		
		int c = 6, d = 5;
		b += a;  // b = b+a
		b *= a;  // b = b*a

		// Karşılaştırma operatörleri.
		
		boolean sonuc = (1==5);
		sonuc = (1 != 5);
		sonuc = (1<9);
		System.out.println(sonuc);
		
		/* Bağlaçlar (ve veya)
		
	 	ve = &&		
	 	veya = ||  Alt Gr + büyüktür küçüktür
		*/ 
		
		
		// koşul operatörleri

		
		String str = sonuc ? "Doğru" : "Yanlış";
		System.out.print(str);
		
		
	}

}
