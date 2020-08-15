package 复习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class shengchan_demo {
	public static void main(String[] args) {
		Rescource res = new Rescource();
		shengchan demo = new shengchan(res);
		xiaofei xiao = new xiaofei(res);
		
		Thread a1 = new Thread(demo);
		Thread a2 = new Thread(demo);
		Thread a3 = new Thread(xiao);
		Thread a4 = new Thread(xiao);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
class Rescource{
	private String name;
	private String id;
	private boolean flag=false;
	private int num=1;
	
	Lock lock = new ReentrantLock();
	Condition con_1 = lock.newCondition();
	Condition con_2 = lock.newCondition();
	public void set(String name,String id) {
		lock.lock();
		try {
			while(flag) {
				con_1.await();
			}
			this.id=id;
			this.name=name;
			System.out.println(Thread.currentThread().getName()+"……生产者……"+name+" "+id);
			flag=true;
			con_2.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
	public void get() {
		lock.lock();
		try {
			while(!flag) {
				con_2.await();
			}
			System.out.println(Thread.currentThread().getName()+"……消费者………………"+name+" "+num++);
			flag=false;
			con_1.signal();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		finally {
			lock.unlock();
		}
	}
}
class shengchan implements Runnable{
	private Rescource res;
	shengchan(Rescource res){
		this.res=res;
	}
	public void run() {
		for(int x = 1;x<=10;x++) {
			res.set("aa","yy");
		}
	}
}
class xiaofei implements Runnable{
	private Rescource res;
	xiaofei(Rescource res){
		this.res=res;
	}
	public void run() {
		for(int x = 1;x<=10;x++) {
			res.get();
		}
	}
}