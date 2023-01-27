package KosulluIfadeler;

public class IfElse {

	public static void main(String[] args) {
		int a = 10, b =20, c=1;
		
//		boolean compare = a==b;
//		System.out.println(compare);
//		
//		String compare2 = compare ? "Eşit" : "DEğil";
//		System.out.println(compare2);
		
		
		if((a < b) && (a < c)) {
			System.out.println("a en küçük");
		}else if ((b < a ) && (b < c)) {
			System.out.println("b en küçük");
		}else {
			System.out.println("c en küçük");
		}
		
		System.out.println("Program bitti.");
	}

}
