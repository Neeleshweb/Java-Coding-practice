package mega.dynamicrankingplatform.homefilescenter;

public class Mythreadrunnable implements Runnable {
Thread t;

	Mythreadrunnable() {
		 t=new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		int n=10;
		try {
			for(int i=0;i<n;i++) {
				System.out.println("I AM AWESOME PROGRAMMER");
				Thread.sleep(1000);
			}
			
				}catch(InterruptedException ee)
		{
					ee.printStackTrace();
		}
		System.out.println("Prog terminates");
	}

}
class Mymain {
	public static void main(String args[]) {
		Mythreadrunnable num=new Mythreadrunnable();
		
	}
}