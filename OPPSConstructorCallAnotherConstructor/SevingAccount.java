package OPPSConstructorCallAnotherConstructor;

public class SevingAccount extends OverridingAccount {
	public int getAmount() {
		int i=super.getAmount()+20;
		return i;
		
	}

}
