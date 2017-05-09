
package algorithms.array;

import java.util.Arrays;

public class ArrayRotation {

	static int input[] = new int[] { 1, 2, 3, 4, 5 };

	public void rotateArray(int[] nums, int n) {

		if (n >= nums.length)
			n = n % nums.length;

		int[] temp = new int[nums.length];

		for (int i = 0; i < n; i++) {
			temp[i] = nums[nums.length - n + i];
		}

		for (int i = n, j = 0; i < nums.length; i++) {
			temp[i] = nums[j];
			j++;
		}
		Arrays.stream(temp).forEach(num -> System.out.print(num + " "));
	}

	public static void main(String[] args) {
		System.out.println("\nArray Before Rotation: ");
		Arrays.stream(input).forEach(num -> System.out.print(num + " "));
		ArrayRotation obj = new ArrayRotation();
		System.out.println("\nArray After Rotation from Left to Right by 2 times: ");
		obj.rotateArray(input, 2);
	}

}
