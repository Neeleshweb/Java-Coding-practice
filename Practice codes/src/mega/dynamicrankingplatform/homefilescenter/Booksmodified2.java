package mega.dynamicrankingplatform.homefilescenter;

import java.util.ArrayList;
import java.util.Scanner;

public class Booksmodified2 {
	
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

int counter=0;
while(counter<=3) {
	System.out.println("The  book details we recieved are:" +booknos[counter] + "book title is :" +booktitle[counter] +"book author is: " +bookauthor[counter] +"book price is : " +bookprice[counter]);
System.out.println("/n");
counter ++;
}
	}
		}
	class Bookdeta {
		public static void main(String args[]) {
			Booksmodified2 num=new Booksmodified2();
			num.displaydetails();
		}
	}