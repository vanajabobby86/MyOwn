package org.sample;

import java.util.Scanner;

public class PolindromNumber {
	public static void main(String[] args) {
		//palindrom or not
		System.out.println("enter the number");
		int a,i=0,j=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		a=n;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i;
		    a=a/10;
		}
		if(n==j)
		{
			System.out.println("palindrom number ");
		}
		else
		{
			System.out.println("not a palindrom number");
		}
		
}

}
