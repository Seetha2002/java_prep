package linearsearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evennumber {
	public static void main(String[] args) {
		int []nums= {12,345,2,6,7896};
		//System.out.println(findNumbers(nums));
		System.out.println(digits2(-234));
	}
	static int findNumbers(int[] nums) {
		
		int count=0;
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	//function to check whether number of digits is even or not
	static boolean even(int num) {
		int numberofDigits=digits(num);
		return numberofDigits%2==0;
	}
	//function to count number of digits
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
 static int digits2(int num) {
	 if(num<0) {
			num=num*-1;
		}
	 return (int)(Math.log10(num)+1);
 }
	

}

 