package Arrays;

public class BHarfi {

	public static void main(String[] args) {

		String[][] B = new String[7][4];
		
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[i].length; j++) {
				
				if(i == 0 || i == 3 || i == 6) {
					B[i][j] = " * ";
				
				}else if (j == 0 || j == 3) {
					B[i][j] = " * ";
					
				}else {
					B[i][j] = "   ";
				}
				
			}
		}
		
		for (String[] row : B) {
			for(String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
