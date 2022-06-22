package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import Serialization.Employee;

public class ReadObject {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new 	FileInputStream("‪E:\\object\\a.txt");
		ObjectInputStream in= new ObjectInputStream(file); 
		Employee emp=(Employee)in.readObject();
		System.out.println("id:"+emp.getId());
		System.out.println("F name:"+emp.getFirstName());
		System.out.println("L name:"+emp.getLastName());
		System.out.println("pss:"+emp.getPass());
		
	}

}
