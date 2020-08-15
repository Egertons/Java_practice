package 线程间通讯;
/*
 * 多线程间的通讯问题：
 * 
 *其实就是多个线程在操纵同一个资源，但是操作的动作并不同。
 * */
public class demo {
	public static void main(String[] args) {
		Res r = new Res();
		Input in = new Input(r);
		Output out = new Output(r);
		Thread a1 = new Thread(in);
		Thread a2 = new Thread(out);
		
		a1.start();
		a2.start();
	}
}
class Res{   //资源类
	String name;
	String sex;
}
class Input implements  Runnable{
	private Res r;
	Input(Res r){
		this.r=r;
	}
	public void run() {
		int x = 0;
		synchronized (r) {
				if(x==0) {
					r.name="mike";
					r.sex="man";
				}else {
					r.name="张霖";
					r.sex="男";
				}
				x=(x+=1)%2;
		}
	}
}
class Output implements  Runnable{
	private Res r;
	Output(Res r){
		this.r=r;
	}
	public void run() {
		while(true) {
			synchronized (r) {
				System.out.println(r.name+"……"+r.sex);
			}
		}
	}
}