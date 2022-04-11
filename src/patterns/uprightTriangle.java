package patterns;

public class uprightTriangle {

	public static void main(String[] args) 
	{
//		*
//	   ***
//	  *****
//	 *******
	int star=1;
	int space=3;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
	}
	}

}
