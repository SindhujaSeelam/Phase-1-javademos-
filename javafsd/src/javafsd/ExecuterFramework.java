package javafsd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterFramework {
public static void main(String[] args) {
	VPT[] tasks= {
			new VPT("bank"),
			new VPT("School"),
			new VPT("Conference"),
			new VPT("HomeSecurity")};
	ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
	for(VPT vp:tasks) {
		newFixedThreadPool.submit(vp);
	}
	newFixedThreadPool.shutdown();
}
}

class VPT implements Runnable{
    String sou;
    public VPT(String sou) {
    	this.sou=sou;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(sou);
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sou);
	}
	
}
