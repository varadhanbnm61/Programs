package varadhany;

class Constructor_overloading{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    public Constructor_overloading(int i,String n) {
		// TODO Auto-generated constructor stub
	
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    public Constructor_overloading(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Constructor_overloading s1 = new Constructor_overloading(111,"Karan");  
    Constructor_overloading s2 = new Constructor_overloading (222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  