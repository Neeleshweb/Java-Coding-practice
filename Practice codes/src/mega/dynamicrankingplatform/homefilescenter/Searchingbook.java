package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Searchingbook {
	public void displaydetails() {
		// TODO Auto-generated constructor stub

int booknos[]=new int[4] ;
String booktitle[]=new String[4];
String bookauthor[]=new String[4];
float bookprice[]=new float[4];
Scanner sc=new Scanner(System.in);
for(int i=0;i<4;i++) {
System.out.println("enter the number on the book please:");
int bookno=sc.nextInt();
booknos[i]=bookno;

}
for(int i=0;i<4;i++) {
System.out.println("enter the title on the book please:");
String title=sc.next();
booktitle[i]=title;
}
for(int i=0;i<4;i++) {
System.out.println("enter the author of the book please:");
String author=sc.next();
bookauthor[i]=author;
}
for(int i=0;i<4;i++) {
System.out.println("enter the price of the book please:");
float price=sc.nextFloat();
bookprice[i]=price;
}
System.out.println("Congrats , you have successfully added the books, now its time to search the books you want from the added ones");
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the booknumber for the book you want to search for, and leave rest to us!!");
int number=sc1.nextInt();
for(int i=0;i<4;i++) {
	if(booknos[i]==number) {
		System.out.println("Your book found, congrats below are the details");
	System.out.println("your bookno is" +booknos[i] + "your book title is :" +booktitle[i] + "your book author is :" +bookauthor[i] + "your book price is:" +bookprice[i] );
	}
	
}


}
	

		
	
	
	
	
	
	
}
class Mainbook {
	public static void main(String args[]) {
		Searchingbook num=new Searchingbook();
		num.displaydetails();
	}
	
	
	
	
}
