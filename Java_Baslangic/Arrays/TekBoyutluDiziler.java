package Arrays;

public class TekBoyutluDiziler {

	public static void main(String[] args) {
		
		double[] list1 = new double[5];
		
		list1[0] = 5.1;
		list1[1] = 6.2;
		list1[2] = 7.3;
		
		System.out.println(list1[2]);
		
		String[] days = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
		
		String[] weekend = new String[] {"Cumartesi", "Pazar"};
		
		for(int i = 0; i<days.length; i++ ) {
			System.out.println(days[i]);
		}
		

	}

}
