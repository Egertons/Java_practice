package �Ż�ǰ�����;
/*
 * ��Ҫ�����Ż��ڰѷ��̵߳���Դ������伯������Դ�㴦��
 * ֻ���Ⱪ¶���з������ɡ������ڸ����̵߳�ͬ������Ҳ��������Դ�㼯�д�����
 * �����Ͳ���Ҫ����Դֱ�Ӷ��Ⱪ¶�ˣ����Խ���˽�л������Ӱ�ȫ��
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
		System.out.println(name+"��������"+sex);
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
