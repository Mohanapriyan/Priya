import java.util.Scanner;
public class Nfibonacci 
  {
         public static void main(String[] args) {
		int n1=0;int n2=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=s.nextInt();
		int c=0;
		for(int i=0;i<limit;i++)
		{
		    c=n1+n2;
		    n1=n2;
		    n2=c;
		}
		System.out.println(c);
      }

}
