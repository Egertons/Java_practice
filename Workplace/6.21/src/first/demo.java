package first;
/*
 * ��̬����ͬ��������ͬ�����õ�����������this
 * ��Ϊ�ھ�̬�������в�������this
 * 
 * ��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и�������Ӧ���ֽ����ļ��Ķ��󡣣�����.class��
 * 
 * 
 * �ܽ᣺
 * 		��̬��ͬ����������ʹ�õ����Ǹ÷�����������ֽ����ļ�����
 * */
public class demo {
	public static void main(String[] args) {
		Ticket a = new Ticket();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		Thread a3 = new Thread(a);
		Thread a4 = new Thread(a);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
class Ticket implements Runnable{
	public static int ticket = 100;
	public void run() {
		show();
	}
	public static synchronized void show() {
		if(ticket>0) {
			do {
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(Thread.currentThread().getName()+"����code����"+ticket--);
			} while (ticket>0);
		}
	}
}