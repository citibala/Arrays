
package algorithms.array;

public class PairSum {

	static int input[] = new int[] { 1, 3, 8, 13, 14, 15, 20, 27, 38 };

	Boolean hasSumInArray(int sum) {
		int left = 0, right = input.length - 1;

		while (left < right) {
			if (input[left] + input[right] == sum)
				return true;
			else if (input[left] + input[right] < sum)
				left++;
			else
				right--;
		}
		return false;
	}

	public static void main(String[] args) {

		PairSum obj = new PairSum();
		System.out.println("\nIs the Given Sum 23 as pair available in: " + obj.hasSumInArray(23));
		System.out.println("Is the Given Sum 50 as pair available in: " + obj.hasSumInArray(50));

	}
}