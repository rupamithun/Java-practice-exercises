package example1;
import java.util.*;
//Java Program to check Even or Odd number?
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
		
		

	}

}
