package 线程安全;

public class demo {

	public static void main(String[] args) {
		h a = new h();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		Thread t4 = new Thread(a);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
/*
 * 
 * 线程安全：
 * 			线程在运行的过程中，如果没有相对应的措施，在程序中的关键部位，就有可能
 * 			会临时性的停下来，这种阻塞状态会产生错误线程（在实际中是不存在的线程）。
 * 			Java的解决方案是“同步代码块”
 * 
 * 			synchronized(对象)
 * 			{
 * 				需要被同步的代码。
 * 			}
 * 
 * 
 * */

class h implements Runnable{
	private int tic = 100;
	Object obj = new Object();
	public void run() {
		while(true) 
		{
		//	synchronized (obj)   //同步代码块
			//{
				/*
				 * 当某一个线程进入时，首先的动作并不是继续执行下面的逻辑内容。
				 * 而是先关锁。这时这个同步代码块就已经被锁止了。
				 * 而当该线程完成了一个循环的代码块后并不是直接出同步。
				 * 而是首先先开锁，再出同步。
				 * */
			//}
			
			show();
		}
	}
	
	public synchronized void show() {
		if(tic>0) 
				{
					try {
						Thread.sleep(10);
					}catch(Exception e) {
						System.out.println("\n"+e.getMessage());
					}
					System.out.println(Thread.currentThread().getName()+"……sale "+tic--);
				}
	}
}

/*
 * 同步的前提：
 * 1.必须有两个或两个以上的线程。
 * 2.必须是多个线程同时使用同一个锁。
 * 		原则就是必须保证同步中只能有一个线程在运行。
 * 
 * 好处：解决了多线程的安全问题。
 * 弊端：多个线程都需要判断锁状态，相对的较为消耗资源。
 * 
 * */

/*
 * 关于同步函数的锁止问题：
 * 
 * 同步函数用的是哪个锁呢？
 * 因为同步函数也是函数，故而，其拥有函数的属性以及特点。
 * 函数都是需要被对象所调用的，那么如果是本类对象间的相互调用所省略的就是this（即本类对象）。
 * 故而，同步函数所用到的锁就是本类对象。
 * 
 * */