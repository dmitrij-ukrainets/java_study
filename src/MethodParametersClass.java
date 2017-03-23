class Man {
	public void hello(String text){
		System.out.println(text);
	}
	public void run(int value){
		System.out.println("I can run for " + value + " minutes");
	}
	public void achivements(String achive, double record) {
		System.out.println("My best result in " + achive + " is " + record + " hours.");
	}
}

public class MethodParametersClass {
	public static void main(String[] args) {
		Man mike = new Man();
		
		String whoAmI = "I'm runner.";
		mike.hello(whoAmI);
		mike.run(38);
		
		String competition1 = "RFF";
		String competition2 = "RFM";
		String competition3 = "RFR";
		mike.achivements(competition3, 74.6);
	}
}
