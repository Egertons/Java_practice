package �̼߳�ͨѶ;
/*
 * ���̼߳��ͨѶ���⣺
 * 
 *��ʵ���Ƕ���߳��ڲ���ͬһ����Դ�����ǲ����Ķ�������ͬ��
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
class Res{   //��Դ��
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
					r.name="����";
					r.sex="��";
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
				System.out.println(r.name+"����"+r.sex);
			}
		}
	}
}