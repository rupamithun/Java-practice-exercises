package example1;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
