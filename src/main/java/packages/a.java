package packages;
import packages.b;
//import static packages.b.greet;// if we use static keyword in the import statement we can directly import the method and use it
                               //as shown in line 10;  
public class a {
	public static void main(String[] args) {
//		b s=new b();// if the method is not static then the object must be created
//		s.greet();
		b.greet();// since the method is static we can use it without creating any object for the class;
		//greet();
	}
}
