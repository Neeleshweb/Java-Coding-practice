package main;

public class PizzaOnline {
private float totalsales;
	public static void main(String[] args) throws InvalidPizzaException {
		
PizzaOnline po=new PizzaOnline();
Vegpizza vp1=new Vegpizza(9, "PLAIN");
NonVegPizza nvp1=new NonVegPizza(12, "DELUXE");
Vegpizza vp2=new Vegpizza(6, "SUPREME");
Vegpizza vp3=new Vegpizza(12, "NORMAL");
		
		float price=po.order(vp1);
		System.out.println(price);
		float price2=po.order(nvp1);
		System.out.println(price2);
float price3=po.order(vp2);
System.out.println(price3);
		
		
		
		
		
		
	}
	public float order(Pizza pizza) {
	 
	float cost=pizza.calculateprice();
	return cost;
	}
	public float getotalsales() {
		
		return 0;
		
	}

}
