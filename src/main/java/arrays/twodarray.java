package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][];
		int[][] arr1= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2D= {
				{1,2,3},//0th index
				{4,5},// 1st index
				{6,7,8,9}// 2nd index
		};
//		System.out.println(Arrays.toString(arr1[0]));
		//input
		int[][] nums=new int[3][2];
//		System.out.println(nums.length);//gives the no.of rows
		for(int row=0;row<nums.length;row++) {
			for(int col=0;col<nums[row].length;col++) {
				nums[row][col]=sc.nextInt();
			}
		}
		//output
//		for(int row=0;row<nums.length;row++) {
//			for(int col=0;col<nums[row].length;col++) {
//				System.out.println(nums[row][col]);
//			}
//			System.out.println();
//		}
		for(int row=0;row<nums.length;row++) {			
			System.out.println(Arrays.toString(nums[row]));//{{1,2},{3,4},{5,6}}
			
	}
//		//enhanced for loop
//		for(int[] a:nums) {
//			System.out.println(Arrays.toString(a));
//		}
	}
	

}
