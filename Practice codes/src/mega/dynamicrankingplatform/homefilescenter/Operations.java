package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Operations {
public static void main(String args[]) {
	Op num=new Op();
num.dooperations();
}
}
class Op {
	public void dooperations() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter any operator symbol");
	String c=sc.next();
	
	if(c.equals("+")) {
		int sum= a+b;
		System.out.println("the sum of the numbers is:" +sum) ;
	}
	else if(c.equals("*")) {
		int sum= a*b;
		System.out.println("the product of the numbers is:" +sum) ;
	}
	else if(c.equals("-")) {
		int sum= a-b;
		System.out.println("the difference of the numbers is:" +sum) ;
	}
	else if(c.equals("/")) {
		int sum= a/b;
		System.out.println("the quotient of the numbers is:" +sum) ;
	}
	else {
		System.out.println("Please enter a valid operator from 4 available ones...thank you");
	}
	}
}