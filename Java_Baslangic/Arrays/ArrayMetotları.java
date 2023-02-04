package Arrays;

import java.util.Arrays; // Static olduğu için nesne oluşturmadan metot çağırılabilir.

public class ArrayMetotları {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,34,63,11,5,73,8};
		
		double[] dlist = {1.1,2.2,3.5,4.6};
		
		HelperArray helper = new HelperArray();
		
		helper.print(list);
		
		helper.print(dlist);
		
		// Arrays.toString(liste adı)
		System.out.println(Arrays.toString(list));
		
		
		// Arrays.fill(liste adı, elemanların hepsine ne yazacak)
		// Arrays.fill(array, 10)  girilen listenin tüm verilerini 10 sayısına dönüştürür.
		Arrays.fill(list, 2,5,10); // liste arrayindeki elemanlardan 2 ve 5 arasındaki indexleri 10 olarak ata.
		
		
		
		// Arrays.sort(liste adı);
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		// Arrays.binarySearch(liste adı, listede aranan değer);  // listede bulunan bir değerin indisini bulmak için kullanılır.
		
		System.out.println(Arrays.binarySearch(list, 73));
		
		// Arrays.copyOf() ve Arrays.copyOfRange() listeyi başka bir şeye kopyalamak için kullanılır.
		
		int[] copylist = Arrays.copyOf(list, 7);
		System.out.print(Arrays.toString(copylist));
		
		int[] copylist2 = Arrays.copyOfRange(list, 1,7);
		System.out.print(Arrays.toString(copylist));
		
		// Array.equals(array 1 , array 2) listeler birbirlerine eşitler mi yoksa değiller mi kontrol edilir.
		
		// System.out.printlb(Arrays.equals( /* list 1 , list2 */));
		
		
	}

}
