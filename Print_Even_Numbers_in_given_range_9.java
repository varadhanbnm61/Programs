package varadhany;

import java.util.Scanner;

public class Print_Even_Numbers_in_given_range_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		System.out.println("Enter no of term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=0;i<=n;i+=2) {
			System.out.println(i);
		}
		
		
	}

}
