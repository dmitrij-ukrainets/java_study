
public class Ocean implements Common {
	
	private String depth = "deep";
	
	public void wet() {
		System.out.println("Ocean is wet.");
	}
	public void solt() {
		System.out.println("Ocean contains solt.");
	}
	
	@Override
	public void showCommonparams() {
		System.out.println("Ocean can also be " + depth);
	}
}
