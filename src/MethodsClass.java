class Person {
	String firstName;
	String lastName;
	int age;
	
	void name(){
		System.out.println("My name is " + firstName + " " + lastName + ".");
	}
	
	void myAge() {
		System.out.println("I'm " + age + "years old.");
	}
	
	void nameOther() {
		for (int i = 0; i < 3; i++) {
		System.out.println("Be-be-be.");
		}
	}
}

public class MethodsClass {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.firstName = "John";
		person1.lastName = "Doe";
		person1.age = 28;
		person1.name();
		person1.myAge();
		
		Person person2 = new Person();
		person2.firstName = "Liza";
		person2.lastName = "Zuzu";
		person2.age = 29;
		person2.nameOther();
		
		//System.out.println(person1.firstName);

	}
}
