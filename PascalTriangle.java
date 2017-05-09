

package algorithms.array;

public class PascalTriangle {

	public static void printPascalTriangle(int rows) {

		for (int i = 0; i < rows; i++) {
			
			for (int space = rows; space > i; space--) {
				System.out.print(" ");
			}
			
			int startNum = 1;
			
			for (int j = 0; j <= i; j++) {
				System.out.print(startNum + " ");
				startNum = startNum * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("\nPascal Triangle: ");
		PascalTriangle.printPascalTriangle(5);
	}
}
