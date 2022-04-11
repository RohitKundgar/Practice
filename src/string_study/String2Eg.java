package string_study;

public class String2Eg {

	public static void main(String[] args) 
	{
		//without using new keyword
		//String s = "Hello";
		//with using new keyword
		//String s1= new String("Hello");
		
		
		String s="Velocity";
		String m="Velocity";
		String a="Velocity";
		String m2=new String("VELOCITY");
		String a1=new String("Velocity Corporate");
		String s1=new String("Corporate");
		String m1=new String("Corporate");
		String m3=new String("Training");
		String m4=new String("Center");
		String b="";
		String b1=" ";
		
		System.out.println(m2.concat(m1).concat(m3).concat(m4));
		System.out.println(a1.substring(9,14));  	//Start index=0 and endindex should be desired  +1 eg if you want Corpo then (9,13)gives Corp
		System.out.println(a1.substring(4, 12)); //o/p = city Cor; p is @12th index so did not display.
		System.out.println(m1.endsWith("Cporate")); // false
		System.out.println(m1.startsWith("orp", 1)); // to check if given substring starts at the said index
		System.out.println(s.charAt(2));
		
	}

}
