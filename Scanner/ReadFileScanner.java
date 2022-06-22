package Scanner;

import java.util.Scanner;

public class ReadFileScanner {
	public static void main(String[] args) {
		String name,name2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		name=sc.nextLine();
		System.out.println("enter second name");
		name2 = sc.nextLine();
		sc.close();
	}

}
