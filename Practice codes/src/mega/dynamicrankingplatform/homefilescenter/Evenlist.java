package mega.dynamicrankingplatform.homefilescenter;
import java.util.Scanner;
import java.lang.*;
public class Evenlist {
	public static void main(String args[]) {
		Evennum num=new Evennum();
		num.getsum();
}
}
	class Evennum {
		int n=0;
		public void getsum() {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		System.out.println("Enter the value of n");
		int value=sc.nextInt();
		System.out.println(value);
		int a[]=new int[value];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;	
		}
		while(counter<=value) {
		if(value<0) {
		System.out.println("Please provide positive numbers only!!");
		}
		if(a[counter]%2==0) {
		System.out.println(a[counter]);
		counter=counter + 1 ;
		}
		else {
		counter=counter + 1 ;
		}
		}
		}
		} 