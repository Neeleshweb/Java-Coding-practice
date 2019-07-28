package main;

public abstract class Pizza {

	abstract float calculateprice();
	public boolean validate(int size,String type){
		if((size==6 || size==9 || size==12) && (type=="PLAIN" || type=="DELUXE"  || type=="SUPREME")) {
			return true;
		}
		else {
			return  false;
		}
	}
	
	
}
