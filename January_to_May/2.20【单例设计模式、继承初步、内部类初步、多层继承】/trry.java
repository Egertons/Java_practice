public class trry
{
	public static void main(String[] args)
	{
		System.out.println("123");
		demoo.m();  //�ⲿ������ڲ��෽��
	}
	
	static class demoo
	{
		public static void m()
		{
			System.out.println("abc");
		}
	}
}



class outer
{
	int x = 9;
	class inner
	{
		int x = 8;
		public void test()
		{
			int x = 7;
			System.out.print(x+"  ");//�������е�x
			System.out.print(this.x+"  ");//��������thisǿ������x
			System.out.print(outer.this.x+"  ");//��  �ⲿ��.this.����  �����ⲿ�ೣ��
			test1();  //�ڲ���������������ⲿ��ķ�����
		}
	}
	
	private void test1()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args)
	{
		inner in = new outer().new inner(); //��������Ҫ��ʵ������һ���ڲ���Ķ���
		//�������ⲿ����ڲ��������������new����һ��д��
		in.test();    //ͨ�����ʵ�����Ķ����������ڲ��ࣨ����ִ���ڲ����һϵ�в����������ڲ�����������õ��ⲿ��������
	}
}

/*
Java֧�ֶ��̳�
�ݲ���ȫ֧�ֶ���ͬʱ�̳�     //�����ö�ʵ�����������
*/