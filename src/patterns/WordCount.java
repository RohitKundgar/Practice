package patterns;

public class WordCount {

	public static void main(String[] args) 
	{
		int count =1;
		//String str2[];
		String str = "Hi I am Rohit, this is my Home Work";
		for(int i=0;i<=str.length()-1;i++)
		{
			if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' '))
			{
				count++;
				
			}
			//System.out.println(count);
		//	str2=str.charAt(i);
		}
		System.out.println(count);
	}

}
