package com.DR.Package;

import java.util.ArrayList;

public class Anagram {

	public void checkAnagram(String str, String str1) {
		str = str.toUpperCase();
		str1 = str1.toUpperCase();
		;
		ArrayList<Character> AL = new ArrayList<Character>();
		String Result = "";
		for (int i = 0; i < str.length(); i++) {
			AL.add(str.charAt(i));

		}

		for (int j = 0; j < str1.length(); j++) {
			if (AL.size() == str1.length()) {
				if (AL.contains(str1.charAt(j)) == false) {
					Result = " not anagram";
					break;
				} else {
					Result = " anagram";

				}
			} else {
				System.out.println("it's not anagram");
				break;

			}
		}
		System.out.println(str + " and " + str1 + " are " + Result);
	}

	public static void main(String[] args) {
		Anagram a = new Anagram();
		a.checkAnagram("listen", "silent");
		a.checkAnagram("test", "step");
	}

}
