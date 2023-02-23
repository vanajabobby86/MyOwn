package org.sample;

import java.util.Scanner;
import java.lang.*;

public class ReverseString {
	public static void main(String[] args) {
//		System.out.println("enter the string");
//		String original,reverse="";
//		Scanner ss=new Scanner(System.in);
//		original=ss.nextLine();
//		int length=original.length();
//		for(int i=length-1;i>=0;i--)
//		{
//			reverse=reverse+original.charAt(i);
//}
//		System.out.println("enter string is:"+reverse);
		
		
String s="welcome to java class";
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
	System.out.println(rev);

}}
