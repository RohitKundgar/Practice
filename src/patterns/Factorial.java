package patterns;

public class Factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=4,fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial="+fact);
	}

}
