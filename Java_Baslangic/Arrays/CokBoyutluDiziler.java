package Arrays;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		
		int[][] matrix = new int[5][5];
		
		int[][] matrix2 = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		};
		
		System.out.println(matrix2[0][4]);
		
		System.out.println(matrix2.length); // bu bize satır sayısını verir.
		
		System.out.println(matrix2[0].length); // matrisin sütun sayısını verir.
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
	}

}
