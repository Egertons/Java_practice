package ��ϰ;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//�Լ����ڴ�������Ż�       ʹ��JDK5.0�����Ե�Lock��

/*
 * JDK1.5(�ֳ�JDK5.0)�ṩ�˶��̵߳��������������
 * ��synchronized�滻����ʽ��Lock��������
 * ��Object�����е�wait��notify��notifyAll���滻��Condition����
 * �ö������ͨ��Lock�����л�ȡ��
 * 
 * �ڸ�ʾ����ʵ���˱���ֻ���ѶԷ��Ĳ�����������Ҫÿ�ζ�Ҫ����ȫ���߳��ٽ��б�ǵ��жϣ�
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
			System.out.println(Thread.currentThread().getName()+"\t"+this.name+this.price+"���������ߡ���"+this.count);
			flag=true;
			condition_xiaofei.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();//�ͷ����Ķ�������һ��Ҫִ�У��ʶ�Ҫ����finally�С�
		}
	}
	public void get() {
		lock.lock();
			try {
				while(!flag) {
					condition_xiaofei.await(); 
				}
				System.out.println(Thread.currentThread().getName()+this.name+this.price+"���������ߡ�������"+this.count);
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