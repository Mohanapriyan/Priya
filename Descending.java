package simplecodes;
import java.util.Scanner;
public class Descending
{
public static void main(String[] args) 
  {
        int n, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array of elements:");
        n = s.nextInt();
        int a[] = new int[6];
        for(int i=0;i<a.length;i++) 
        {
        	a[i] = s.nextInt();
        }
       for(int i=0;i<a.length;i++) {
        for(int j=i+1;j<6;j++) 
          {
        	if(a[i]<a[j]) 
             {
        		t = a[i];
                a[i] = a[j];   
                a[j] =t;
                }
              }
          }
      System.out.print("Descending Order:");
      for (int i=0;i<a.length-1;i++) 
      {
        System.out.print(+a[i]+",");
      }
        System.out.print(a[a.length-1]);
     }
}
