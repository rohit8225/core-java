package Thread;

public class SyncronizationRacingCondThread extends Thread {
	

	
		
		public static Syncronization data=new Syncronization();
		public SyncronizationRacingCondThread(String name)
		{
			super(name);
		}
		public void run()
		{
			for(int i=0; i<5; i++)
			{
				data.deposit(getName(), 1000);
			}
		}
		public static void main(String[] args) {
			SyncronizationRacingCondThread t1=new SyncronizationRacingCondThread("amit");
			SyncronizationRacingCondThread t2=new SyncronizationRacingCondThread("manoj");
			t1.start();
			t2.start();
			
		}

	}



