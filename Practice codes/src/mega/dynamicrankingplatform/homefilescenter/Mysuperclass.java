package mega.dynamicrankingplatform.homefilescenter;

public class Mysuperclass {

	public void greet() {
		System.out.print("WELCOME TO PARADISE");
	}
	
}
class Mysubclass extends Mysuperclass {
@Override
	public void greet()
	{
		System.out.println("WELCOME TO HELL");
	}
}
class Comeon {
	public static void main(String args[]) {
		Mysuperclass num=new Mysubclass();
		num.greet();
	}
}