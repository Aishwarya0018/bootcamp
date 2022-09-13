package oops;

public class MultiDim { // array of arrays

	public static void main(String[] args) {
		int[][] integers = { { 1, 2 }, { 4, 6 }, { 8, 10 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(integers[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
