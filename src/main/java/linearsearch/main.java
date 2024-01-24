package linearsearch;

public class main {
	public static void main(String[] args) {
		int [] nums= {23,45,1,2,8,19,-3,16,-11,28};
		int target=55;
		int ans=linearSearch2(nums,target);
		System.out.println(ans);
	}

//search in the array: return the index if item found otherwise return -1;
static int linearSearch(int[] arr, int target) {
	if(arr.length==0) {
		return -1;
	}
	//run a for loop
	for(int index=0;index<arr.length;index++) {
		//check for element at every index if its is=target]
//		int element=arr[index];
		if(arr[index]==target) {
			return index;
		}
	}
	// this line gets executed if any of the above return statements have not executed hence the target not found
	return -1;
}

//search for the element and return the element
static int linearSearch2(int[] arr, int target) {
	if(arr.length==0) {
		return Integer.MAX_VALUE;
	}
	//run a for loop
	for(int element:arr) {
		//check for element at every index if its is=target]
		if(element==target) {
			return element;
		}
	}
	// this line gets executed if any of the above return statements have not executed hence the target not found
	return Integer.MAX_VALUE;
}
//search for the element and return true or false
static boolean linearSearch3(int[] arr, int target) {
	if(arr.length==0) {
		return false;
	}
	//run a for loop
	for(int index=0;index<arr.length;index++) {
		//check for element at every index if its is=target]
		int element=arr[index];
		if(element==target) {
			return true;
		}
	}
	// this line gets executed if any of the above return statements have not executed hence the target not found
	return false;
}
}
