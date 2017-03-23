
public class InterfacesClass {
	public static void main(String[] args) {
		Forest forest1 = new Forest();
		forest1.green();
		forest1.showCommonparams();
		
		Ocean ocean1 = new Ocean();
		ocean1.solt();
		ocean1.showCommonparams();
		
		Common commonInfo1 = new Forest();
		commonInfo1.showCommonparams();
		
		Common commonInfo2 = new Ocean();
		commonInfo2.showCommonparams();
		
		Common commonInfo3 = forest1;
		commonInfo3.showCommonparams();
		
		System.out.println();
		outputCommon(ocean1);
		outputCommon(forest1);
		
	}
		
		private static void outputCommon(Common info) {
			info.showCommonparams();
		}

	}

