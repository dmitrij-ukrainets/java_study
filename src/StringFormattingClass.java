
public class StringFormattingClass {
	public static void main(String[] args) {
		
		//Old method, that uses lots of memory
		String oldStyle = "";
		oldStyle += "Variant of string formatting.";
		oldStyle += " ";
		oldStyle += "But it's not the best way";
		System.out.println(oldStyle);
		
		//String builder variant. Rather better then previous
		StringBuilder sb = new StringBuilder("");
		sb.append("That's like String Builder works.");
		sb.append(" ");
		sb.append("Thats better ofcourse.");
		System.out.println(sb.toString());
		
		//Another String builder variant. Nice formatted then previous
		StringBuilder sb1 = new StringBuilder("");
		sb1.append("Another String Builder variant.")
		.append(" ")
		.append("Less code is used here.");
		System.out.println(sb1.toString());
		
		//Real String formatting
		
		System.out.print("Some text.\tThis text is tabbed.\nAn new line is here");
		System.out.println("Just ordinary string output with println");
		
		System.out.printf("Some digits will be set here %10d.\nAnd some here %-10d.", 18, 26);
		
		for (int i = 0; i < 5; i++){
			System.out.printf("p. %-2d: %s\n", i, "Some text");
		}
		
		System.out.printf("Digit with floating point id %.3f. Then some text.\n", 1234567890.126843548468);
		
		String formatted = String.format("Some value with foating point: %f.", 18.3243685);
		System.out.println(formatted);
		
		System.out.printf("Some value with reserved symbol%%: %d%%.", 18);

	}
}
