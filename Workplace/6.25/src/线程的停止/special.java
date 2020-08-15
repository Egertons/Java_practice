package 线程的停止;
/*
 * 特殊情况：
 * 		当线程处于冻结状态时，就不会读取到标记状态。那么线程也就不会结束。
 * 
 * 当程序中没有指定的方式让被冻结的线程回到运行状态时，那么这个线程就无法结束。
 * 这时需要对冻结的线程进行强制性的解冻（需要抛异常），然后再在异常中（catch）中
 * 来关闭资源，或者改变标记值，以关闭该线程。
 * 
 * Thread类中提供了该方法——interrupted()
 * 注意：该方法的功能只是将线程强制的恢复到运行状态（不是停止线程）！！
 * 这时线程被以非正常的方式唤醒，就会进入能将该线程冻结的那个方法的异常处理当中！
 * 注意：这类能将线程冻结的方法所抛出的异常通常都为InterruptedException异常。
 * 主要是在这里进行资源的关闭，抑或是标记的改写。
 * */
public class special {
	public static void main(String[] args) {
		a demo = new a();
		Thread a1 = new Thread(demo);
		Thread a2 = new Thread(demo);
		
		a1.start();
		a2.start();
		int k = 1;
		while(true) {
			if(k++ ==60) {
				a1.interrupt();
				a2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"…………main"+k);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class a implements Runnable{
	private boolean flag = true;
	public synchronized void run() {
		try {
			while(flag) {
				System.out.println(Thread.currentThread().getName()+"…………run");
				this.wait();
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+e.getMessage());
			flag = false;
		}
	}
}