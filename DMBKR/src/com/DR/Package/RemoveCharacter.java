package com.DR.Package;
import java.util.ArrayList;
//How to check if two String are Anagram?

public class RemoveCharacter {
	//Write a method which will remove any given character from a String?
	public static void removeCharacter(String str1,char c) throws IndexOutOfBoundsException {
		ArrayList <Character> AL=new ArrayList<Character>();
		String str=str1;
		System.out.println("First String= "+str);
		String ch=String.valueOf(c);
		str=str.toUpperCase();
		ch=ch.toUpperCase();
		
		int charact=str.indexOf(ch);
		for(int i=0; i<str.length(); i++) {
			AL.add(str.charAt(i));
		}
		AL.remove(charact);
		String str2="";
		for(int j=0; j<AL.size(); j++) {
		 str2+=AL.get(j);}	
		System.out.println("String after removing character="+str2);	
	}

	public static void main(String[] args) {
		removeCharacter("Saad",'a');
			
	}

}

