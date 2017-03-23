
public class IfLoopsClass {
	public static void main(String[] args) {
		
		int i = 0;
		
		while (true) {
			if (i == 3) {
				System.out.println("Equal to 3. Next step.");;
			}
			else if (i == 5) {
				System.out.println("Equal to 5. Next step.");
			}
			else if (i == 7) {
				System.out.println("Equal to 7. Now stop!");
				break;
			}
			else {
				System.out.println("Running on " + i);
			}
		i++;
		}
	}
}