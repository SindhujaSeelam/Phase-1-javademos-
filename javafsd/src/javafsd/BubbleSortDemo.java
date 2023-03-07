package javafsd;

import java.util.Arrays;

public class BubbleSortDemo {
public static void main(String[] args) {
	int[] numbers= {90,44,6,2,1,5,6,3,56,34,223,98};
	System.out.println("Before Sorting " + Arrays.toString(numbers));
	long start=System.currentTimeMillis();
	System.out.println("Before Sorting " + Arrays.toString(bubblesort(numbers)));
	long end= System.currentTimeMillis();
	System.out.println("Time :" +(end-start));
}
static int[] bubblesort(int[] array) {
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length-1;j++) {
			if(array[j]>array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	return array;
}
}
