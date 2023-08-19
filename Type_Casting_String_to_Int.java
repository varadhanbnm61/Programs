package varadhany;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Type_Casting_String_to_Int {

	public static void main(String[] args) {
		
		
		String varadhan="2345";
		int num=Integer.parseInt(varadhan);
		System.out.println(num);
		int num1=Integer.valueOf(varadhan);
		System.out.println(num);
		int num2=new Integer(varadhan).intValue();
		System.out.println(num2);
		
		
		DecimalFormat num4=new DecimalFormat();
		
		try {
			int num5=num4.parse(varadhan).intValue();
			System.out.println(num5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
