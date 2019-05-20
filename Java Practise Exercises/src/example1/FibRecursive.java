package example1;

import java.util.Scanner;

public class FibRecursive {
	

	public static void main(String[] args) {
		System.out.println("Enter a num");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		Fib fr=new Fib();
		int newnum=fr.fib(n);
		
		
		
		System.out.println("The "+n+"th Number in Fibonacci series is ");
		System.out.println(newnum);
		
		
		
		

	}

}
