package �̰߳�ȫ;

public class demo {

	public static void main(String[] args) {
		h a = new h();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		Thread t4 = new Thread(a);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
/*
 * 
 * �̰߳�ȫ��
 * 			�߳������еĹ����У����û�����Ӧ�Ĵ�ʩ���ڳ����еĹؼ���λ�����п���
 * 			����ʱ�Ե�ͣ��������������״̬����������̣߳���ʵ�����ǲ����ڵ��̣߳���
 * 			Java�Ľ�������ǡ�ͬ������顱
 * 
 * 			synchronized(����)
 * 			{
 * 				��Ҫ��ͬ���Ĵ��롣
 * 			}
 * 
 * 
 * */

class h implements Runnable{
	private int tic = 100;
	Object obj = new Object();
	public void run() {
		while(true) 
		{
		//	synchronized (obj)   //ͬ�������
			//{
				/*
				 * ��ĳһ���߳̽���ʱ�����ȵĶ��������Ǽ���ִ��������߼����ݡ�
				 * �����ȹ�������ʱ���ͬ���������Ѿ�����ֹ�ˡ�
				 * �������߳������һ��ѭ���Ĵ����󲢲���ֱ�ӳ�ͬ����
				 * ���������ȿ������ٳ�ͬ����
				 * */
			//}
			
			show();
		}
	}
	
	public synchronized void show() {
		if(tic>0) 
				{
					try {
						Thread.sleep(10);
					}catch(Exception e) {
						System.out.println("\n"+e.getMessage());
					}
					System.out.println(Thread.currentThread().getName()+"����sale "+tic--);
				}
	}
}

/*
 * ͬ����ǰ�᣺
 * 1.�������������������ϵ��̡߳�
 * 2.�����Ƕ���߳�ͬʱʹ��ͬһ������
 * 		ԭ����Ǳ��뱣֤ͬ����ֻ����һ���߳������С�
 * 
 * �ô�������˶��̵߳İ�ȫ���⡣
 * �׶ˣ�����̶߳���Ҫ�ж���״̬����ԵĽ�Ϊ������Դ��
 * 
 * */

/*
 * ����ͬ����������ֹ���⣺
 * 
 * ͬ�������õ����ĸ����أ�
 * ��Ϊͬ������Ҳ�Ǻ������ʶ�����ӵ�к����������Լ��ص㡣
 * ����������Ҫ�����������õģ���ô����Ǳ���������໥������ʡ�Եľ���this����������󣩡�
 * �ʶ���ͬ���������õ��������Ǳ������
 * 
 * */