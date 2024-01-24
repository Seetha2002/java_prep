package oops;

import java.util.Arrays;

public class intro {
	public static void main(String []args) {
//		Student[] students=new Student[5];
//		System.out.println(Arrays.toString(students));
		Student s1=new Student();
		System.out.println(s1.marks);
//		System.out.println(s1.marks);
		Student s2=new Student(10,23.4f,"sri");
//		System.out.println(s2.name);
		Student s3=new Student(s2);
//		System.out.println(s3.marks);
//		Student one=new Student();
//		Student two=one;
//		one.name="sth";
//		System.out.println(two.name);
		
	}
	static class Student{
		int rno;
		float marks=45.6f;
		String name;
		void greet() {
			System.out.println("hi"+" "+this.name);
		}
		void  change(String name) {
			this.name=name;
		}
		Student(){
			this.rno=10;
			this.name="Hema";
			this.marks=83.2f;
		}
//		Student(){
//			this(20,25.6f,"Seetha");
//		}
		Student(int rno, float marks, String name){
			this.rno=rno;
			this.marks=marks;
			this.name=name;
//	
	}
		Student(Student other){
			this.rno=other.rno;
			this.name=other.name;
			this.marks=other.marks;
		}
		
	}

}
