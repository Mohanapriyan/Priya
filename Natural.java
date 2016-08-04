package simplecodes;

import java.util.Scanner;

public class Natural 

{

  public static void main(String args[])
  {

  int number, i = 1 ;

  int sum = 0;
 System.out.println("Enter Number of items :");

  Scanner s = new Scanner(System.in);

 number = s.nextInt();

  while(i <= number)

 {

  sum = sum +i;
  i++;

  }

  System.out.println("Sum of "+number+" numbers is :"+sum);

   } 



}
