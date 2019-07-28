package mega.dynamicrankingplatform.homefilescenter;

import java.util.Scanner;

public class Customer {
private String custno;
private String custname;
private String category;
public String getCustno() {
	return custno;
}
public void setCustno(String custno) {
	this.custno = custno;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
Customer() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Customer number please :");
	custno=sc.next();
	System.out.println("Enter your name please :");
	custname=sc.next();
	System.out.println("Enter your cust category please :");
	category=sc.next();

String no[]=new String[3];
String name[]=new String[3];
String cat[]=new String[3];
if(custno.startsWith("C") || custno.startsWith("c")) {
	for(int i=0;i<3;i++) {
		System.out.println("Enter your Customer number please :");
		custno=sc.next();
		no[i]=custno;
		
	}
}
else {
	try {
		throw new InvalidInputException();
	} catch (InvalidInputException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Please see that only C or c must be starting of the custno");
}

if(custname.length()<=4) {
	try {
		throw new InvalidInputException();
	} catch (InvalidInputException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Please see that custname must have more than 4 characters in length");
}
else {
	for(int i=0;i<3;i++) {
		System.out.println("Enter your name please :");
		custname=sc.next();
		name[i]=custname;
		
	}
}

if(category.equals("gold") || category.equals("silver") || category.equals("platinum")) {
	for(int i=0;i<3;i++) {
		System.out.println("Enter your cust category please :");
		category=sc.next();
		cat[i]=category;
}
}
else {
	try {
		throw new InvalidInputException();
	} catch (InvalidInputException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("The cust category can be either gold or silver or platinum,no others are allowed");
}

int counter=0;
while(counter<3) {
	System.out.println("The cust no is :" +no[counter] + "The cust name is :" +name[counter] + "The cust category entered was : " +cat[counter] );
counter ++ ;

}
}
}
class Calling {
	public static void main(String args[]) {
		Customer cust=new Customer();
		
	}
}


