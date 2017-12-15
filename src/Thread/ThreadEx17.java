package Thread;

public class ThreadEx17 {

	public static void main(String[] args) {
			
	}
}

class ThreadEx17_1 implements Runnable {
	boolean suspended = false;
	boolean stopped = false;
	
	Thread th;
	
	ThreadEx17_1(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) { }
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
	public void start() { th.start(); }
}