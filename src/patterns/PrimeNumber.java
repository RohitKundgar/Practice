package patterns;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter number to check if it is prime:");
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%1==0 && num%i==0 && num%num==0 )
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("is not Prime");
		}
		else
		{
			System.out.println("is Prime");
		}
	}

}
