package simplecodes;

public class Binary {

	public static void main(String[] args) {
		int Num=50;
		int number=Num;
		int num=Num;
     	int rem=0;
		String b="";
		while (Num > 0)
        {
             rem=Num%2;
             b=rem+b;
             Num = Num/2;
        }
      System.out.println(b);
      String octal="";
      while (number > 0)
      {
           rem=number%8;
           octal=rem+octal;
           number=number/8;
      }
     System.out.println(octal);
     String hexa="";
     while (num > 0)
     {
          rem=num%16;
          hexa=rem+hexa;
          num=num/16;
     }
    System.out.println(hexa);
      
     
	}

}
