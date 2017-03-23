
public class PolymorphismClass {
	public static void main(String[] args) {
		Car car1 = new Car();
		Vaz vaz1 = new Vaz();
		
		car1.start();
		
		vaz1.start();
		vaz1.emergstop();
		
		Car car2 = vaz1;
		car2.start();
		//Non-working example
		//car2.emergstop();
		
		doStart(vaz1);
		
	}
	public static void doStart(Car car) {
		car.start();
	}
}
