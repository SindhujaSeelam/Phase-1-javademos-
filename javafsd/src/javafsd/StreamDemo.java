package javafsd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	for(int i=1;i<11;i++) {
		list.add(i);
	}
	List<Integer> fil=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(fil);
	List<Integer> mul=list.stream().map(i->i*20).collect(Collectors.toList());
	System.out.println(list);
	System.out.println(mul);
	
	
	List<String> names=new ArrayList<>();
	names.add("MAX");
	names.add("RADHA");
	
	List<String> nam=names.stream().map(i ->i.toLowerCase()).collect(Collectors.toList());
	System.out.println(nam);

}
}
