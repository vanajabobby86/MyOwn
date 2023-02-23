package org.sample;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		System.out.println("enter string");
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		original=s.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("palindrom number");
		}
		else
		{
			System.out.println("not a palindrom number");
		}
	}
}

