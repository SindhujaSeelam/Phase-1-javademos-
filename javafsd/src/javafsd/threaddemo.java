package javafsd;

public class threaddemo {
public static void main(String[] args) {
	A a= new A();
	B b= new B();
	C c= new C();
	a.start();
	try {
		a.join();
	}catch(Exception e) {
		
	}
	
	b.start();
	
	c.start();
}
}

class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Thread 1");}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Thread 2");}
	}
}
class C extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Thread 3");}
	}
}