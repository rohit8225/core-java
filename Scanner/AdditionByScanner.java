package Scanner;

import java.util.Scanner;

public class AdditionByScanner {
	public static void main(String[] args) {
		 int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		sc.close();
		c=a+b;
		System.out.println(c);
//		Scanner sc=new Scanner(System.in);
//		String fn,ln,a;
//		System.out.println("enter first word");
//		fn=sc.next();
//		System.out.println("enter second word");
//		ln=sc.next();
//		sc.close();
//		a=fn+ln;
//		System.out.println(a);
		
				
		
	}

}
