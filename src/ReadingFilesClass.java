import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesClass {
	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "d:/Documents/newtextfile.txt";
		File file = new File(filename);
		Scanner read = new Scanner(file);
		
		int digit = read.nextInt();
		System.out.println("Digit in file is " + digit);
		
		read.nextLine();
		
		int count = 2;
		while(read.hasNextLine()) {
			String line = read.nextLine();
			System.out.println(count + ". " + line);
			count++;
		}
		
		read.close();
		
	}
}
