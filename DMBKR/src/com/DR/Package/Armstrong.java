package com.DR.Package;

import java.util.ArrayList;

public class Armstrong {
//Write code to check whether an integer is Armstrong number or not?
	public void checkArmstrong(int num) {
		int receivedNumber = num;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while (num > 0) {

			AL.add(num % 10);

			num = num / 10;

		}
		int result;

		int s1 = AL.get(0);
		int s2 = AL.get(1);
		int s3 = AL.get(2);
		s1 = s1 * s1 * s1;
		s2 = s2 * s2 * s2;
		s3 = s3 * s3 * s3;
		result = s1 + s2 + s3;
		System.out.println("Given number is= " + receivedNumber);
		if (result == receivedNumber) {
			System.out.println("After calculation= " + result);
			System.out.println(receivedNumber + " is Armstrong");
			System.out.println();

		} else {
			System.out.println("After calculation= " + result);
			System.out.println(receivedNumber + " is not Armstrong");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Armstrong as = new Armstrong();
		as.checkArmstrong(153);
		as.checkArmstrong(375);
	}

}
