package com.DR.Package;

public class DuplicateNumber {

	public static void main(String[] args) {
		System.out.println("2. How do you find the duplicate number on a given integer array?\r\n");
		int NumberArray[] = { 3, 5, 6, 7, 6, 3, 8, 9, 5, 10 };
		String DuplicateNumber = " ";

//System.out.println("length is "+NumberArray.length);

		for (int i = 0; i < NumberArray.length; i++) {
			for (int j = i + 1; j < NumberArray.length; j++) {
				if (NumberArray[i] == NumberArray[j]) {
					DuplicateNumber = " " + NumberArray[i];
					System.out.println("duplicate   " + NumberArray[i]);

				}

			}
		}
		System.out.print("duplucate no is " + DuplicateNumber);

	}
}
