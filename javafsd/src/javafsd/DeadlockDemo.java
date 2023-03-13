package javafsd;

public class DeadlockDemo {
public static void main(String[] args) {
	FirstResource fr = new FirstResource();
	SecondResource sr= new SecondResource();
}
}

class FirstResource{
	void method1() {
		Utils.printmessage("Inseide FirstResource.method1");
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking SecondResource.method2");
		sr.method2();
	}
	void method2() {
		
	}
}
class SecondResource{
	public void method1() {
			Utils.printmessage("Inseide FirstResource.method1");
	try {
		Thread.sleep(2000);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	Utils.printmesage("Invoking SecondResource.method2");}
	fr.method2();
}
	public void method2() {
		
	}
}