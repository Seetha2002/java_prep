package singleton;

public class main {
	public static void main(String[] args) {
		singleton obj1= singleton.getInstance();
		singleton obj2= singleton.getInstance();

		singleton obj3= singleton.getInstance();
		
		//three variables refer to the same object.

	}
}
