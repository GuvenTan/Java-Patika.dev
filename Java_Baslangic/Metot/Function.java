package Metot;

public class Function {

	static void helloworld() {
		System.out.print("Merhaba Dünya");
	}
	
	static int power(int base, int exp) {
		int result = 1;
		
		for(int i = 1; i <= exp; i++) {
			result *= base;
		}
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int case1 = power(4,2);
		System.out.println(case1);
		
		helloworld();
	}

}
