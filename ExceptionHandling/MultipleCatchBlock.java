package ExceptionHandling;

public class MultipleCatchBlock {
public static void main(String[] args) {
	String name="Rohit";
	
	System.out.println(name.length());
	try {
	System.out.println(name.charAt(6));
}catch(StringIndexOutOfBoundsException e)
{
	System.out.println("string abhi chotii hai");}
}
}
