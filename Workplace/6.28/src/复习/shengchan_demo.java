package 复习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shengchan_demo {
	public static void main(String[] args) {
		Rescource res = new Rescource();
		sheng s = new sheng(res);
		xiaofei x = new xiaofei(res);
		Thread a1 = new Thread(s);
		Thread a2 = new Thread(s);
		Thread a3 = new Thread(x);
		Thread a4 = new Thread(x);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
class Rescource{
	private String name;
	private String from;
	private boolean flag = false;
	Lock lock = new ReentrantLock();
	Condition con_1 = lock.newCondition();
	Condition con_2 = lock.newCondition();
	public void set(String name,String from) {
		lock.lock();
		try {
			while(flag) {
				con_1.await();
			}
			this.name=name;
			this.from=from;
			System.out.println(Thread.currentThread().getName()+"\t生产者"+name+" "+from);
			flag = true;
			con_2.signal();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void get() {
		lock.lock();
		try {
			while(!flag) {
				con_2.await();
			}
			System.out.println(Thread.currentThread().getName()+"\t消费者"+name+" "+from);
			flag = false;
			con_1.signal();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}

class sheng implements Runnable{
	private Rescource res;
	public sheng(Rescource res) {
		this.res=res;
	}
	int count = 1;
	public void run() {
		for(int y = 1;y<=10;y++) {
			if(count == 1) {
				res.set("a商品", "China");
			}else {
				res.set("b商品", "USA");
			}
			count=(count+=1)%2;
		}
	}
}

class xiaofei implements Runnable{
	private Rescource res;
	public xiaofei(Rescource res) {
		this.res=res;
	}
	public void run() {
		for(int y = 1;y<=10;y+=1) {
			res.get();
		}
	}
}