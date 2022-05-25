package OPPSConstructorCallAnotherConstructor;

public class Person {
	
		private String fname;
		private String lname;
		private String address;
		
		
	   public Person()
	   { 
		   
		   System.out.println("Default constructor");
	   }
	   public Person(String fn,String ln) {
		 this();
		   fname=fn;
		 lname=ln;
		 System.out.println("2 params constructor");
	   }
	   public Person(String fn,String ln,String address) {
		   this(fn,ln);
		   this.address=address;
		   System.out.println("3 params constructor");
	   }
	   public static void main(String[] args) {
		Person p=new Person("rohit","patidar","indore");
	}
	}


