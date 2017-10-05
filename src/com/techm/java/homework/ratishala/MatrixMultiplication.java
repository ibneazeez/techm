public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mul[][] = new int[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				for (int k = 0; k < 3; k++) 
				{
					mul[i][j] = a[i][k] * b[k][j] + mul[i][j];
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mul[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
