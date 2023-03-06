package javafsd;

public class threadingdemo {
public static void main(String[] args) {
	MultiThread mt = new MultiThread();
	mt.start();
	SingleThread st = new SingleThread();
	st.printNumbers();
}

}
class SingleThread{
	void printNumbers() {
		
		for(int i=1;i<=200;i++) {
		
			System.out.println(Thread.currentThread().getName()+ "-" + i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class MultiThread extends Thread{
	public void run() {
		
		for(int i=1;i<=200;i++) {
			
			System.out.println(Thread.currentThread().getName()+ "-" + i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}
