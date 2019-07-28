package mega.dynamicrankingplatform.homefilescenter;

import java.util.HashMap;

public class Studentcollection2 {
	int rollno;
	String name;
private HashMap<Integer, String> num;

public void setnames() {
	num.put(1, "Neelesh");
	num.put(2, "Mukul");
	num.put(3, "Ravi");
	num.put(4, "Divya");
	num.put(5, "Anushka");
}
public void printnames() {
	int counter=0;
	while(counter<num.size()) {
		System.out.println("The names of student are :" +num.get(counter) + "/n");
	counter ++;
	
	}
}

public void getname(String fuc) {
	int i=0;
	
while(i<num.size())
{
	if(num.get(i)==fuc) {
		System.out.println("The name is :" +num.get(i));
	break;
	}
	else {
		i++;
	}	
}
	
}

public void printsize() {
	System.out.println("The size of the list is :" +num.size());}

public void remove(String key) {
	num.remove(key);
}

}
class Hashmapdemo {
	public static void main(String args[]) {
		Studentcollection2 num2=new Studentcollection2();
		num2.setnames();
		num2.printnames();
		num2.getname("Neelesh");
		num2.remove("Ravi");
		num2.printsize();
	}
}