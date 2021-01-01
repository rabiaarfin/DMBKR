package com.DR.Package;

public class Triangle {
	static int area;
	static int perimeter;

	float s;
	int side1=3;
	int side2=4;
	int side3=5;
	public int area() {
		
		s=(side1+side2+side3)/2;
		area=(int) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public int perimeter() {
		return  side1+side2+side3;
	}

	public static void main(String[] args) {
		System.out.println("Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor." );
		Triangle t=new Triangle();
		area=t.area();
		perimeter=t.perimeter();
		System.out.println("The area of triangle= "+area+"m`2");
		System.out.println("The perimeter of triangle= "+perimeter+"m");

	}

}
