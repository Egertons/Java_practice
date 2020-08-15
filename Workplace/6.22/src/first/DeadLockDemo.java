package first;
/*
 * ���ڶ��߳��С��������Ĳ��֡�
 * 
 * ������ʵ�ַ�ʽ��
 * 		ͬ����Ƕ��ͬ������������ͬ������ȴ��ͬ��
 * 
 * ������ļ���������Ǿ�����~ʵ����û��ģ���������״����
 * */
public class DeadLockDemo {

	public static void main(String[] args) {
		Thread a1 = new Thread(Ticket.getclass());
		Thread a2 = new Thread(Ticket.getclass());

		a2.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
		a1.start();
	}

}
class Ticket implements Runnable{
	private static Ticket demo = null;
	private Ticket() {}
	public static Ticket getclass() {
		if(demo==null) {
			synchronized (Ticket.class) {
				if(demo==null) {
					demo=new Ticket();
				}
			}
		}
		return demo;
	}
	public static int tick = 1000;
	Object obj = new Object();
	public void run() {
		synchronized (obj) {
			show();
		}
	}
	public synchronized void show() {
		synchronized (obj) {
			if(tick>0) {
				do {
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
						System.out.println(Thread.currentThread().getName()+"����code����"+tick--);
				} while (tick>0);
			}
		}
	}
}