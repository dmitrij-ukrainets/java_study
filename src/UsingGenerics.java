import java.util.ArrayList;

class Animal {
	
}

public class UsingGenerics {
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Crocodile");
		animals.add("Rabbit");
		animals.add("Cat");
		//String getAnimal = animals.get(i);
		for (int i=0; i<3; i++) {
		System.out.printf(i+1 + " Hardcoded animal is: " + animals.get(i) + "\n");
		}
		String getAnimal = animals.get(2);
		System.out.println(getAnimal);

	}
}
