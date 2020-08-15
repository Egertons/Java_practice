package 复习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//以及对于代码进行优化       使用JDK5.0新特性的Lock锁

/*
 * JDK1.5(又称JDK5.0)提供了多线程的升级解决方案。
 * 将synchronized替换成显式的Lock锁操作。
 * 将Object超类中的wait、notify、notifyAll等替换成Condition对象。
 * 该对象可以通过Lock锁进行获取。
 * 
 * 在该示例中实现了本方只唤醒对方的操作。（不需要每次都要唤醒全部线程再进行标记的判断）
 * */
public class demo {
	public static void main(String[] args) {
		Resource res = new Resource();
		
		shengchan shengchan = new shengchan(res);
		xiaofeizhe xiaofei = new xiaofeizhe(res);
		
		Thread a1 = new Thread(shengchan);
		Thread a2 = new Thread(shengchan);
		Thread a3 = new Thread(xiaofei);
		Thread a4 = new Thread(xiaofei);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		
	}
}
class Resource{
	private String name;
	private double price;
	private int count = 0;
	private boolean flag = false;
	
	private Lock lock = new ReentrantLock();
	
	Condition condition_shengchan = lock.newCondition();
	Condition condition_xiaofei = lock.newCondition();
	
	public void in(String name,double price) {
		lock.lock();
		try {
			while(flag) {
				condition_shengchan.await(); 
			}
			this.name = name;
			this.price = price;
			this.count+=1;
			System.out.println(Thread.currentThread().getName()+"\t"+this.name+this.price+"……生产者……"+this.count);
			flag=true;
			condition_xiaofei.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();//释放锁的动作由于一定要执行，故而要放在finally中。
		}
	}
	public void get() {
		lock.lock();
			try {
				while(!flag) {
					condition_xiaofei.await(); 
				}
				System.out.println(Thread.currentThread().getName()+this.name+this.price+"……消费者…………"+this.count);
				flag=false;
				condition_shengchan.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				lock.unlock();
			}
	}
}

class shengchan implements Runnable{
	Resource res ;
	shengchan(Resource res){
		this.res=res;
	}
	int y = 1;
	public void run() {
		for(int ount = 1;ount<=10;ount++) {
			if(y==1) {
				res.in("Apple_Mac Pro", 5000);
			}else {
				res.in("MI_10", 3299);
			}
		}
		y=(y+=1)%2;
	}
}

class xiaofeizhe implements Runnable{
	Resource res ;
	xiaofeizhe(Resource res){
		this.res=res;
	}
	public void run() {
		for(int x = 1;x<=10;x++) {
			res.get();
		}
	}
}