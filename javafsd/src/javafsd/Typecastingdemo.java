package javafsd;

public class Typecastingdemo {
	public static void main(String[] args) {
		byte b=100;
		int a=10;
		b=(byte)a;
		System.out.println(b);
		long l=a;
		System.out.println(l);
		char c='a';
		int x=c;
		System.out.println(x);
		int y=119;
		char z=(char)y;
		System.out.println(z);
	}

}
