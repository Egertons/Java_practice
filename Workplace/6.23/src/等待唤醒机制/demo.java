package �ȴ����ѻ���;
/*
 * ���Ȼ��ѻ��Ƴ���notify();֮�⻹��һ��notifyAll();��ͬʱ����ȫ���̡߳�
 * 
 * ���������ѵĻ��ƶ�����ʹ����ͬ���У���ΪҪ�Գ��м��������������߳̽��в�����
 * ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž������ĸ��
 * 
 * Ϊʲô��Щ�����̵߳ķ���Ҫ������Object�����أ�
 * ��Ϊ��Щ�����ڲ���ͬ���е��߳�ʱ��������Ҫ��ʶ�����������߳������е�����
 * ֻ��ͬһ���߳��ϵı��ȴ��̣߳����ܱ�ͬһ�����ϵ�notify();���ѡ�
 * �����ԶԲ�ͬ���е��߳̽��л��ѡ�
 * 
 * Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������
 * 
 * ��������������������Կ��Ա�������������õķ���������Object���С�
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
				System.out.println(r.name+"����"+r.sex);
				r.flag=false;
				r.notify();
			}
		}
	}
}