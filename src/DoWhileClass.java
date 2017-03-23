import java.util.Scanner;

public class DoWhileClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Number: ");
		int i = scanner.nextInt();
		
		while (i != 5) {
			System.out.println("Number: ");
			i = scanner.nextInt();
		}
		*/
		
		int i = 0;
		do {
			System.out.println("Number: ");
			i = scanner.nextInt();
		}
		while (i != 5);
		scanner.close();
		System.out.println("You're right.");
	}
}
