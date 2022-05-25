package OPPSConstructorCallAnotherConstructor;

public class Employee extends Person {
	private String designation;
public Employee() {
	System.out.println("default constructor");
	
}
public Employee(String fn,String ln,String des) {
	super(fn,ln);
	designation = des;
	System.out.println("3 perams constructor ");
}
public static void main(String[] args) {
	Employee e=new Employee("ram","sharma","Qc");
}

}

