package JavaBasicPrograms;

import java.util.Scanner;

public class GenerateFibonnaciSeries {

	   public static void main(String[] args) 
	    {
	        int n;
	        int a = 0;
	        int b = 1;
	         int  c ;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print(a + " " + b);
	        for(int i = 1; i <= n-2; i++)
	        {
	        	c = a + b;
	            a = b;
	            b = c;
	            
	            System.out.print(" "+c);
	        }
	    }

}
