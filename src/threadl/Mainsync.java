package threadl;

public class Mainsync extends Thread{
	
	SyncClass s;
	Mainsync() { s = new SyncClass(); }
	
	public void run(){
		s.Display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
