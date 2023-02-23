package org.sample;

import java.util.Scanner;

public class PrintEvenOdd {
	public static void main(String[] args) {
		/*int print=100;
		for(int i=1;i<=print;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}*/
		System.out.println("eneter number");
		int p;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		for(int i=1;i<=p;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

}
