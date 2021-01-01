package com.DR.Package;

public class LargestSmallest {
	public static void main(String[] args) {
	System.out.println("How do you find the largest and smallest number in an unsorted integer array?");
	System.out.println();

		int NumberArray[]= {32,75,31,45,62,38,79,54};
		int number1=0;
		int min=NumberArray[0];
		int max=NumberArray[0];
		
		for (int i=1; i<NumberArray.length; i++) {
			if(NumberArray[i]< min)
			{min=NumberArray[i];}
			else if(NumberArray[i]>max)
			{max=NumberArray[i];}
		}
		System.out.println("smallest number="+min);
		System.out.println("Largest number ="+max);
		System.out.print("Unsorted array is= ");

	for(int p:NumberArray) {
			System.out.print(p+" ,  ");}
	System.out.println();

	System.out.println();
	for(int i=0; i<NumberArray.length; i++) {
			for(int j=i+1; j<NumberArray.length; j++) {

			if(NumberArray[i] > NumberArray[j]) {
				number1=NumberArray[i];
				NumberArray[i]=NumberArray[j];
				NumberArray[j]=number1;
			}
			}
			}
	
		
System.out.print("Sorted array is= ");
		for(int p:NumberArray) {
			
			System.out.print(p+" ,  ");
		}
	}

}
