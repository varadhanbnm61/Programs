package varadhany;

import java.util.LinkedList;
import java.util.List;

public class Aug_17_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList(); // Array --> Growable Array
	    al.add("hi");
	    al.add(5);
	    al.add(true);
	    al.add(10.4f);
	    al.add('c');
	    System.out.println(al);
	    
	    al.add(2, "Kalai");
	    al.add(2, "Kalai");
	    System.out.println(al);
	    
	    LinkedList al2 = new LinkedList(); 
	    al2.add(100);
	    al2.add(200);
	    al2.add(300);
	    al2.addAll(2,al);
	    System.out.println(al2);
	    
	    System.out.println(al2.size());
	    
	    System.out.println(al2.contains("Harish"));
	    
	    System.out.println(al2.containsAll(al));
	    
	    System.out.println(al2.get(5)); 
	    
	    System.out.println(al2.indexOf("Kalai"));
	    
	    List ll  = al2.subList(3, 7);
	    System.out.println(ll);
	    al2.remove("Kalai");
	    System.out.println(al2);
	}

}
