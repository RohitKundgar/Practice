package string_study;

public class StringEg {

	public static void main(String[] args)
	{
		//without using new keyword
		//String s = "Hello";
		//with using new keyword
		//String s1= new String("Hello");
		String s= "Hello";
		String s1=new String("Kazakasthan");
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s));
	}

}
