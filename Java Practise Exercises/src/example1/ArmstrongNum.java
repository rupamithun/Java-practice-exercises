package example1;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int tempnum;
		int digit;
		int digitcubesum=0;
		tempnum=num;
		while(tempnum!=0)
		{
			digit=tempnum%10;
			digitcubesum=(int) (digitcubesum+(Math.pow(digit,3)));
			tempnum/=10;
		}
		if(digitcubesum==num)
		{
			System.out.println("It is an armstrong num");
		}
		else
			System.out.println("It is not an armstrong num");
		
	}

}
