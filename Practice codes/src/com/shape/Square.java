package com.shape;
import com.test.*;
import java.util.Scanner;

public class Square implements Polygon {


	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square to calculate area");
		float side=sc.nextFloat();
		float area=side*side;
		System.out.println("The area of the square is" +area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square to calculate perimeter");
		float side=sc.nextFloat();
		float perimeter=4*side;
		System.out.println("The perimeter of the square is" +perimeter);
	}

	
}
