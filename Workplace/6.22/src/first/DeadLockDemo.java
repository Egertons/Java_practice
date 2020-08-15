package first;
/*
 * 关于多线程中“死锁”的部分。
 * 
 * 常见的实现方式：
 * 		同步中嵌套同步。但是两个同步的锁却不同。
 * 
 * 在这个文件中我真的是尽力了~实在是没有模拟出死锁的状况。
 * */
public class DeadLockDemo {

	public static void main(String[] args) {
		Thread a1 = new Thread(Ticket.getclass());
		Thread a2 = new Thread(Ticket.getclass());

		a2.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
		a1.start();
	}

}
class Ticket implements Runnable{
	private static Ticket demo = null;
	private Ticket() {}
	public static Ticket getclass() {
		if(demo==null) {
			synchronized (Ticket.class) {
				if(demo==null) {
					demo=new Ticket();
				}
			}
		}
		return demo;
	}
	public static int tick = 1000;
	Object obj = new Object();
	public void run() {
		synchronized (obj) {
			show();
		}
	}
	public synchronized void show() {
		synchronized (obj) {
			if(tick>0) {
				do {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
						System.out.println(Thread.currentThread().getName()+"……code……"+tick--);
				} while (tick>0);
			}
		}
	}
}