package mega.dynamicrankingplatform.homefilescenter;

public class Exceptionhandle1 {
public void checkexp() {
	int a[]=new int[10];
	try {
		a[12]=16;
		
	}catch(Exception ee) {
		ee.printStackTrace();
	}
	System.out.println("program executed successfully");
}
}
class Except {
	public static void main(String args[]) {
		Exceptionhandle1 num=new Exceptionhandle1();
		num.checkexp();
	}
}