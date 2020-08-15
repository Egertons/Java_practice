package ¸´Ï°;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shengchan_fuxi {
	public static void main(String[] args) {
		Rescource res = new Rescource();
		shengchan j = new shengchan(res);
		xiaofei k = new xiaofei(res);
		Thread a1 = new Thread(j);
		Thread a2 = new Thread(j);
		Thread a3 = new Thread(k);
		Thread a4 = new Thread(k);
		
		a1.start();
		a1.setPriority(Thread.MAX_PRIORITY);
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
	public void set(String name,String from){
		lock.lock();
		try {
			while(flag) {
				con_1.await();
			}
			this.name=name;
			this.from=from;
			flag = true;
			con_2.signal();
		}catch(InterruptedException e) {
			System.out.println(e.toString());
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
			System.out.println(Thread.currentThread().getName()+name+"\t"+from);
			flag=false;
			con_1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}

class shengchan implements Runnable {
	private Rescource res;
	shengchan(Rescource res){
		this.res = res;
	}
	int x = 1;
	public void run() {
		for(int a = 1;a<10;a++) {
			if(x==1) {
				res.set("Mi_10Pro", "China");
			}else {
				res.set("Mac_Pro", "USA");
			}
			x = (x+=1)%2;
		}
	}
}

class xiaofei implements Runnable {
	private Rescource res;
	xiaofei(Rescource res){
		this.res = res;
	}
	public void run() {
		for(int a = 1;a<10;a++) {
			res.get();
		}
	}
}