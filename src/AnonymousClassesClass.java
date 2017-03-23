class Plant {
	public void grow() {
		System.out.println("Plant is growing.");
	}
}

interface Machine {
	public void cut();
}

public class AnonymousClassesClass {
	public static void main(String[] args) {
		
		Plant plant1 = new Plant() {
			@Override
			public void grow() {
				System.out.println("Trees can gorw for ages!");
			}
		};
				plant1.grow();
				
		Machine machine1 = new Machine() {
			public void cut() {
				System.out.println("Special machines can cut plants.");
			}
		};
		machine1.cut();

	}
}
