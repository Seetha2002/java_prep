package BinarySearch;

public class main {
	public static void main(String[] args) {
		int[] arr= {-34,-23,-16,-7,7};
		int target=-34;
		int ans=binarysearch(arr,target);
		System.out.println(ans);
	}
	//return the index
	//return -1 if does not exist
	static int binarysearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			//find the middle element
			//int mid=(start+end)/2;//might be possible that (start+end)may exceeds the range of integer in java;
			int mid=start+(end-start)/2;//s+(e-s)/2==>(2s+e-s)/2==>(s+e)/2;
//			System.out.println(mid);
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else  {
				return mid;
			}
		}
		return -1;
	}
	
	static int binarysearchDesc(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			//find the middle element
			//int mid=(start+end)/2;//might be possible that (start+end)may exceeds the range of integer in java;
			int mid=start+(end-start)/2;//s+(e-s)/2==>(2s+e-s)/2==>(s+e)/2;
//			System.out.println(mid);
			if(target<arr[mid]) {
				start=mid+1;
			}
			else if(target>arr[mid]) {
				end=mid-1;
			}
			else  {
				return mid;
			}
		}
		return -1;
	}

}
