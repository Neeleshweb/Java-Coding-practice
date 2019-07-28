package mega.dynamicrankingplatform.homefilescenter;

public class Threadpriority extends Thread {

	public void run() {
		
		System.out.println("running thread name is :" +Thread.currentThread().getName());
		System.out.println("running thread priority is :" +Thread.currentThread().getPriority());
		
	}
	
}
class Mythreadma {
	public static void main(String args[]) {
		Threadpriority num=new Threadpriority();
		Threadpriority num2=new Threadpriority();
		num.setPriority(Thread.MIN_PRIORITY);
num2.setPriority(Thread.MAX_PRIORITY);	
num.start();
num2.start();
	}
}