package staticexample;
// this example shows how to initialize a static variable
public class staticBlock {
	static int a=4;
	static int b;
	
	static  {                                    //this static block executes only once when the class is first loaded.
		System.out.println("I am Static block");
		b=a*5;
	}
	public static void main(String[] args) {
		System.out.println(staticBlock.a+" "+staticBlock.b);
		System.out.println(staticBlock.a+" "+staticBlock.b);
		staticBlock s1=new staticBlock();
		//System.out.println(staticBlock.a+" "+staticBlock.b);
		staticBlock.b+=5;
		System.out.println(staticBlock.a+" "+staticBlock.b);
//		staticBlock s2=new staticBlock();
	    staticBlock.b+=5;
//
		System.out.println(staticBlock.a+" "+staticBlock.b);



	}
}
