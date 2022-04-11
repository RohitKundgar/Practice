package string_study;

public class RevString {

	public static void main(String[] args)
	{
		
		String rev = null;
		String s1="welcome to java";
		String s2=" ";
		String[] s3 = s2.split(s1);
		for(int i=;i<=2;i++)
		{
			String temp = s3[i];
			for(int j=temp.length()-1;j>=0;j--)
			{
			rev=rev+temp.charAt(j);
			}
		}	
		
		
		System.out.println(rev);
		
	}


}
