package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String FirstName;
	private String LastName;
	private  transient int pass;
	public Employee() {}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getPass() {
		return pass;
	}

	public Employee(int id,String fn,String ln,int p) {
		this.id=id;
		FirstName=fn;
		LastName=ln;
		pass=p;
	}
	

}
