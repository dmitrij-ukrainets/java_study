import java.util.Scanner;

public class GettingUserInputClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value: ");
		int value = input.nextInt();
		System.out.println("You entered: " + value);
		input.close();
	}
}
