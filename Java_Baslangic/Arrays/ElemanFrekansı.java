package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ElemanFrekansı {
	
    static boolean isFind (int[] array, int value){

        for (int i: array){
            if (i==value){
                return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen dizinizin eleman sayısını giriniz: ");
		int elements = input.nextInt();
		
		int[] series = new int[elements];
		
		
		for (int i = 0; i < elements; i++) {
			System.out.print("Lütfen dizinizin " + (i+1) +". elemanını giriniz: ");
			series[i] = input.nextInt(); 
		}
		
		System.out.println("Elemanlarınız girldi.");
		
		int[] duplicate = new int[series.length];
	    int count=0;
	    
	 
	    int start = 0;
	    for(int i=0; i<series.length; i++){
	    	count=0;
	        if (isFind(duplicate, series[i])) {
	            continue;
	        }else {
	           	for (int j=0; j<series.length; j++){
	            	
	           		if(series[i]==series[j]) {
	            			
	           			count++;	
	               	}
	            }
	            	
            }
	        duplicate[start++]=series[i];
	        System.out.println(series[i] + "'den " + count + " tane var.");
	    }
	}
}

        	
        	
        	
        	
        	

