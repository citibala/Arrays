
package algorithms.array;

public class OddNumberFinding {

	int input[] = new int[] { 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8 };

	int getOddNumber() {
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			result = result ^ input[i];
		}
		return result;
	}

	public static void main(String[] args) {
		OddNumberFinding obj = new OddNumberFinding();

		System.out.println("Odd Number in the Given Series: " + obj.getOddNumber());
	}
}
