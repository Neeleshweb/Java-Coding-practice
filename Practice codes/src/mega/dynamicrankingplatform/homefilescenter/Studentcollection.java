package mega.dynamicrankingplatform.homefilescenter;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentcollection {
private ArrayList<String> name;

public void setnames() {
	int n=5;
	
	for(int i=0;i<n;i++) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Here we make a list of only 5 students");
		System.out.println("Enter the name of student");
	String names=sc.next();
	name.add(names);
	
	}
}
public void searchname(String names) {
	int counter=0;
	while(counter<name.size()) {
		if(name.get(counter)==names) {
			System.out.println("The student is found and his/her name is" +name.get(counter));
		
		break;
		}
		else {
			counter ++;
		}
		
		
		
	}
	
}
public void printnames() {
	int counter=0;
	while(counter<name.size()) {
		System.out.println("The names of the student are : " +name.get(counter) + "/n");
	counter ++;	
	
	}
	
	
}
public void removename(String stuname) {
	name.remove(stuname);
}
}
class Arraylistdemo {
	public static void main(String args[]) {
		Studentcollection num=new Studentcollection();
		num.setnames();
		num.searchname("Neelesh");
		num.printnames();
		num.removename("ravi");
		
	}
}