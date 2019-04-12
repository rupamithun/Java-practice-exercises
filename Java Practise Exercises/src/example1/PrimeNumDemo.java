package example1;

import java.util.Scanner;
//Java Program to display first n prime numbers
public class PrimeNumDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int remainder;
		  boolean isPrime=true;
		        
		  for(int i=2;i<=num/2;i++)
		  {
		   //numberToCheckber is dived by itself
		            remainder=num%i;
		            		            
		       //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
		     if(remainder==0)
		     {
		        isPrime=false;
		        break;
		     }
		  }
		  // Check value true or false,if isprime is true then numberToCheckber is prime otherwise not prime
		  if(isPrime)
		     System.out.println(num + " is a Prime numberToCheckber");
		  else
		     System.out.println(num + " is not a Prime numberToCheckber");
		    
		  
		
		

}
}