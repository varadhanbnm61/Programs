package varadhany;

import java.util.Scanner;

public class Print_odd_numbers_in_Given_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n;
		int sum=0;
		System.out.println( "Enter no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i=i+2) {
			System.out.println(i);
			
		}
		
	}

}
