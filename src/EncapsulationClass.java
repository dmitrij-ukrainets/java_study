class Frog {
	public static final int ID = 1;
	private String name;
	private int calculateFrogAge(){
		return 8;
	}
	
	public String getData() {
		String data = "Text " + calculateFrogAge();
		return data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class EncapsulationClass {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		frog1.setName("Fox");
		System.out.println(frog1.getName());
		System.out.println(frog1.getData());
		System.out.println(Frog.ID);
		
	}
}
