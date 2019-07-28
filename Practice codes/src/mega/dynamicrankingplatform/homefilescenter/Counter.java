package mega.dynamicrankingplatform.homefilescenter;

public class Counter extends Thread {

	public void run() {
		int n=20;
		int i=0;
		while(i<n) {
			Storage num=new Storage(i);
			i++;
		}
	}
	
}

class Callit {
	public static void main(String args[]) {
		Counter num=new Counter();
		num.start();
	}
}


