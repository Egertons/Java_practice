package first;

public class deadlocktry {

	public static void main(String[] args) {
		Ticket demo = new Ticket();
		Thread a1 = new Thread(demo);
		Thread a2 = new Thread(demo);
		
		a1.start();
		a2.start();
	}

}

class Ticket implements Runnable{
	private int tick = 1000;
	Object obj = new Object();
	boolean flag = true;
	public void run() {
		if(flag) {
			while(true) {
				synchronized (obj) {
					show();
				}
			}
		}else {
			while(true)
				show();
		}
	}
	public synchronized void show() {
		synchronized (obj) {
			if(tick>0) {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(Thread.currentThread().getName()+"¡­¡­code¡­¡­"+tick--);
			}
		}
	}
}
