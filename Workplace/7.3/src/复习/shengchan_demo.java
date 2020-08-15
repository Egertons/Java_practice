package 复习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shengchan_demo {
	public static void main(String[] args) {
		Rescource res = new Rescource();
		shengchan s = new shengchan(res);
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
			print(Thread.currentThread().getName()+"\t生产者"+name+"  "+from);
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
			print(Thread.currentThread().getName()+"\t消费者"+name+"  "+from);
			flag = false;
			con_1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void print(Object obj) {
		System.out.println(obj);
	}
}

class shengchan implements Runnable{
	private Rescource res;
	shengchan(Rescource res){
		this.res=res;
	}
	int x = 1;
	public void run() {
		for(int y = 1;y<=10;y++) {
			if(x==1) {
				res.set("hh","jj");
			}else {
				res.set("aa","bb");
			}
			x=(x+=1)%2;
		}
	}
}

class xiaofei implements Runnable{
	private Rescource res;
	xiaofei(Rescource res){
		this.res=res;
	}
	public void run() {
		for(int y = 1;y<=10;y++) {
			res.get();
		}
	}
}