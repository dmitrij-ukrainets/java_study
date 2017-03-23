class Frog{
	public final static int MY_NUMBER = 33;
	private String fName;
	private String lName;
	private int code;
	public static String description;
	public static int count = 0;
	public int id;
	public Frog() {
	id = count + 1;
	count++;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setcode(int code) {
		this.code = code;
	}
	private String getfName() {
		return fName;
	}
	private String getlName() {
		return lName;
	}
	private int getcode() {
		return code;
	}
	public void showMe() {
		System.out.println(id + ". My name is " + getfName() + " " + getlName() + ". My code is " + getcode());
	}
	public static void showDescription() {
		System.out.println(description);
	}
}

public class SstaticClass {
	public static void main(String[] args) {
		
		Frog.description = "None of us is a real frog!";
		System.out.println("Initial amount of frogs is " + Frog.count + ".");
		
		Frog frog1 = new Frog();
		frog1.setfName("Fox");
		frog1.setlName("Mulder");
		frog1.setcode(33);
		
		frog1.showMe();
		//System.out.println(frog1.getlName());
		
		Frog frog2 = new Frog();
		frog2.setfName("Dana");
		frog2.setlName("Scully");
		frog2.setcode(34);
		
		frog2.showMe();
		//System.out.println(frog2.getlName());
		Frog.showDescription();
					
		System.out.println(Frog.count + " frogs were created.");
		System.out.println("Just munber is " + Frog.MY_NUMBER + " ,but Pi is " + Math.PI);
		

	}
}
