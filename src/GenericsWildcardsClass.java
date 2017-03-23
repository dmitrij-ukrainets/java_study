import java.util.ArrayList;

class Plant {

	@Override
	public String toString() {
		return "Plants are growing";
	}
	public void age() {
		System.out.println("Plants can be very old");
	}

}

class Tree extends Plant {
	@Override
	public String toString() {
		return "Trees are also plants";
	}
	public void colour() {
		System.out.println("Trees can be of diferent colours");
	}
}

public class GenericsWildcardsClass {
	public static void main(String[] args) {

		ArrayList<Plant> list1 = new ArrayList<>();

		//list1.add(new Plant());
		//list1.add(new Plant());
		//list1.add(new Plant());
		//showList(list1);

		//ArrayList<Tree> list2 = new ArrayList<>();

		list1.add(new Tree());
		list1.add(new Tree());
		list1.add(new Tree());
		showList(list1);

	}

	public static void showList(ArrayList<Plant> list1) {
		for (Plant value : list1) {
			System.out.println(value);
			value.age();
		}
	}

}
