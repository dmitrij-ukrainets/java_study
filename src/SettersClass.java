class Frog {
	private String fName;
	private String lName;
	private int age;
	
	public void setfName(String fName){
		this.fName = fName;
	}
	public void setlName(String lName){
		this.lName = lName;
	}
	public void setage(int age){
		this.age = age;
	}
	public String getfName(){
		return fName;
	}
	public String getlName(){
		return lName;
	}
	public int getage(){
		return age;
	}
	public void setInfo(String fName, String lName, int age){
		setfName(fName);
		setlName(lName);
		setage(age);
	}
}

public class SettersClass {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		frog1.setfName("Milene");
		frog1.setlName("Farmer");
		frog1.setage(88);
		//frog1.setInfo("Michele", "Fifer", 33);
		
		System.out.println("My name is " + frog1.getfName() + " " + frog1.getlName() + ".");
		System.out.println("I'm " + frog1.getage() + " years old.");
				
	}
}
