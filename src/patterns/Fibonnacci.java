package patterns;

public class Fibonnacci {

	public static void main(String[] args)
	{
		int a= 0, b=1, c=0;
		
		for (int i=0;i<=20;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}

}
