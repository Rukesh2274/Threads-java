package threadl;

public class mainThread extends Thread{
	
	int seqLim;
	mainThread() {}
	mainThread(int i) { seqLim = 1; }
	
	// public void DisplaySequence() {
	public void run() { 
		for(int k=0; k< seqLim; k++)
		{
			System.out.println("The Thread is : " + k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Thread.currentThread());
		System.out.println("Max Thread Pri : " + Thread.MAX_PRIORITY);
		
		Thread.currentThread().setName("MyThread _ Rukesh");
		System.out.println(Thread.currentThread());
		
		mainThread objM = new mainThread(7);
		// obj.DisplaySequence();
		Thread obj1 = new Thread(objM);
		obj1.start();
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("Main : " + i);
		}

	}

}
