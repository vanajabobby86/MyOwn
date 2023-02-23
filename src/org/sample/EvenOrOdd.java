package org.sample;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("enter number");
	Scanner s=new Scanner(System.in);
	int count=s.nextInt();
	if(count%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}

}}
