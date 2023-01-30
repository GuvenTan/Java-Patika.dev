package Metot;

public class OverLoading {
	
	static void print() {
		System.out.println("Parametresiz bir metot");
	}
	
	static void print(int a) {
		System.out.println("Parametreli bir metot " + a);
	}

	
	
	public static void main(String[] args) {
		
		print();
		print(324);

	}

}
