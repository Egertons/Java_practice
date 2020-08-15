package ��ϰ_��������������;
//����ʾ����
public class demo {
	public static void main(String[] args) {
		Resource res = new Resource();
		producer pro = new producer(res);
		Consumer con = new Consumer(res);
		
		Thread a1 = new Thread(pro);
		Thread a2 = new Thread(pro);
		Thread a3 = new Thread(con);
		Thread a4 = new Thread(con);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
class Resource{
	private String name;
	private double price;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name,double price) {
		while(flag) {
			try {
				this.wait();
			} catch (Exception e) {
				
			}
		}
		this.name = name+"����"+count++;
		this.price = price;
		System.out.println(Thread.currentThread().getName()+"�������ߡ���"+this.name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void get() {
		while(!flag) {
			try {
				this.wait();
			} catch (Exception e) {
				
			}
		}
		System.out.println(Thread.currentThread().getName()+"���������ߡ���������"+this.name+"����"+this.price);
		flag=false;
		this.notifyAll();
	}
}
class producer implements Runnable {  //������
	private Resource res;
	producer(Resource res){
		this.res = res;
	}
	public void run() {
		for(int x = 0;x<100;x++) {
			res.set("��Ʒ��",50);
		}
	}
}

class Consumer implements Runnable{
	private Resource res;
	Consumer(Resource res){
		this.res = res;
	}
	public void run() {
		for(int x = 0;x<100;x++) {
			res.get();
		}
	}
}