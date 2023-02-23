package javafsd;

public class staticex {
	
public static void main(String[] args) 
{
System.out.println("Main method");
method();
	}
	static {
		System.out.println("Static Block");
	}
static  void method(){
	System.out.println("Static Method");
}
}
