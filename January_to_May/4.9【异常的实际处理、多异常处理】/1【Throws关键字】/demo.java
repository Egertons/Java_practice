/*
throws ���׳��� Exception���쳣�� ��Ϊ�������в����������ԣ������п��ܴ����쳣��
	�ʶ���Դ���������׸��쳣����ʱ�ڵ��ø÷���ʱ�ͱ����ȡ����ʽ���쳣������ƣ�Ҫ��Ȼ���벻����
	
	
	��ʱ�������ʽ������������֣�
			1.�����׳��������ڵ��ø������쳣�ĺ����ĺ���Ҳ�����׳�~
					��ô������һ��Ĵ�����ƾͻ���Ŵ����п�������һ��������Ҳ�п�����JVM�ײ��������
			2.������׽����try{}catch(){}����������ע�⣺catch����Ĳ���Ҫ�����쳣��������
	
*/
public class demo
{
	public static void main(String[] args)
	{
		Tools demo = new Tools();
		try
		{
			int u = demo.demo(4,0);
			System.out.println("\nu="+u);
		}
		catch(Exception e)
		{
			System.out.println("�쳣����");
			//��ʵ�������ǿ���д�ܶ�ܶණ����
		}
	}
}

class Tools
{
	int demo(int a,int b)throws Exception//�ڹ��ܺ�����ͨ��throws�Ĺؼ��������˸ù����п��ܻ�������⡣
	{
		return a/b;
	}
}