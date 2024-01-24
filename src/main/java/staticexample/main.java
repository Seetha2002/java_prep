package staticexample;

public class main {

	public static void main(String[] args) {
		human Hema=new human(21,"Hema",10000);
		human Seetha=new human(20,"Seetha",12000);
		System.out.println(human.population);
//		System.out.println(Seetha.population);
//		System.out.println(human.population);//accessing via object name also works but this is the convention;
//		System.out.println(human.population);
	main funn=new main();
		funn.fun2();

	}
	static void fun() {
		//greeting();//gives an error because greeting is a non static function, it cannot be accessed in a static method 
		           //without referencing to an object
		main m=new main();
		m.greeting();// this works because we have created an object for main class and the non static method greeting belongs 
		             // to object m.
	}
	void fun2() {
		greeting();//non static method can be called in a non static method.
		           //because fun2 is a non static method so when it is called in static main method an object should be created
		           //and greeting also belongs to that same object.
	}
	void greeting() {
//		System.out.println("Hello");
		fun();//static method can be accessed in a  non static method because static method does not belong to any object
		      // but it belongs to class.
	}

}
