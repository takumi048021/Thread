package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread_run[] th1 = new Thread_run[10];
        Thread_runnable[] th2 = new Thread_runnable[10];
        for(int j = 0;j < 1;j++) {
        	th1[j] = new Thread_run();
        	th1[j].start();
        	th2[j] = new Thread_runnable();
        	th2[j].run();
        	
        
        
        try {
			th1[j].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
        for(int i = 0;i < 10;i++) {
        	System.out.println("main‚©‚ço—Í:"+i);
        }
	}


}
