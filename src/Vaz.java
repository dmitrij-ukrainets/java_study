
public class Vaz extends Cars {
	protected String vazModel = "Jiga!";
	public void showvazModel() {
		System.out.println(vazModel);
	}
	@Override
	public void startengine(){
		System.out.println("It's VAZ! Failed");
	}
	@Override
	public void stopengine() {
		System.out.println("It's always stopped.");
	}

}
