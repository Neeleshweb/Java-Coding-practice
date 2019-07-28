package main;

public class NonVegPizza extends Pizza {
	private int size;
	private String type;
	@Override
	float calculateprice() {
		float price=0;
		if(this.size==6 && this.type.equals("PLAIN")) {
			 price= 100*this.size;
		
			
		}
		else if(this.size==6 && this.type.equals("DELUXE")) {
		 price=(100*this.size) + 150;
			
		}
		else if(this.size==6 && this.type.equals("SUPREME"))
		{
			price=(100*this.size) + 200;
		
		}
		else if(this.size==9 && this.type.equals("PLAIN"))
		{
			 price=(100*this.size) ;
		
		}
		else if(this.size==9 && this.type.equals("DELUXE"))
		{
			 price=(100*this.size) + 150;
			
		}
		else if(this.size==9 && this.type.equals("SUPREME"))
		{
			 price=(100*this.size) + 200;
		
		}
		else if(this.size==12 && this.type.equals("PLAIN"))
		{
			 price=(100*this.size);
			
		}
		else if(this.size==12 && this.type.equals("DELUXE"))
		{
			 price=(100*this.size) + 150;
		
		}
		else if(this.size==12 && this.type.equals("SUPREME"))
		{
			 price=(100*this.size) + 200;
		
		}
		return price;
	}

	NonVegPizza(int size, String type) throws InvalidPizzaException {
		if(this.validate(size, type)) {
			this.size=size;
			this.type=type;
			
		}else { try {
			throw new InvalidPizzaException();
		}catch (Exception ee) {
			
		}
		
		}
	}
}
