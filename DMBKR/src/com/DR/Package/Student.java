package com.DR.Package;

public class Student {
	int rollNumber;
	String phoneNumber;
	String address;
	String name;
	Student(String name){
		this.name=name;
		System.out.println("Student Name="+this.name);
	}
	private void set(int rollNumber,	String phoneNumber,	String address) {
		this.rollNumber=rollNumber;
		this.phoneNumber=phoneNumber;
		this.address=address;
		
	}
	private void get() {
		System.out.println("Roll  Number= "+this.rollNumber+" ");
		System.out.println("Phone Number= "+this.phoneNumber+" ");
		System.out.println("Address="+ this.address+" ");


	}
	public static void main(String[] args) {
		System.out.println(" Assign and print the roll number, phone number and address of two students having names \"Sam\" and \"John\" respectively by creating two objects of class 'Student'.\r\n" + 
				"");
		Student st1=new Student("Sam");	
		st1.set(23, "453-980-7676", "13242 woodbridge, VA");
		st1.get();
		System.out.println();
		Student st2=new Student("Jhon");

		st2.set(45, "768-098-9999", "657 chicago, USA");
		st2.get();

		}

}
