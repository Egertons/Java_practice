package �̵߳�ֹͣ;
/*
 * ���������
 * 		���̴߳��ڶ���״̬ʱ���Ͳ����ȡ�����״̬����ô�߳�Ҳ�Ͳ��������
 * 
 * ��������û��ָ���ķ�ʽ�ñ�������̻߳ص�����״̬ʱ����ô����߳̾��޷�������
 * ��ʱ��Ҫ�Զ�����߳̽���ǿ���ԵĽⶳ����Ҫ���쳣����Ȼ�������쳣�У�catch����
 * ���ر���Դ�����߸ı���ֵ���Թرո��̡߳�
 * 
 * Thread�����ṩ�˸÷�������interrupted()
 * ע�⣺�÷����Ĺ���ֻ�ǽ��߳�ǿ�ƵĻָ�������״̬������ֹͣ�̣߳�����
 * ��ʱ�̱߳��Է������ķ�ʽ���ѣ��ͻ�����ܽ����̶߳�����Ǹ��������쳣�����У�
 * ע�⣺�����ܽ��̶߳���ķ������׳����쳣ͨ����ΪInterruptedException�쳣��
 * ��Ҫ�������������Դ�Ĺرգ��ֻ��Ǳ�ǵĸ�д��
 * */
public class special {
	public static void main(String[] args) {
		a demo = new a();
		Thread a1 = new Thread(demo);
		Thread a2 = new Thread(demo);
		
		a1.start();
		a2.start();
		int k = 1;
		while(true) {
			if(k++ ==60) {
				a1.interrupt();
				a2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"��������main"+k);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class a implements Runnable{
	private boolean flag = true;
	public synchronized void run() {
		try {
			while(flag) {
				System.out.println(Thread.currentThread().getName()+"��������run");
				this.wait();
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+e.getMessage());
			flag = false;
		}
	}
}