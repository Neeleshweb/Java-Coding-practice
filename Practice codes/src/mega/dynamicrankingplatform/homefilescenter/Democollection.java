package mega.dynamicrankingplatform.homefilescenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Democollection {
private String name;
private String password;
private int age;
private int id;
	public static void main(String[] args) {
		ArrayList<Logic> num=new ArrayList<Logic>();
		num.add(new Logic("neelesh","web" ,22,1234));
		num.add(new Logic("ravi","web2" ,29,1231));
		num.add(new Logic("priya","web3" ,20,1233));
		num.add(new Logic("suresh","web4" ,27,1247));
		num.add(new Logic("pinky","web5" ,21,1298));
		
		System.out.println("the size is" +num.size());
		int counter=0;
		while(counter<num.size()) {
			
			/*System.out.println("the list is" +Arrays.toString(num.get(counter)));*/
			counter++;
			
			
		}
		
		}

	}


