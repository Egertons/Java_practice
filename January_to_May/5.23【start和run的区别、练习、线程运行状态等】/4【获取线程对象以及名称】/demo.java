/*
		��ȡ�̶߳����Լ�����
				�߳�Ĭ�϶����Լ������ơ�
				Thread-���  �ñ�Ŵ�0��ʼ��
*/
public class demo
{
	public static void main(String[] args)
	{
		h a = new h("one");
		h b = new h("two");
		a.start();
		b.start();
	}
}



class h extends Thread
{
	h(String name)
	{
		super(name);
	}
	public void run()
	{
		//System.out.println(this.getName()+"  run");
		System.out.println(h.currentThread().getName()+"  run");
		//����Thread������һ����̬�ķ��� ���� ��ⷵ�ص�ǰ���̶߳���
		
	}
}