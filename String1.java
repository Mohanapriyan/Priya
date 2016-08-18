import java.util.Scanner;


public class String1 {

	
	public static void main(String args[]) 
	{
           Scanner s=new Scanner(System.in);
           System.out.println("enter the string");
	    java.lang.String str=s.next();
	    CharSequence ch=str.subSequence(1,2);
	    String s1=ch.toString().toUpperCase();
          System.out.println(str.substring(0,1)+s1+str.substring(2,str.length()));

	}

}
