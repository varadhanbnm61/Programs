package varadhany;

import java.util.Scanner;

public class Important_programs {

	public static void main(String[] args) {
		
		
		Important_programs varadhan=new Important_programs();
	//	varadhan.program11();//Print character in java
	//   varadhan.program12();//vowel or consonant in java
	//	varadhan.program13();//Print_AscII value of character
	//	varadhan.program14();//print a to z
	//	varadhan.program15();//maximum number b/w two numbers

	
	
	}
	
	

	private void program15() {
		
		int a=10,b=20;
		if(a>b) {
		
		System.out.println("a is greater than b");
		
	}else {
		System.out.println("b is greater than a");
	}

	}
	private void program14() {
		
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
		
		
		
		
		
	}


	private void program13() {
	
		char ch;
		System.out.println("Enter any character");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		int a=ch;
		System.out.println(ch+"varadhan"+a);
		
		
		
	}


	private void program12() {
		
		char ch;
		System.out.println("Enter any character");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		
		if(ch=='a'||ch=='e'||ch=='u'||ch=='i'
				||ch=='o') {
			System.out.println("your character is vowel");
		}
		else {
			System.out.println("your character in consonant");
		}
		program12();
	}

	private void program11() {
	
		char ch;
		System.out.println("enter a character");
		Scanner v=new Scanner(System.in);
		ch=v.next().charAt(3);
		
		System.out.println(ch);
		
		
	}

}
