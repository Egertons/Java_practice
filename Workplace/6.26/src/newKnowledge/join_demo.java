package newKnowledge;
/*
 * join����������
 * �Ե�ǰ����Ϊ���������߳�ִ�е�join��ʽʱ������a1�߳��Ѿ��������ˣ�
 * ����a1�߳�ִ�е����ģ�ֻҪ���߳��ܹ�����join��䣬˵�����ڵ�CPUִ��Ȩ���Ѿ������߳�������
 * join������ͨ�׽����ǣ�Ӳ������CPUִ��Ȩ���ʶ���������������ִ��Ȩ�����붳��״̬��
 * ��Ȼa2�߳�Ҳ���Ὺ������Ϊѹ������û����a2.start();��
 * ��������ֻ��a1�߳�ӵ��CPU��ִ��Ȩ����a1�߳�ִ����ȫ����������̲߳Ż�ⶳ������ִ��ʣ����롣
 * 
 * 
 * ����a1.join()����������ʵֻ���á������������ͷ���CPU��ִ��Ȩ��
 * ������ڰ�a1.join() �ŵ� a2.start()����Ļ���������ʵ��a1��a2�����̹߳�ͬ����CPU��ִ��Ȩ
 * �����߳�ֻ�е�a1�߳�ִ��������Ż�ⶳ��
 * */
public class join_demo {
	public static void main(String[] args) throws InterruptedException {
		demo d = new demo();
		Thread a1 = new Thread(d);
		Thread a2 = new Thread(d);
		
		a1.start();
		
		a1.join();//join��ͨ����⺬�壺ǿ������CPUִ��Ȩ��
		
		a2.start();
		for(int a = 1;a<80;a++) {
			System.out.println("main\t"+a);
		}
		System.out.println("over");
	}
}
class demo implements Runnable{
	public void run() {
		for(int x = 0;x<70;x++) {
			System.out.println(Thread.currentThread().getName()+"��������"+x);
		}
	}
}