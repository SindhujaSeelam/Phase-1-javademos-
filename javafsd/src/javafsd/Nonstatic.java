package javafsd;

public class Nonstatic {
	public Nonstatic(){
		System.out.println("From Constructor");
	}
	{
		System.out.println("Non static Block");
	}
	public void method()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args) {

		System.out.println("Main Method");
		Nonstatic n =new Nonstatic();
		n.method();
}

}
