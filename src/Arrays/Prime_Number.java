package Arrays;

import java.util.Scanner;

public class Prime_Number {
	
	static void PrimeNum(int num)
	{
		int count=0;
		
		for (int i = 1; i <=num ; i++) {
			
			if (num%i==0) {
				count++;
			}
			
		}
			System.out.println("Count is : "+count);
			
			if(count==2)
			{
				System.out.println("Given number "+num+" is prime number");
			}
			else {
				System.out.println("Given number "+num+" is Not prime number");
			}
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number :  ");
		int number=sc.nextInt();
		PrimeNum(number);
		
//		  int num = 7;  // You can change this number for testing
//	        boolean isPrime = true;
//	        
//	        // Check if num is less than or equal to 1
//	        if (num <= 1) {
//	            isPrime = false;
//	        } else {
//	            // Loop through numbers from 2 to num/2 to check for divisibility
//	            for (int i = 2; i <= num / 2; i++) {
//	                if (num % i == 0) {
//	                    isPrime = false;  // If divisible by any number, it's not prime
//	                    break;  // Exit the loop if found to be non-prime
//	                }
//	            }
//	        }
//
//	        // Print whether the number is prime or not
//	        if (isPrime) {
//	            System.out.println(num + " is prime.");
//	        } else {
//	            System.out.println(num + " is not prime.");
//	        }
	}
	

}
