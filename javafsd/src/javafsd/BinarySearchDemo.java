package javafsd;

import java.util.Arrays;

public class BinarySearchDemo {
 public static void main(String[] args) {
	int sitem=5;
	 int[] arr= {45,34,23,54,67,11,78};
	System.out.println("Before sorting" + Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("After sorting " + Arrays.toString(arr));
	int index=binarysearch(arr,sitem);
	if(index==-1) {
		System.out.println("Item " + sitem +" not found");
		
	}else {
		System.out.println("Item " + sitem + "found at "+ index);
	}
}
 
 private static int binarysearch(int[] arr, int sitem) {
	 int fin=0;
	 int lin=arr.length-1;
	 int min=(fin+lin)/2;
	 while(fin<=lin) {
		 if(sitem>arr[min]) {
			 fin=min+1;
		 }else if(sitem==arr[min]) {
			 return min;
		 }else {
			 lin=min-1;
		 }min=(fin+lin)/2;
	 }
	 return -1;
 }
}
