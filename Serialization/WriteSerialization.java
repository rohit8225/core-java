package Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class WriteSerialization {
	public static void main(String[] args) throws IOException,Exception {
		
		FileOutputStream file = new FileOutputStream("‪‪E:\\object\\a.ser");
	    ObjectOutputStream out =  new  ObjectOutputStream(file);
	    Employee emp=new Employee(1,"rohit","patidar",12345);
	   
	    out.writeObject(emp);
	    out.close();
	    file.close();

	    System.out.println();

		
	}
	
	
	}
