package Arrays;

public class Transpoz {

	public static void main(String[] args) {
		
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] newmat = new int[mat[0].length][mat.length];
		
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				newmat[j][i] = mat[i][j];
			}
		}
		
		for (int i = 0; i < newmat.length; i++) {
			for (int j = 0; j < newmat[0].length; j++) {
				System.out.print(newmat[i][j] + " ");
			}
			System.out.println();
			
		}


	}

}
