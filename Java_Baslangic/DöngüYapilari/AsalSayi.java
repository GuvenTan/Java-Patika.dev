package DöngüYapilari;

public class AsalSayi {

	public static void main(String[] args) {

		for (int i = 2; i<=100; i++) {
			
			boolean asal = false;
			for(int j = 2; j<i; j++) {
				
				if (i % j == 0) {
					asal = true;
					break;
				}
			}
			if(asal == false) {
				System.out.print(i + "-");
			}
		
		}
	
	}

}
