package Metot;

public class RecursiveMetot {
	
	static int sum(int x) {
		int result = 0;
		for(int i = 0; i<=x; i++) {
			result += i;
			
		}
		return result;
		
	}
	
	static int sum2(int y) {
		System.out.println(y);
		if(y == 1) {
			return 1;
			
		}
		
		return sum2(y-1) + y;
	}
	
	
	
	public static void main(String[] args) {
		
		//System.out.print(sum(3));
		
		
		System.out.print(sum2(5));
	}

}
