package newKnowledge;
/*
 * �÷������������ڣ���ͣ��ǰ�̲߳�ִ�������̡߳�
 * */
public class yield_demo {
	public static void main(String[] args) {
		zh jj = new zh();
		Thread a1 = new Thread(jj);
		Thread a2 = new Thread(jj);
		
		a1.start();
		a2.start();
	}
}
class zh implements Runnable{
	public void run() {
		for(int k = 0;k<10;k++) {
			System.out.println(Thread.currentThread().toString()+"\t"+k);
			Thread.yield();//��ͣ��ǰ�̣߳���ִ�������̣߳������ԣ���
		}
	}
}