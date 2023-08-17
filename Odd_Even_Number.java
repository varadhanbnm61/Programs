package varadhany;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		System.out.println("enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n%2==0) {
			System.out.println("given number is even number");
		}
		else {
			System.out.println("given number is odd number");
		}
		
	}

}
