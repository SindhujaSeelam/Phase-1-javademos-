package javafsd;

import java.util.Arrays;

public class SelectionSortDemo {
public static void main(String[] args) {
	int[] numbers= {90,44,6,2,1,5,6,3,56,34,223,98};
	System.out.println("Before Sorting " + Arrays.toString(numbers));
	System.out.println("Before Sorting " + Arrays.toString(selectionsort(numbers)));
}

static int[] selectionsort(int[] array) {
	for(int i=0;i<array.length;i++) {
		int index=i;
		for(int j=i;j<array.length;j++) {
			if(array[j]<array[index]) {
				index=j;
			}
		}
		int temp=array[i];
		array[i]=array[index];
		array[index]=temp;
	}
	return array;
}
}
