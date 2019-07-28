package mega.dynamicrankingplatform.homefilescenter;

import java.io.IOException;

public class Mainhandle {
public void check()   {
	int a=10;
	int b=0;
	int sum=a/b;
	
}
}
class Exceptionhand {
	public static void main(String args[]) {
		Mainhandle num=new Mainhandle();
		try {	
		num.check();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		System.out.println("prog executed succesfully");

	}
	
	
}
