package mega.dynamicrankingplatform.homefilescenter;
import java.util.Scanner;
import java.lang.*;
public class Useraversum {
	public static void main(String args[]) {
		
User num= new User();
num.getaversum();

}
}
class User {
	public void getaversum() {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the list");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter the numbers");
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		
	}
	
	int counter=0;
	int sum=0;
	while(counter < a.length) {
		sum=a[counter] + sum;
		counter ++;
		
	}
	System.out.println(sum);
float average=sum/size;
System.out.println(average);
int count=0;
int z=0;
while(count < a.length) {
	if(a[count]<=average) {
		z=z+1;
		count ++;
	}
	else {
		count ++;
	}
}
	
	System.out.println("the number of values less or equal to average are :" +z);
	}
}
