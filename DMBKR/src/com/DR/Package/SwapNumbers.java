package com.DR.Package;


	//How to swap two numbers without using temp variable?

public class SwapNumbers {
	
	public void swapVariable(String str1,String str2) {
		int s=str1.length();
		System.out.println("First String= "+str1);
		System.out.println("Second String= "+str2);
		str1=str1.concat(str2);
		str2=str1.substring(0, s);
		str1=str1.substring(s);
		System.out.println("First String after swapping= "+str1);
		System.out.println("Second String after swapping= "+str2);

	}
	public static void main(String[] args) {
		SwapNumbers sn=new SwapNumbers();
		sn.swapVariable("Saad", "shah");

	}

}
