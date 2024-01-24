package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class intro {
	public static void main(String[] args) {
		//syntax: datatype[] name=new datatype[size];
		Scanner sc=new Scanner(System.in);
		//array of primitives
		int[] rnos=new int[5];
		int[] rnos1= {20,30,40,50,60};
		int[] ros;//declaration, ros is getting defined in the stack; it occurs at compile time;
		ros=new int[5];//actually here object is being created in the heap memory(actual memory allocation takes place here)
		                 //it occurs at run time;
//		ros[0]=1;
//		ros[1]=2;
//		ros[2]=3;
//		ros[3]=4;
//		ros[4]=5;
//		for(int i=0;i<ros.length;i++) {
//			ros[i]=sc.nextInt();
//		}
//		for(int i=0;i<ros.length;i++) {
//			System.out.println(ros[i]+" ");
//		}
//		for(int num:ros) {    //enhanced for loop(or) for each loop: for every element in the array print the element
//			                  //here num represents the element of the array.
//			System.out.println(num+ " ");
	//}
//		System.out.println(Arrays.toString(ros));
		//array of objects
		String[] names=new String[4];
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		System.out.println(Arrays.toString(names));
		//modify
		names[3]="prem";
		
		System.out.println(Arrays.toString(names));

		}
	
	
	
		//System.out.println(ros[5]);//index out of bound error;
	}


