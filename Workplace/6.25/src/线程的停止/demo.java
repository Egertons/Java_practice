package �̵߳�ֹͣ;
/*
 * stop�����Ѿ���ʱ�ˡ�
 * 		�߳̽�����ԭ��ֻ��һ����
 * 			��run�������սᡣ
 * ���̵߳�����ͨ������ѭ���Ļ��ơ�
 * ������ס��ѭ�����Ϳ�����run�������������������߳̽�����
 * 
 * 
 * ���������
 * 		���̴߳��ڶ���״̬ʱ���Ͳ����ȡ�����״̬����ô�߳�Ҳ�Ͳ��������
 * */
public class demo {
	public static void main(String[] args) {
		stopThread st = new stopThread();
		Thread a1 = new Thread(st);
		Thread a2 = new Thread(st);
		
		a1.start();
		a2.start();
		
		int num = 1;
		while(true) {
			if(num++ ==60) {
				st.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"��������run"+num);
		}
	}
}

class stopThread implements Runnable{
	private boolean flag = true; 
	public void run(){
		while(flag) {
			System.out.println(Thread.currentThread().getName()+"��������run");
		}
	}
	public void changeFlag() {
		flag = false;
	}
}
