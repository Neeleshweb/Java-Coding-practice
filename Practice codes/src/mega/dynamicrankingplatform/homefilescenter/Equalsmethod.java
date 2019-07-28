package mega.dynamicrankingplatform.homefilescenter;

public class Equalsmethod {
	public void equalscheck() {
		String a="neelesh" ;
		String b="neelesh" ;
		String c="mukul" ;

		if(a.equals("neelesh")) {
			System.out.println("actual strings compared,a is equal to neelesh");

		}
		if(a.equals(b)) {
			System.out.println("the actual values of a and b are equal");
		}
		if(!a.equals(c)) {
			System.out.println("a and c are not equal");	
		}
		else {
			System.out.println("a and c are equal");
		}
	}
}

class Equals {
	public static void main(String args[]) {
		Equalsmethod num=new Equalsmethod();
		num.equalscheck() ;
		
	}
}