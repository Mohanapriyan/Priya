package Logical_Building;

import java.util.Scanner;

public class TowerOf{

	   public void get(int number, String first, String auxiliary, String last) {
	       if (number == 1) {
	           System.out.println(first + " -> " +last);
	       } else {
	           get(number - 1, first,last, auxiliary);
	           System.out.println(first+ " -> " +last);
	           get(number - 1, auxiliary,first,last);
	       }
	   }

	   public static void main(String[] args) {
	       TowerOf tower = new TowerOf();
	       System.out.print("Enter number of limit: ");
	       Scanner s = new Scanner(System.in);
	       int limit = s.nextInt();
	       tower.get(limit, "A", "B", "C");
	   }
	}
