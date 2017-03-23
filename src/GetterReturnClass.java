class Person{
	String fName;
	String lName;
	int age;
	
	void myName(){
		System.out.println("Hi, I'm " + fName + " " + lName);
	}
	
	int workForFBI() {
		int fbiWork = age - 22;
		return fbiWork;
	}
	
	int getAge(){
		return age;
	}
	 void myAge() {
		 System.out.println("I'm " + getAge() + " years old.");
	 }

}

public class GetterReturnClass {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.fName = "Fox";
		person1.lName = "Mulder";
		person1.age = 30;
		person1.myName();
		int fbi = person1.workForFBI();
		System.out.println("I work in FBI for " + fbi + "years");
		person1.myAge();
		
		Person person2 = new Person();
		person2.fName = "Dana";
		person2.lName = "Scally";
		person2.age = 29;

	}
}
