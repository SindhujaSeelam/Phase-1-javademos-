package javafsd;

import java.util.ArrayList;

public class Arraylistdemo {
public static void main(String[] args) {
	demo();
}
public static void demo() {
	ArrayList<Integer> alist = new ArrayList<Integer>();
	for(int i=10;i<=100;i+=10) {
		alist.add(i);
	}
	System.out.println(alist);
	alist.set(3,101);
	System.out.println(alist);
	alist.remove(4);
	System.out.println(alist);
	int x= alist.indexOf(30);
	System.out.println(x);
}
}
