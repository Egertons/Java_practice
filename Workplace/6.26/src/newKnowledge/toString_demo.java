package newKnowledge;
/*
 * ��Ҫ���ظ��̵߳��ַ���������ʽ�������߳����ơ����ȼ����߳��顣
 * 
 * �������ȼ���ϵͳĬ�ϴ������߳������ȼ�����5�����Ը������10��setPriority()
 * MAX_PRIORITY(�̵߳�������ȼ�)
 * MIN_PRIORITY(�̵߳�������ȼ�)
 * NORM_PRIORITY(�̵߳�Ĭ�����ȼ�)
 * 
 * �����߳��飺ͨ�������Ǹ��߳����ɡ�˭����������ô���̵߳��߳������˭��
 * ���Դ���һ���µ��߳���������淶����������̡߳�����ʵ����ò���õĲ��ࡣ
 * */
public class toString_demo {
	public static void main(String[] args) {
		aj a = new aj();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		
		a1.start();
		a1.setPriority(Thread.MAX_PRIORITY);
		a2.start();
		a2.setPriority(Thread.MIN_PRIORITY);
	}
}
class aj implements Runnable{
	public void run() {
		for(int b = 1;b<10;b++) {
			System.out.println(Thread.currentThread().toString()+"\t"+b);
		}
	}
}