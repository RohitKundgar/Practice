package patterns;

public class Armstrong {

	public static void main(String[] args) 
	{
		int num=153;
		int num2;
		//153 153/10=15
		//153%10=3
		//15/10=1
		//15%10=5
		//1/10=
		int add;
		for(int i=num;i>=1;i=i/10)
		{
			num2=num%10;
			add=add+(num2*num2*num2);
		}
		
	}

}
