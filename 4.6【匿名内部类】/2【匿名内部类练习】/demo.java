public class demo
{
	public static void main(String[] args)
	{
		Test.function().method();
	}
}

interface Inter
{
	void method();
}

class Test
{
	//�������
	static Inter function()
	{
		/*
		��Ϊ������ֱ��.��������function��
			�ʶ���֪��functionһ���Ǿ�̬�ġ�
		�����ͬʱ��function�����õģ�Ҳ����˵�Ǽ���ó��Ľ����
			ȴ�ǽӿ��е�method����������϶��ǷǾ�̬�ġ�
			����Ҫʹ���������󡣣��ص�����function�ķ���ֵ���Ͳ��ܵ�����д����void��
				��Ӧ����Inter�������͡�
		*/
		return new Inter()
		{
			public void method()
			{
				System.out.println("\nHello World");
			}
		};//.method();
	}

	/*
	static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("Hello World");
		}
	}

	static Inter function()
	{
		return new Inner();
	}
	*/
}

/*
�����ڲ����һ�������������ʽ��
	��������һ���ӿڣ�������һ��������һ��������
	�β��б��������ӿڡ�
	�����ڻ���Ҫ����������������ֱ�ӵ����������
	��ô����ʱ��Ϊ���ķ�����������������
		���ø÷���ʱֱ�������β��б���д�����ڲ��ࡣ
*/


//�����⣺��û�нӿں͸�����������ôд�����ڲ���
class ii
{
	public static void main(String[] args)
	{
		new Object()  //Object����������ĸ��࣡
		{
			public void function()
			{
				System.out.println("����");
			}
		}.function();
	}
}