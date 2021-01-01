package com.DR.Package;

import java.util.ArrayList;

public class QuickSort {
// Write a program to sort numbers in place using quick sort?

	public static void main(String[] args) {
		int NumberArray[] = { 32, 75, 31, 45, 62, 38, 79, 54 };
		int number1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(64);
		al.add(76);
		al.add(54);
		al.add(26);
		System.out.println(al);
		al.sort(null);
		System.out.println(al);
		System.out.println();
		System.out.println("$$$$$$Other way to sort$$$$$$$");
		for (int i : NumberArray) {
			System.out.print(i + ",");
		}

		System.out.println();

		for (int i = 0; i < NumberArray.length; i++) {
			for (int j = i + 1; j < NumberArray.length; j++) {

				if (NumberArray[i] > NumberArray[j]) {
					number1 = NumberArray[i];
					NumberArray[i] = NumberArray[j];
					NumberArray[j] = number1;
				}
			}
		}

		System.out.print("Sorted array is= ");
		for (int p : NumberArray) {

			System.out.print(p + " ,  ");
		}

	}
}
