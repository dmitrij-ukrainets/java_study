class PersInf {
	String firstName;
	String lastName;
}

class PersData{
	int age;
	int weigth;
	
}

class PersAdd{
	int higth;
	String addit;
}

public class ClassesObjectsClass {
	public static void main(String[] args) {
		
		PersInf person1 = new PersInf();
		person1.firstName = "John";
		person1.lastName = "Doe";
		PersData person1data = new PersData();
		person1data.age = 27;
		person1data.weigth = 75;
		
		PersInf person2 = new PersInf();
		person2.firstName = "Lily";
		person2.lastName = "";
		
		System.out.print(person1.firstName + " " + person1.lastName + " " + "Age :" + person1data.age);
		
	}
}
