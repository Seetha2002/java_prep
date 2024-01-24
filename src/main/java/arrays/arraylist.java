package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>(5);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(30);
	System.out.println(list);
		//System.out.println(list.contains(23));//checks whether the element is present or not
		list.set(0, 22);
//		System.out.println(list);//update
		list.remove(3);//removes the element at the given index
//		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<>(5);
		//input
		for(int i=0;i<5;i++) {
			list1.add(sc.nextInt());
		}
//		for(int i=0;i<5;i++) {
//			System.out.println(list1.get(i));
//		}
	//	System.out.println(list1);
}

}
