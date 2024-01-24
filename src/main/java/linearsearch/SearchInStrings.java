package linearsearch;

import java.util.Arrays;

public class SearchInStrings {
	public static void main(String[] args) {
		String str="Hemasri Seetha";
		char target='S';
		boolean ans=search(str,target);
//		System.out.println(ans);
		System.out.println(Arrays.toString(str.toCharArray()));
	}
	//using for each
	static boolean search2(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(char ch:str.toCharArray()) {//{
			if(ch==target) {
				return true;
			}
		}
		return false;
	}
	static boolean search(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
