package ThreadConcurrency;

public class HelloWithoutThread {
String name;
public HelloWithoutThread (String n) {
	name=n;
	
}
public void show() {
	for(int i=0;i<50;i++) {
		System.out.println(i+"hello "+name);
	}
}
public static void main(String[] args) {
	
	HelloWithoutThread t1=new HelloWithoutThread("Ram");
	HelloWithoutThread t2=new HelloWithoutThread("shyam");
	t1.show();
	t2.show();
	
	
}
}
