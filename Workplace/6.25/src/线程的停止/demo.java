package 线程的停止;
/*
 * stop方法已经过时了。
 * 		线程结束的原理只有一个：
 * 			即run方法的终结。
 * 多线程的运行通常都是循环的机制。
 * 即控制住了循环，就可以让run方法结束，即可以让线程结束。
 * 
 * 
 * 特殊情况：
 * 		当线程处于冻结状态时，就不会读取到标记状态。那么线程也就不会结束。
 * */
public class demo {
	public static void main(String[] args) {
		stopThread st = new stopThread();
		Thread a1 = new Thread(st);
		Thread a2 = new Thread(st);
		
		a1.start();
		a2.start();
		
		int num = 1;
		while(true) {
			if(num++ ==60) {
				st.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"…………run"+num);
		}
	}
}

class stopThread implements Runnable{
	private boolean flag = true; 
	public void run(){
		while(flag) {
			System.out.println(Thread.currentThread().getName()+"…………run");
		}
	}
	public void changeFlag() {
		flag = false;
	}
}
