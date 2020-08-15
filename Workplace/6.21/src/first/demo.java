package first;
/*
 * 静态修饰同步代码块后，同步所用到的锁并不是this
 * 因为在静态方法区中并不存在this
 * 
 * 静态进内存时，内存中没有本类对象，但是一定有该类所对应的字节码文件的对象。（类名.class）
 * 
 * 
 * 总结：
 * 		静态的同步方法，其使用的锁是该方法所在类的字节码文件对象。
 * */
public class demo {
	public static void main(String[] args) {
		Ticket a = new Ticket();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		Thread a3 = new Thread(a);
		Thread a4 = new Thread(a);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
class Ticket implements Runnable{
	public static int ticket = 100;
	public void run() {
		show();
	}
	public static synchronized void show() {
		if(ticket>0) {
			do {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(Thread.currentThread().getName()+"……code……"+ticket--);
			} while (ticket>0);
		}
	}
}