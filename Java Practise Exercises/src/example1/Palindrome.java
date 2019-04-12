package example1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int sum=0;
		int num;
		int lastdigit;
		num=i;
		while(num>0)
		{
			lastdigit=num%10;
			sum=(sum*10)+lastdigit;
			num/=10;
		}
		if(sum==i)
		{
			System.out.println("Is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
