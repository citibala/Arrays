

package algorithms.array;

public class RowAndColumnWiseSortedMatrix {

	static int input[][] = { { 15, 20, 25 }, { 30, 40, 50 }, { 60, 80, 90 } };

	Boolean searchElement(int m, int n, int element) {
		int i = 0, j = n - 1;

		while (i < n && j >= 0) {
			if (input[i][j] == element) {
		 System.out.println("\nThe Element is found at input[" + i + "" + j+"]");
				return true;
			}
			if (input[i][j] > element)
				j--;
			else
				i++;
		}
		return false;
	}

	public static void main(String[] args) {

		RowAndColumnWiseSortedMatrix obj = new RowAndColumnWiseSortedMatrix();

		if (!obj.searchElement(3, 3, 23)) {
			System.out.println("\nElement is not found in the Matrix");
		}
		if (!obj.searchElement(3, 3, 40)) {
			System.out.println("\nElement is not found in the Matrix");
		}

	}

}
