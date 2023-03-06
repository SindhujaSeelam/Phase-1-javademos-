package javafsd;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	
	
Predicate<Integer> tr=(i)->(i>10);
System.out.println(tr.test(10));
	
	
int a[]= {1,2,3,4,5,6};
Predicate<Integer> gt=(i)->(i%2==0);
method(gt,a);
}
public static void method(Predicate<Integer> p,int[] x) {
	for(int i:x) {
		if(p.test(i)) {
			System.out.println(i);
		}
	}
}
}


