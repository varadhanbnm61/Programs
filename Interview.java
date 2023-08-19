package varadhany;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		  al.add('h');
		  al.add('a');
		  al.add('r');
		  al.add('i');
		  al.add('s');
		  al.add('h');
		  System.out.println(al);
		  
		  LinkedHashSet lhs = new LinkedHashSet(al);
		  System.out.println(lhs);
	}

}
