package threadl;

public class ThreadControl implements Runnable{

	int seqLim;
	ThreadControl() {}
	ThreadControl(int i) { seqLim = 1; }
	
	// public void DisplaySequence() {
	public void run() { 
		for(int k=0; k< seqLim; k++)
		{
			System.out.println(Thread.currentThread().getName() + " " + k);
			try {
				Thread.sleep(1000);;
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadControl objc = new ThreadControl(10);
		Thread t1 = new Thread(objc);
		t1.setName("First");
		t1.setPriority(5);
		t1.start();
		
		try {
			t1.join();
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
		ThreadControl objc2 = new ThreadControl(10);
		Thread t2 = new Thread(objc2);
		t2.setName("Second");
		t2.start();
		/*
		
		Thread.currentThread().suspend();
		
		if(t1.isAlive())
			Thread.currentThread().resume();
			
		*/
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Main : " + i);
		}
	}

}
