package 练习;

public class aa {
	public static void main(String[] args) {
		d demo = new d();
		Thread a = new Thread(demo);
		Thread b = new Thread(demo);
		a.start();
		try {
			Thread.sleep(10);
		}catch(Exception e) {
			
		}
		b.start();
	}
}

class d implements Runnable{
	boolean a = true;
	public void run() {
		synchronized (this) {  //同步代码块的所需对象还可以这么写。
			if(a) {
				for(int g = 0;g<10;g+=1) {
					System.out.println(Thread.currentThread().getName()+"  Hello World"+g);
					if(g%2==0) {
						a=false;
					}
				}
			}
		}	
	}
}
