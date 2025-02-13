/*
 
 A prime number is a number that is greater than 1 and has exactly two factors:
* 1
* The number itself

For example:

Prime Numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23...
Not Prime (Composite) Numbers: 4, 6, 8, 9, 10, 12... (because they have more than two factors)
Special Case: 1 is NOT a prime number because it has only one factor (itself).
 
 
 */


package Interview_Program;

import java.util.Scanner;

public class CheckNumberPrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
       System.out.println("Enter the number :");
       int num=sc.nextInt();
       
       boolean isPrime=true;
       
       if(num<=1)
       {
    	   isPrime=false;
       }
       else
       {
    	   
       }

	}

}
