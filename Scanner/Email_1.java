package Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Email_1 { 

	public static void main(String[] args) throws IOException {
		FileReader r1 = new FileReader("‪‪‪E:\\Emaill\\a.txt");
		BufferedReader b1 = new BufferedReader(r1);
		FileWriter w1 = new FileWriter("‪E:\\Emaill\\b.txt");

		String ch = b1.readLine();

		String s = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		while (ch != null) {
			System.out.println(ch);
			if (ch.matches(s)) {
				w1.write(ch);
				System.out.println(ch);
			}

			ch = b1.readLine();
		}

		r1.close();
		w1.close();
		b1.close();

	}
}
