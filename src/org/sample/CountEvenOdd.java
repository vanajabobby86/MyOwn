package org.sample;

import java.util.Scanner;

public class CountEvenOdd 
{
	public static void main(String[] args)
	{
		/*System.out.println("enter the number");
		int count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}	}
System.out.println(count);
	}*/
		
		int count=0;int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
System.out.println(count);}
}
