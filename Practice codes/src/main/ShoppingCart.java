package main;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart implements CartOperations {
 private float tax_percentage;
 private float invoiceAmount;
 float firstvalue;
 ArrayList<Product> items ;
 
 public ShoppingCart(float tax_percentage) {
		

	 this.tax_percentage=tax_percentage;

	 }
	public static void main(String[] args) throws ProductException {
		
		Product p1=new Product("keyboard",400,2);
		
		
		Product p2=new Product("Pendrive",300,2);
	
		Product p3=new Product("Camera",3000,1);
		
CartOperations cart=new ShoppingCart(10);
cart.removeFromCart(p3) ;
	cart.addToCart(p1);
	cart.addToCart(p2);
	cart.addToCart(p3);
	cart.removeFromCart(p1);
	System.out.println(cart.getInvoiceAmount());
	System.out.println(cart);
	
	}

	@Override
	public float getInvoiceAmount() {
	 firstvalue=invoiceAmount;
	
	
		return firstvalue ;
	}

	@Override
	public float addToCart(Product p) {
		  items= new ArrayList<Product>();
		 items.add(p);
		 float prices=p.Price;
		 int quant=p.quantity;
		 float c1= (prices*quant);
		 float c2=(c1*this.tax_percentage)/100;
		 float cost=c1+c2;
		 invoiceAmount=cost;
		return cost;
	}

	@Override
	public void removeFromCart(Product p) throws ProductException {
		Iterator<Product> itr=items.iterator();
		while(itr.hasNext()) {
			if(items.contains(p)) {
				 float pri=p.Price;
				 int quanty=p.quantity;
				 float c3= (pri*quanty);
				 float c4=(c3*this.tax_percentage)/100;
				 float cost=c3+c4;
			
			float rem=firstvalue-cost;
			
			
			}
			else {
	throw new ProductException();
	
		
			}
			 
		}
		
	}

}
