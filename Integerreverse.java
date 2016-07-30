package simplecodes;

public class Integerreverse {

	
	public static void main(String[] args) {
		int number=12345;
		int a=0;
		 while(number>=9)
	      {
	    	  a=number%10;
	    	  System.out.print(a);
	    	  number=number/10;
	      }
		 System.out.print(number);
  }
  }
