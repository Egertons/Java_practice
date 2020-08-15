package newKnowledge;
/*
 * 主要返回该线程的字符串表现形式，包括线程名称、优先级、线程组。
 * 
 * 关于优先级：系统默认创建的线程其优先级都是5（可以改最高是10）setPriority()
 * MAX_PRIORITY(线程的最高优先级)
 * MIN_PRIORITY(线程的最低优先级)
 * NORM_PRIORITY(线程的默认优先级)
 * 
 * 关于线程组：通俗理解就是该线程是由“谁”开启的那么该线程的线程组就是谁。
 * 可以创建一个新的线程组对象，来规范化管理各个线程。但是实际中貌似用的不多。
 * */
public class toString_demo {
	public static void main(String[] args) {
		aj a = new aj();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		
		a1.start();
		a1.setPriority(Thread.MAX_PRIORITY);
		a2.start();
		a2.setPriority(Thread.MIN_PRIORITY);
	}
}
class aj implements Runnable{
	public void run() {
		for(int b = 1;b<10;b++) {
			System.out.println(Thread.currentThread().toString()+"\t"+b);
		}
	}
}