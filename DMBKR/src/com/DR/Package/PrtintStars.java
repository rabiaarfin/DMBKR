package com.DR.Package;

public class PrtintStars {

	
	 
	
	public static void main(String[] args) {
System.out.println("//////////////// Question 1 (i)///////////////////");	

		int reqnum=5;
		int num=0;
		int num1=1;
		int num2=1;
		System.out.print(num1+" ");

		for(int i=0; i<=reqnum; i++) {
			num=num2+num1;
			num2=num1;
			num1=num;
			System.out.print(num+"   ");
		}
		System.out.println();

	System.out.println("//////////////// Question 2 (i)///////////////////");	
		char a='*';

		for(int j=0; j<4; j++) {
		for(int i=0; i<10; i++) {
			System.out.print(a);
			
		}// end inner for
		System.out.println();

	}// end outer for
		System.out.println("////////////////(ii)////////////////////////");
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("////////////////(iii)////////////////////////");

		int  spacecount=5;
		for(int i=0; i<=5; i++) {
				for(int k=spacecount; k>=0; k--) {
					System.out.print(" ");

				}

			for(int j=0; j<=i; j++) {

				System.out.print("*");
			}
			System.out.println();
				spacecount--;		
		}
		System.out.println("////////////////(iV)////////////////////////");

		
		int  spacecount1=5;
		for(int i=0; i<10; i=i+2) {
				for(int k=spacecount1; k>=0; k--) {
					System.out.print(" ");

				}

			for(int j=0; j<=i; j++) {

				System.out.print("*");
			}
			System.out.println();
				spacecount1--;
			
		}
		System.out.println("////////////////(V)////////////////////////");
		
		int  spacecount2=5;
		int number=1;
		for(int i=0; i<10; i=i+2) {
				for(int k=spacecount2; k>=0; k--) {
					System.out.print(" ");

				}

			for(int j=0; j<=i; j++) {

				System.out.print(number);
			}
			System.out.println();
				spacecount2--;
				number++;
	
			
		}
		
		System.out.println("////////////////(Vi)////////////////////////");
		int  spacecount3=5;
		int number1=1;
		int n=1;
		
		for(int i=1; i<10; i=i+2) {
				for(int k=spacecount3; k>=0; k--) {
					System.out.print(" ");
				}
				

			for(int j=1; j<=i; j++) {
			
				if (n!=0 && n!=1) {
					
					System.out.print(Math.abs(n));
				}
				n--;
			

				}
			System.out.println();
				spacecount3--;
				n=number1++;

			
	
			
		}
		
		}// end main

}//end class


