package arrays;

public class max {
	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6,2,0};
		System.out.println(max(arr));
		System.out.println(maxRange(arr,0,3));
	}
	static int max(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int maxvalue=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxvalue) {
				maxvalue=arr[i];
			}
		}
		return maxvalue;
	}
	static int maxRange(int[] arr, int start,int end) {
		if(start>end) {
			return -1;
		}
		if(arr==null) {
			return -1;
		}
		int maxValue=arr[start];
		for(int i=start; i<=end; i++) {
			if(maxValue<arr[i]) {
				maxValue=arr[i];
			}
		}
		return maxValue;
	}

}
