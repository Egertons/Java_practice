package ��ϰ;
/*
 * ����
 * ������һ����⡣
 * �����������ֱ��300Ԫ��ÿ�δ�100����3�Ρ�
 * 
 * 
 * Ŀ�ģ�
 * 		���ó����Ƿ��а�ȫ���⣬����У�����ν����
 * 
 * ��������⣺
 * 		1.��ȷ��Щ�����Ƕ��߳����д��롣
 * 		2.��ȷ�������ݡ�
 * 		3.��ȷ���߳����д�������Щ����ǲ����������ݡ�
 * */

//ͬ�������ֱ�����ʽ��ͬ������顢ͬ��������
public class demo {
	public static void main(String[] args) {
		Cus c = new Cus();
		Thread c1 = new Thread(c);
		Thread c2 = new Thread(c);
		
		c1.start();
		c2.start();
	}
}

class Bank{
	private int sum;
	Object obj = new Object();
	public synchronized void add(int n) {  //ֱ���ں����ϼ�synchronized ����ֱ��ʹ�����߱�ͬ���ԡ�
		//synchronized (obj) {
			sum+=n;
			System.out.println("sum="+sum);
		//}
	}
}

class Cus implements Runnable{
	private Bank b = new Bank();
	public void run() {
		for(int x = 0;x<3;x++) {   //��������ѭ���������ϡ�Ҳ������ͬ������飬�����������Ļ�һ�������û��300ԪǮ�����꣬��һ�����Ǵ治��Ǯ�ġ�
			b.add(100);
		}
	}
}