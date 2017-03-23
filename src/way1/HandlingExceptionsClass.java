package way1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptionsClass {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("somefile.txt");
		FileReader readMyFile = new FileReader(file);
						
	}
}
