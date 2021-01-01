package com.DR.Package;
//1. How do you find the missing number in a given integer array of 1 to 100?

public class MissingNumber {

	public static void main(String[] args) {
		int NumberArray[]= new int[100];
		int count=0;
		int counter=0;
		int MissingNumber=0;
		for(int i=0 ; i<NumberArray.length; i++) {
		if (count==100) {
			break;}
			
			if (count==75 || count==96 || count==98 ) {
					count++;
				}
			
			NumberArray[i]=count;
			
			count++;	
		}//end first for
		//System.out.println("Count is= "+count);
		System.out.print("$$$$$$$$$$$$$$$$$$$ Missing Numbers $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		
		
		for(int j=0; j<NumberArray.length; j++ ) {
			if(counter==100) {
				break;
			}
			if(NumberArray[j]!=counter) {	
				System.out.println("Missing number is= "+counter);
				MissingNumber++;
				counter++;

			}
			counter++;
		}
	System.out.println("Total missing number= "+MissingNumber);

	}

}
