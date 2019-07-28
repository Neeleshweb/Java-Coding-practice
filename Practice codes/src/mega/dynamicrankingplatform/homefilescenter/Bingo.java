package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Bingo {
public static void main(String args[])  {
	Numberrange num=new Numberrange();
num.getinfo();
}
}
class Numberrange {
	int n;
	public void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number between 1 and 50");
		 n=sc.nextInt();
		if(n>50) {
			System.out.println("Please enter the number which is less than 50");
		}
		else if(n<1)
		{
			System.out.println("Please enter the number which is greater than 1");
		}
		
		int a[]=new int[5];
		a[0]=22;
		a[1]=21;
		a[2]=16;
		a[3]=12;
		a[4]=46;
		int counter =0;
	while(counter<5) {
		if(a[counter]==n) {
			System.out.println("BINGO GOT IT");
			break;
		
		}
		else {
			
			counter ++;
		}
	}
		
		
	}
}