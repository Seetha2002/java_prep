package BinarySearch;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
	//	int[] arr= {-34,-23,-16,-7,7,8,67,87,99};
		int[] arr= {99,80,75,22,11,10,5,2,-3};
		int target=22;
		int ans=orderagnosticBs(arr,target);
		System.out.println(ans);
	}
	static int orderagnosticBs(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		//find whether the array is sorted in asc or desc
		boolean isAsc=arr[start]<arr[end];
		while(start<=end) {
			//find the middle element
			//int mid=(start+end)/2;//might be possible that (start+end)may exceeds the range of integer in java;
			int mid=start+(end-start)/2;//s+(e-s)/2==>(2s+e-s)/2==>(s+e)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(isAsc) {
				if(target>arr[mid]) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return -1;
	}

}
