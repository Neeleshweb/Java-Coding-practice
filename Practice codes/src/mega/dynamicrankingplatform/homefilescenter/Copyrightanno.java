package mega.dynamicrankingplatform.homefilescenter;

public class Copyrightanno {
@interface copyright {
	int Year();
	String info();
	
	
}
public void Year() {
	int Year=2017;
	System.out.println("The current year is :" +Year);
}
public void info() {
	String info="TechM" ;
	System.out.println("The current info is :" +info);
}
}

class Abc {
	public static void main(String args[]) {
		Copyrightanno num=new Copyrightanno();
		num.Year();
		num.info();
	}
}
	
