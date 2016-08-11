package fifteen;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) 
      {
		int flag=0;
		Scanner s=new Scanner(System.in);
		int lowerlimit=s.nextInt();
		int upperlimit=s.nextInt();
	    int n=s.nextInt();
	    for(int i=lowerlimit;i<=upperlimit;i++)
	    {
	      for(int j=2;j<i;j++)
	      {
		    if(i%j==0)
		    {
			flag=0;
			break;
		    }
		   else
		    {
			 flag=1;
		    }
	      }
	      if(flag==1)
		   {
				System.out.println(i);
		   }
	     }
	    
      }
}

	


