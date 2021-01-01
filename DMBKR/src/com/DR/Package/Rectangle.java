package com.DR.Package;

public class Rectangle {
	int a;
	int b;
	Rectangle(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int area() {
		return a*b;
	}

	public static void main(String[] args) {
		System.out.println("Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class"
		+ " named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.");
	
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		System.out.println("Area of First  Recangle="+r1.area());
		System.out.println("Area of second Recangle="+r2.area());


	
	}

}
