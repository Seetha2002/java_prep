package oops;

public class wrapperclass {
	public static void main(String []args) {
		Integer num1=20;
		Integer num2=40;
		Integer num3=num2;
//		num3=50;
		System.out.println(num2);
		swap(num1, num2);
		System.out.println(num1+" "+num2);// even now the values are not swapped because 
		                                  // integer class is a final class.
		final A hema=new A("sri");
		hema.name="Seetha";
//		hema=new A("Hem");
		A obj;
		for(int i=0;i<=1000000;i++) {
			obj=new A("cc");
		}
		
	}
	static void swap(Integer a, Integer b) {
		Integer temp=a;
		a=b;
		b=temp;
	}
	static class A{
		final int n=10;
		String name;
		A(String name){
			this.name=name;
		}
		@override
		protected void finalize() throws Throwable{
			System.out.println("Destroyed");
		}
	}
}
