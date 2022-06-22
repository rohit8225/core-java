package ThreadConcurrency;

public class HelloWithThread extends Thread {
	public String name;
	public  HelloWithThread(String n) {
		name=n;
		
	}
   public void run() {
	   for (int i=0;i<50;i++) {
		   try {
			   Thread.sleep(2000, 2000);
			
		} catch (Exception e) {

		}
		   System.out.println(i+"hello"+name);
	   }
   }
   public static void main(String[] args) {
	   HelloWithThread t1=new HelloWithThread("Virat");
	   HelloWithThread t2=new HelloWithThread("Dhoni");
	   t1.start();
	   t2.start();
	  System.out.println("Thread Program Running...");
}
}
