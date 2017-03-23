class Frog {
	private String fName;
	private String lName;
	private int code;
	
	public Frog() {
		this("Milene", "Farmer", 33);
		System.out.println("First constructor ");
	}
	public Frog(String fName){
		this.fName = fName;
		fName = "Fox"; 
		System.out.println("Second constructor." + " " + fName + " is me.");
	}
	public Frog(String fName, String lName, int code) {
		this.fName = fName;
		this.lName = lName;
		this.code = code;
		System.out.println("Third constructor." + " " + "My name is " + fName + " " + lName);
	}
}

public class ConstructorsClass {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		Frog frog2 = new Frog("Ameli");
		Frog frog3 = new Frog();

	}
}
