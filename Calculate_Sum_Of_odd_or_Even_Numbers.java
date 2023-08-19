package varadhany;
//10

import java.util.Scanner;

public class Calculate_Sum_Of_odd_or_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		int count=0;
		int sum=0;
		System.out.println("Enter no of term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=0;i<=n;i+=2) {
			System.out.println("Even numbers"+i);
			sum=sum+i;
			count++;
		}
		System.out.println(count);
		System.out.println(sum);
		
		
	}

}
