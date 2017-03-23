import java.util.Scanner;

public class SwitchClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter command: ");
		String command = input.nextLine();
		
		switch (command) {
		case "start":
			System.out.println("Started");
			break;
		
		case "stop":
			System.out.println("Stoped");
			break;
			
		default:
			do {
			System.out.println("Unknown command! Enter again.");	
			command = input.nextLine();
			}
			while (!command.equals("help"));
			System.out.println("Help page is shown");
			//System.out.println("Unknown!");
		}
		
		input.close();

	}
}
