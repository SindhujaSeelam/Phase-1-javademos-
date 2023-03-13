package javafsd;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortDemo {
public static void main(String[] args) {
	List<Integer> num = new ArrayList<>();
	num.add(10);
	num.add(100);
	num.add(130);
	num.add(120);
	num.add(340);
	num.add(23);
	System.out.println("Before sorting " + num);
	System.out.println("After sorting" +insertion(num));

}

static List<Integer> insertion(List<Integer> num){
	for(int i=1;i<num.size();i++) {
		if(num.get(i)<=num.get(0)) {
			num.add(0,num.get(i));
			num.remove(i+1);
		}else if(num.get(i)<num.get(i-1)) {
			for(int j=1;j<i;j++) {
				if(num.get(i)<num.get(j)) {
					num.add(j,num.get(i));
					num.remove(i+1);
				}
			}
		}
	}
	return num;
}
}
