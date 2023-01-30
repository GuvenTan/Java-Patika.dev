package Metot;

public class ReturnVoid {
	
	static int sum(int a, int b) {
		
		return a + b;
	}
	
	static void sum2(int a, int b) { // void metot bir geri dönüş vermediği için atamalarda kullanılamaz. sadece çağılır.
		System.out.print(a + b);
		
	}
	

	public static void main(String[] args) {
		
		// Geriye dönüşü olan metotlar return kullanır.
		// Geriye bir dönüşü olmayan metotlar void kullanır.
		
		System.out.println(sum(879,56));
		
		sum2(4,789);
	}

}
