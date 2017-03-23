
public class InheritanceClass {
	public static void main(String[] args) {
		Cars car1 = new Cars();
		car1.startengine();
		car1.stopengine();
		car1.showinfo();		
		
		Vaz kopeika = new Vaz();
		kopeika.showvazModel();
		kopeika.startengine();
		kopeika.stopengine();
		kopeika.showinfo();
				
		Mazda mazda3 = new Mazda();
		mazda3.showmazdaModel();
		mazda3.startengine();
		mazda3.stopengine();
		mazda3.showinfo();
		
	}
}
