package example1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=sc.nextInt();
		
		int prenum=0;
		int nextnum=1;
		int sum;
		
		for(int i=0;i<=max;i++)
		{
			
			System.out.print(prenum+" ");
			sum=prenum+nextnum;
			prenum=nextnum;
			nextnum=sum;
			
			
		}

	}

}
