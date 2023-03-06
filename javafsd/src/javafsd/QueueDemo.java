package javafsd;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
public static void main(String[] args) {
	Queue<Integer> qu = new PriorityQueue<>();
	System.out.println(qu.peek());
    Random ran = new Random();
    for(int i=1;i<=10;i++) {
    	qu.offer(ran.nextInt(1,10));
    }
    System.out.println(qu);
    System.out.println(qu.poll());
    System.out.println(qu);
    System.out.println(qu.remove());
    System.out.println(qu);
}


	
}