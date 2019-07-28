package mega.dynamicrankingplatform.homefilescenter;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Studentcollection3 {
private TreeSet<String>  product;
		

public void storenames() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Here we add only 5 products, so give 5 names");
	int n=5;
	for(int i=0;i<n;i++) {
		System.out.println("Enter the name of product you want to add :");
	String prod=sc.next();
	product.add(prod);
	}
	
	
}
public void printnames() {
	
	int counter =0;
	
		System.out.println("The names of the added products are :" +product);
		}
public void firstlast() {
	int counter=0;
	while(counter<product.size()) {
		System.out.println("The first added product is :" +product.getClass());
	
	}
	

}
public void sizeset() {
	System.out.println("The current size of treeset is: " +product.size());
}
public void removeproduct(String prodname) {
	
	Iterator itr;
	itr=product.iterator();
	while(itr.hasNext()) {
		if(itr.equals(prodname)) {
			itr.remove();
		break;
		}
		
	}
	
}
public void checksizeagain() {
	System.out.println("The size of the list after removing a product is :" +product.size());
}
}

class Collectioncall {
	public static void main(String args[]) {
		Studentcollection3 num3=new Studentcollection3();
		num3.storenames();
		num3.printnames();
		num3.firstlast();
		num3.sizeset();
		num3.removeproduct("laptop");
	num3.checksizeagain();
	
	}
}