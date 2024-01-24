package staticexample;

import oops.override;

class test3{
	String name;
	public test3(String name) {
		this.name = name;
	}		
	@override
	 public String toString() {
		 return name;
	 }
}
public class innerclass {  //outer classes cannot be static
	 class test{
		String name;
		public test(String name) {
			this.name = name;
		}		
	}
	static class test1{
		 String name;
		 public test1(String name) {
				this.name = name;
			}		
	 }
	static class test2{
		 static String name;        //hema---->hema
		 public test2(String name) {//seetha--->seetha
				test2.name = name;
			}	
		 
	 }
	public static void main(String[] args) {
		//test A=new test("Hema");// this gives an error because test is not a static class and it depends on the objects of 
		                        // innerclass;
		test1 A=new test1("Hema");// this works fine because test1 is a static class and it doesnot depend on the
		                          // objects of innerclass
		test1 B=new test1("Seetha");
//		System.out.println(A.name);
//		System.out.println(B.name);
		test2 C=new test2("Hema");
		test2 D=new test2("Seetha");
//		System.out.println(C.name);
//     	System.out.println(D.name);
     	test3 E=new test3("Hema");//eventhough class E is not a static class it can be acceced from the static main class
     	                          // because test 3 is an outer class and it does not depend on objects of any other class.
       // System.out.println(A);//whenever we try to print an object, internally it calls the A.toString Method. But the class 
                              // to which the object A belongs does not have any toString method. Therefore the default toString
                              //method is called which returns classname+@+hashcode;
        System.out.println(E);// E is an object of class test3 and test3 has the toStirng method. therefore whenever we try to
                              //print the object the toString method is called.
        
		
	}

}


