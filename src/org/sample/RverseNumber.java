package org.sample;

import java.util.Scanner;

public class RverseNumber {
	public static void main(String[] args) {
		System.out.println("enter number");
		int a,i=0,j=0;
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		a=n;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
		System.out.println("reverse number is:"+j);
	}}