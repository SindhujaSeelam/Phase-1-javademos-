package javafsd;

public class DaemonThread {
public static void main(String[] args) {
	worker w = new worker();
	w.setDaemon(true);
	System.out.println(w.isDaemon());
}
}

class worker extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
