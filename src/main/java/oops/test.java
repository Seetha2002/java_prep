package oops;

public class test { 
	public static void main(String []args) {
		Student s1=new Student("sri",38,54.6f);
//		Student s2=new Student();
		Student s3=new Student("Seetha");
		System.out.println(s3.rno);
//		System.out.println(s1.name);
		Student one=new Student();
		Student two=one;
		final Student s5=new Student();
		s5.name="deepu";
		

	}
	static class Student{
		String name;
		int rno=01;
		float marks;
		
		Student(){
			this.name="venkat";
			this.rno=34;
			this.marks=87.5f;
		}
		Student(String name, int rno, float marks){
			this.name=name;
			this.rno=rno;
			this.marks=marks;
		}
		Student(String name){
			this.name=name;
		}
		Student(Student other){
			this.rno=other.rno;
			this.name=other.name;
			this.marks=other.marks;
		}
	}

}
