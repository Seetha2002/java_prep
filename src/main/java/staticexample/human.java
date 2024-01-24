package staticexample;

public class human {
	int age;
	String name;
	int salary;
    static long population;// default value=0
	static void message() {
		System.out.println("Hello World");
		//System.out.println(this.age);//gives an error because this keyword refers to an object, where as the method
		                               //message is a static method which belongs to class but not an object
	}
	public human(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		human.population+=1;
	//  this.population+=1; //if population is not static;
	}
	
	
	
	
}
