package javafsd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class practice {
public static void main(String[] args) {	
LinkedList<String> num= new LinkedList<>();
num.add("10");
num.add("1");
num.add("15");
num.add("100");
num.add("4230");
LinkedList<String> num1= new LinkedList<String>(new StringComparator());
//Set<String> iset2 = new TreeSet<String>(new StringComparator());
//Set<String> num2 = (Set<String>) num;
//iset2=num2;
num1=num;
num=num1;
System.out.println(num);


}}
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

