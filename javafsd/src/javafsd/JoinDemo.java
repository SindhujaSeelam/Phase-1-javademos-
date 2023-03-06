package javafsd;

import java.util.Scanner;

public class JoinDemo {
public static void main(String[] args) {
	System.out.println("Sum of first 'N' numbers");
	System.out.println("Enter a value");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	Calculator calc=new Calculator(n);
	calc.start();
	try {
		Thread.sleep(100);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	printmessage("Sum = "+ calc.getSum());
}
private static void printmessage(String message) {
	System.out.println(Thread.currentThread().getName()+ "-" + message);
}
}

class Calculator extends Thread{
	int n,sum;
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	int getSum() {
		return sum;
	}
}
