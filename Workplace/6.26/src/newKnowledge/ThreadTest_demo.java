package newKnowledge;
/*
 * �������еĴ����������󣬶��Ҹ�ҵ��������Ҫĳ����ģ��ͬʱ����ʱ��
 * ����Ҫ���������ֳɼ�����ͬ�Ĳ��֣�������װ���̡߳��ö��̵߳�˼����ʵ�֡�
 * 
 * �����������ö��̵߳�˼����з�װ�����ֳ����ķ�װ��ʽ��
 * */
public class ThreadTest_demo {
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				for(int x = 1;x<55;x++) {
					System.out.println("\nHello World!\t"+x);
				}
			}
		}.start();
		
		/*
		 * ���ڳ�������ʵ�Ѿ��������߳��������ˣ����������߳����װ֮��
		 * ʣ�µ������Ȼ���߳̾Ϳ����������ˡ�
		 * */
		for(int x = 1;x<55;x++) {
			System.out.println("\nHello Java!\t"+x);
		}
		
		Runnable r = new Runnable() {
			public void run() {
				for(int x = 1;x<55;x++) {
					System.out.println("\nHello DaLian!\t"+x);
				}
			}
		};
		new Thread(r).start();
	}
}