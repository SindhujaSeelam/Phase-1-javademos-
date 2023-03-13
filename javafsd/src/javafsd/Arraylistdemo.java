package javafsd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	alist.add(10);
	Collections.sort(alist, new Mycomparator());
	System.out.println(alist);
}
}
class Mycomparator implements Comparator<Integer>{
	

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
}
