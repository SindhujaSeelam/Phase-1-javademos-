package javafsd;
import java.util.Scanner;
public class exceptiondemo {

	public static void main(String[] args) {
		nullpointer();
		dividebyzer0();
	}
	public static void nullpointer() {
		String s=null;
		System.out.print(s.length());
	}
	public static void dividebyzer0() {
		int a,b;
		float c,d;
		System.out.println("Enter numbers to divide...");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			c=a/b;
			d=a%b;
			System.out.print(c+" "+ d);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}

}
