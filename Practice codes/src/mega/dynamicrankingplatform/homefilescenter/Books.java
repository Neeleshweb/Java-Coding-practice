package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Books {
private int bookno;
private String title;
private String author;
private float price;
public int getBookno() {
	return bookno;
}
public void setBookno(int bookno) {
	this.bookno = bookno;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public void getinput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number on the book please:");
	bookno=sc.nextInt();
	System.out.println("enter the title on the book please:");
	title=sc.next();
	System.out.println("enter the author of the book please:");
	author=sc.next();
	System.out.println("enter the price of the book please:");
	price=sc.nextFloat();
System.out.println("bookno entered by you is:" +bookno);
System.out.println("title entered by you is:" +title);
System.out.println("author entered by you is:" +author);
System.out.println("price entered by you is:" +price);
System.out.println("CHAL ABB CHILL MAAR...LOL");

}
}
class Bookdetails {
	public static void main(String args[]) {
		Books num=new Books();
		num.getinput();
		
		
	
	}
}
