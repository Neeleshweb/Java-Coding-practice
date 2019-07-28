package mega.dynamicrankingplatform.homefilescenter;

public class Mythread extends Thread {

	@Override
	public void run() {
		
		try {
			int n=20;
			
			for(int i=0;i<n;i++) {
				System.out.println("I AM AWESOME PROGRAMMER");
				Thread.sleep(1000);
				
			}	
		}catch(InterruptedException ee) {
			ee.printStackTrace();
		}	
	
		super.run();
	}
}
class Threaddemo {
	public static void main(String args[]) {
		Mythread num=new Mythread();
		Mythread num2=new Mythread();
		num.start();
		
	}
}