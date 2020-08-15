package 练习_生产者与消费者;
//经典示例。
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
		this.name = name+"……"+count++;
		this.price = price;
		System.out.println(Thread.currentThread().getName()+"…生产者……"+this.name);
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
		System.out.println(Thread.currentThread().getName()+"……消费者……………"+this.name+"……"+this.price);
		flag=false;
		this.notifyAll();
	}
}
class producer implements Runnable {  //生产者
	private Resource res;
	producer(Resource res){
		this.res = res;
	}
	public void run() {
		for(int x = 0;x<100;x++) {
			res.set("商品名",50);
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