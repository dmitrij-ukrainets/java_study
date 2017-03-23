class Plant{
	public void grow() {
		System.out.println("Plant is grownig.");
	}
	
}

class Tree extends Plant{
	@Override
	public void grow() {
		System.out.println("Tree is grownig long.");
	}
	public void age() {
		System.out.println("Trees can be very old.");
	}
}

public class UpcastingDowncastingClass {
	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		plant1.grow();
		
		Tree tree1 = new Tree();
		tree1.grow();
		tree1.age();
		
		Plant plant2 = tree1;
		plant2.grow();
		
		Plant plant3 = new Tree();
		Tree tree3 = (Tree)plant3;
		tree3.age();
		
		

	}
}
