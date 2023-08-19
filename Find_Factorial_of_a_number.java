package varadhany;
//level2--6
import java.util.Scanner;

public class Find_Factorial_of_a_number {

	public static void main(String[] args) {
		
		int fact=1;
		int n;
		System.out.println("Enter any number");
		Scanner ref=new Scanner(System.in);
n=ref.nextInt();

for(int i=1;i<=n;i++)
{
	
	fact=fact*i;
	
}
System.out.println(fact);
	}

}
