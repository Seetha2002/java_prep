package linearsearch;

import java.util.Arrays;

public class SearchIn2DArr {
	public static void main(String[] args) {
		int[][] arr= {
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		int target=56;
		int[] ans=search(arr,target);//format of return value {row,col}
		System.out.println(Arrays.toString(ans));
		//System.out.println(max2(arr));
	}
	static int max(int[][]arr) {
		int ans=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>ans) {
					ans=arr[row][col];
				}
			}
		}
		return ans;
	}
	
	//find maximum using enhanced for loop
	static int max2(int[][]arr) {
		int ans=Integer.MIN_VALUE;
		for(int[] ints:arr) {
			for(int element:ints) {
				if(element>ans) {
					ans=element;
				}
			}
		}
		return ans;
	}
	static int[] search(int[][]arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
