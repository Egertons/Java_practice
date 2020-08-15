package 等待唤醒机制;
/*
 * 首先唤醒机制除了notify();之外还有一个notifyAll();可同时唤醒全部线程。
 * 
 * 这两个唤醒的机制都必须使用在同步中，因为要对持有监视器（锁）的线程进行操作。
 * 所以要使用在同步中，因为只有同步才具有锁的概念。
 * 
 * 为什么这些操纵线程的方法要定义在Object类中呢？
 * 因为这些方法在操纵同步中的线程时，都必须要标识它们所操纵线程所持有的锁。
 * 只有同一个线程上的被等待线程，才能被同一个锁上的notify();唤醒。
 * 不可以对不同锁中的线程进行唤醒。
 * 
 * 也就是说，等待和唤醒必须是同一把锁。
 * 
 * 而锁可以是任意对象，所以可以被任意对象所调用的方法定义在Object类中。
 * */
public class demo {
	public static void main(String[] args) {
		Res r = new Res();
		input in = new input(r);
		output out = new output(r);
		
		Thread a1 = new Thread(in);
		Thread a2 = new Thread(out);
		
		a1.start();
		a2.start();
	}
}
class Res{
	public String name;
	public String sex;
	public boolean flag = false;
}
class input implements Runnable{
	private Res r;
	input(Res r){
		this.r = r;
	}
	public void run() {
		int x = 0;
		synchronized (r) {
			while(true) {
				if(r.flag) {
					try {
						r.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				if(x==0) {
					r.name="zhanglin";
					r.sex="man";
				}else {
					r.name="sitong";
					r.sex="nv";
				}
				x=(x+=1)%2;
				r.flag = true;
				r.notify();
			}
		}
	}
}
class output implements Runnable{
	private Res r;
	output(Res r){
		this.r = r;
	}
	public void run() {
		while(true) {
			synchronized (r) {
				if(!r.flag) {
					try {
						r.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println(r.name+"……"+r.sex);
				r.flag=false;
				r.notify();
			}
		}
	}
}