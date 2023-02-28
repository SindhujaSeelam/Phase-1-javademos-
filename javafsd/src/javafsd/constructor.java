package javafsd;

public class constructor {
public static void main(String[] args)
{
	child c = new child();
	child cc = new child(10);
}
}
class parent{
	parent(){
		System.out.println("Parent default constructor");
	}
	parent(int a){
		System.out.println("Parent Parametarized" + a);
	}
}
class child extends parent{
	child(){
	super(10);
		System.out.println("Child default constructor");
	}
	child(int a){
		System.out.println("Parameterized"+ a);
	}
}