package mega.dynamicrankingplatform.homefilescenter;

import java.util.Date;
import java.util.Scanner;

public abstract class Medicine {
public static void getdetails(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the price of the medicine:");
	int price=sc.nextInt();
	System.out.println("Please enter the expiry date of the medicine:");
	String expiry_date=sc.next();
	System.out.println("The price of the medicine is" +price);
	System.out.println("The expiry_date of the medicine is" +expiry_date);
}
public abstract void displayLabel();
}
class Tablet extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		
		System.out.println("Store in a cool and dry place");
	}
	
}
class Syrup extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("It may cause 6-7 hours of drowsiness after drinking this since it has alcohol.");
	}
	
}
class Ointment extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Strictly for external use only, never inhale or consume it, since it is poisonous");
	}
	
}class TestMedicine {
	public static void main(String args[]) {
		Medicine arr[]=new Medicine[5] ;
		Medicine.getdetails();
		
int random=	(int)(Math.random()*3 +1);
if(random>=1&&random<2) {
	Medicine num=new Tablet();
	num.displayLabel();
}
else if(random>=2&&random<3)	 {
	Medicine num2=new Syrup();
	num2.displayLabel();
}
else {
	Medicine num3=new Ointment();
	num3.displayLabel();
}

	}
}