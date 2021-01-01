package com.DR.Package;


public class Palindrome {

	public static void main(String[] args) {
		String str="Eva, Can I Stab Bats In A Cave?";
			str="Madam In Eden, I'm Adam";
		String str3="";
		String Result="";
		str=str.toUpperCase();
		str=str.replaceAll("[^a-zA-Z0-9]", " ");// replace special characters with spaces
		str=str.replaceAll("\\d", "");// replace all digits with spaces
		String[] str1=str.split(" ");
				for(int i=0; i<str1.length; i++) {	
				str3=str3.concat(str1[i]);}
				System.out.println(str3);
				int strLength=str3.length()-1;
				for(int j=0; j<str3.length()/2; j++) {
			if(str3.charAt(j)== str3.charAt(strLength-j)) {
				Result=" This string is Plandrom";
			}
			else 
			{ 
				Result=" This string is not Plandrom";

				}
			}
				System.out.println(Result);
			
					
		

	}

}
