package varadhany;

import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		int sum=0;
		System.out.println( "Enter no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
