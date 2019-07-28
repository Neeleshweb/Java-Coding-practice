package com.shape;

import java.util.Scanner;

public class Rectangle implements Polygon {

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the rectangle to find area");
	float length=sc.nextFloat();
	System.out.println("Enter the breadth of the rectangle to find area");
	float breadth=sc.nextFloat();
	float area=length*breadth;
	System.out.println("The area of the given rectangle is :" +area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle to find perimeter");
		float length=sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle to find perimeter");
		float breadth=sc.nextFloat();
		float perimeter=2*(length+breadth);
		System.out.println("The perimeter of the rectangle is: " +perimeter);
	}

}
