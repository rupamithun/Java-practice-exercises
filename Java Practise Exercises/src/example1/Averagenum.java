package example1;

import java.util.Scanner;

//Calculate average of numbers entered by user

public class Averagenum
{

	public static void main(String[] args) {
		System.out.println("How many number you wanter to enter?");
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		double total=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Element no. "+(i+1)+":");
			 arr[i]=scan.nextInt();
			 
		 }
		 scan.close();
		 for(int i=0;i<arr.length;i++)
		 {
			 total=total +arr[i]; 
		 }
		 
		double avg=total/arr.length;
		System.out.println("average is:" +avg);
	}

}
