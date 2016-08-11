package simplecodes;

public class Random {
public static void main(String args[])
{
  Random r=new Random();
   for(int number=1;number<=100;number++)
   {
	   System.out.println(r.nextInt(100));
   }
}
}
