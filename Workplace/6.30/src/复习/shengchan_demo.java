package 复习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shengchan_demo {
	public static void main(String[] args) {
		Rescource res = new Rescource();
		shengchan sh = new shengchan(res);
		xiaofei xi = new xiaofei(res);
		
		Thread a1 = new Thread(sh);
		Thread a2 = new Thread(sh);
		Thread a3 = new Thread(xi);
		Thread a4 = new Thread(xi);
		
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
			System.out.println(Thread.currentThread().getName()+"生产者"+name+"\t"+from);
			flag = true;
			con_2.signal();
		} catch (InterruptedException e) {
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
			System.out.println(Thread.currentThread().getName()+"消费者"+name+"\t"+from);
			flag = false;
			con_1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}

class shengchan implements Runnable{
	private Rescource res;
	shengchan(Rescource res){
		this.res=res;
	}
	private int o = 1;
	public void run() {
		for(int a = 1;a<=10;a++) {
			if(o==1) {
				res.set("MI_10","China");
			}else {
				res.set("Apple_ipod","USA");
			}
			o=(o+=1)%2;
		}
	}
}

class xiaofei implements Runnable{
	private Rescource res;
	xiaofei(Rescource res){
		this.res=res;
	}
	public void run() {
		for(int a = 1;a<=10;a++) {
			res.get();
		}
	}
}