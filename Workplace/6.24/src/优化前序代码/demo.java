package 优化前序代码;
/*
 * 主要集中优化于把分线程的资源控制语句集中在资源层处理，
 * 只对外暴露公有方法即可。（对于各分线程的同步问题也集中在资源层集中处理），
 * 这样就不需要将资源直接对外暴露了，可以进行私有化。更加安全。
 * */
public class demo {
	public static void main(String[] args) {
		Res r = new Res();
		new Thread(new input(r)).start();
		new Thread(new output(r)).start();
	}
}
class Res{
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name,String sex) {
		if(flag) {
			try {
				this.wait();
			} catch (Exception e) {
		
			}
		}
		this.name=name;
		this.sex=sex;
		flag = true;
		this.notify();
	}
	public synchronized void get() {
		if(!flag) {
			try {
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(name+"…………"+sex);
		flag = false;
		this.notify();
	}
}
class input implements Runnable{
	private Res r;
	input(Res r){
		this.r = r;
	}
	public void run() {
		int x = 0;
			while(true) {
				if(x==0) {
					r.set("zhanglin","man");
				}else {
					r.set("sitong","nv");
				}
				x=(x+=1)%2;
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
			r.get();
		}
	}
}
