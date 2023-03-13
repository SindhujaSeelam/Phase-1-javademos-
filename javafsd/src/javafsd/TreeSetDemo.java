package javafsd;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> iset = new TreeSet<Integer>();
		iset.add(10);
		iset.add(3);
		Set<String> iset2 = new TreeSet<String>(new StringComparator());
        iset2.add("Max");
        iset2.add("John");
        iset2.add("William");
        iset2.add("Robert");
        iset2.add("Zoe");
        iset2.add("Zoe");
        System.out.println(iset2);
	}

}
class StringComparator implements Comparator<String>{
	@Override
	public int compare(String str1,String str2) {
	int l1=str1.length();
	int l2=str2.length();
	if(l1<l2) {
		return -1;
	}else if(l1>l2) {
		return 1;
	}else {
		return str1.compareTo(str2);
	}
	}
	
}
