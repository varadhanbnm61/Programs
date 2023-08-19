package varadhany;

public class Parameterized_Constructor {
	
	int id;
	String name;
	Parameterized_Constructor(int a,String n){
		
		id=a;
		name=n;
	}
	
	
	public static void main(String[] args) {
		
		Parameterized_Constructor s1=new Parameterized_Constructor(100, "varadhan");
		Parameterized_Constructor s2=new Parameterized_Constructor(100, "varadhan");
		s1.student();
		s2.student();
		
		

	}


	private void student() {
		System.out.println(id+" "+name);
		
	}

}
