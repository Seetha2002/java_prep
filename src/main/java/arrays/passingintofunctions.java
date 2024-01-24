package arrays;

import java.util.Arrays;

public class passingintofunctions {
	public static void main(String[] args) {
		int[] nums= {3,2,4,33,55};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));

	}
	static void change(int[] arr) {
		arr[0]=22;
	}

}
