
public class Forest implements Common {
	
	private String size = "deep";
	
	public void green() {
		System.out.println("Forest is green.");
	}
	public void white() {
		System.out.println("Forest is white.");
	}
	@Override
	public void showCommonparams() {
		System.out.println("Forest can be " + size);
	}
}
