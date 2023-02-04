package Arrays;

public class array {
	
	
	static void printArray(int[] array) {
		
		for (int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	
	static int[] TersArray(int[] list) {
		
		for (int i = 0; i < list.length; i++) {
			
			//list[(list.length-1) - i] = list[i];
			System.out.println(list[(list.length - 1) - i]);
		}
		
		return list;		
	}
	

	public static void main(String[] args) {
		int[] list = new int[10];
		int list2[] = new int[5];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		
		for (int i = 0; i < list.length; i++) {
			
			//System.out.println(list[i]);
			
		}
		
		int[] list3 = {10,20,30,40,50,60,70,90,100};
	
		//printArray(list3);
		
		
		System.out.print(TersArray(list3));
		
	
	}
	
	

}
