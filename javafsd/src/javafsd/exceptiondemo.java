package javafsd;
import java.util.Scanner;
public class exceptiondemo {

	public static void main(String[] args) {
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
