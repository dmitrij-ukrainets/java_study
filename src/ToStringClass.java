class Frog {
	private String name;
	private int code;
	
	public Frog(int code, String name) {
		this.name = name;
		this.code = code;
	}
	public String toString(){
		return String.format("%3d) %s", code, name);
		
		/*
		StringBuilder fsb = new StringBuilder();
		fsb.append(code)
		.append(") ") 
		.append(name);
		return fsb.toString();
		*/
	}
}

public class ToStringClass {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog(001, "Fox");
		Frog frog2 = new Frog(002, "Scully");
		
		System.out.println(frog1);
		System.out.println(frog2);
		

	}
}
