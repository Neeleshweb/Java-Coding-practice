package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Employee {
public void empdetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your emp_id");
int eid=sc.nextInt();
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter your salary");
int salary=sc.nextInt();
if(!name.equals("neelesh")) {
	System.out.println("Your name is not in record");
}
else {
	System.out.println("Hi neelesh");
}



}
}
class Mainclass {
	public static void main(String args[]) {
		Employee num=new Employee();
		Employee num2=new Employee();
		num.empdetails();
				
	}
}
