package main;

public class ProductException extends Throwable {

	public ProductException() {
		String s="error thrown from product";
		System.out.println(s);
	}
}
