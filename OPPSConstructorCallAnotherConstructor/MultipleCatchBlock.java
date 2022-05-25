package OPPSConstructorCallAnotherConstructor;

public class MultipleCatchBlock {
public static void main(String[] args) {
	String name=null;
	try{
	System.out.println(name.length());
	System.out.println(name.charAt(5));
}catch(NullPointerException e) {
	System.out.println(e.getMessage());
	//System.exit(0);}
	//finally {
		System.out.println("hello rohit");
		
	}
}
}
