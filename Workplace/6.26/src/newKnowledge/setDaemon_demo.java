package newKnowledge;

/*
 * ��̨�߳�(�ػ��߳�)
 * �ص㣺�ñ�������߳�����ǰ�����ɡ�
 * ���⵱���̳߳�Ϊ�ػ��߳�֮��������ػ��̣߳�ͨ�������߳��ֻ��������̣߳����������������ʱ��
 * �ػ��̻߳��Զ��Ľ�����
 */
public class setDaemon_demo {
	public static void main(String[] args) {
		a a = new a();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		
		a1.setDaemon(true);
		a2.setDaemon(true);
		a1.start();
		a2.start();
	}
}
class a implements Runnable{
	public void run() {
		while(true) {
			System.out.println("\nHello World!"+"\t");
		}	
	}
}