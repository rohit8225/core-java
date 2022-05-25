package ArgumenntPassing;

public class ParsingIntegerPassing {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println(sum);
		System.out.println((double)(sum));
		
	}
	//public static void main(String[] args) {
		//double a=Double.parseDouble(args[0]);
		//double b=Double.parseDouble(args[1]);
		//double sum=a+b;
		//System.out.println((int)(sum));
	//}

}
