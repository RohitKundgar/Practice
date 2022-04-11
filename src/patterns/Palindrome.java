package patterns;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in))
		{		
		System.out.println("Enter string to check:");
		String originalString= sc.next();
		String reverse="";
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reverse=reverse+originalString.charAt(i);
		}
		
		if(originalString.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String not plaindrome");
		}
		
	}
		catch (InputMismatchException e) 
		{
			System.out.println("Please Enter valid input");
		}
	}
}
