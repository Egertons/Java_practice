package 练习;
/*
 * 需求：
 * 银行有一个金库。
 * 有两个储户分别存300元，每次存100，存3次。
 * 
 * 
 * 目的：
 * 		检测该程序是否有安全问题，如果有，该如何解决？
 * 
 * 如何找问题：
 * 		1.明确哪些代码是多线程运行代码。
 * 		2.明确共享数据。
 * 		3.明确多线程运行代码中哪些语句是操作共享数据。
 * */

//同步有两种表现形式：同步代码块、同步函数。
public class demo {
	public static void main(String[] args) {
		Cus c = new Cus();
		Thread c1 = new Thread(c);
		Thread c2 = new Thread(c);
		
		c1.start();
		c2.start();
	}
}

class Bank{
	private int sum;
	Object obj = new Object();
	public synchronized void add(int n) {  //直接在函数上加synchronized 可以直接使函数具备同步性。
		//synchronized (obj) {
			sum+=n;
			System.out.println("sum="+sum);
		//}
	}
}

class Cus implements Runnable{
	private Bank b = new Bank();
	public void run() {
		for(int x = 0;x<3;x++) {   //这里的这个循环“理论上”也可以用同步代码块，但是这样做的话一个人如果没把300元钱都存完，下一个人是存不了钱的。
			b.add(100);
		}
	}
}