public class demo2
{
	public static void main(String[] arguments)
	{
		
	}
}


/*
�����Ƿ���������ʱ���ų�ʼ����
Ҳ�����������ʱ���أ�   //��ʵҲ���ӳ���һ������
��Ϊ������ʽ
*/
class demo
{
	private static demo s = null;
	private demo()
	{
		
	}
	
	//synchronized Ϊͬ���Ĺؼ��� ����һ���̶��ϸ�������ʽ���ȶ������⡣����Ч�ʽϵ͡�
	//��Ϊ����ʽ�Ķ��߳����ս��������
	public static demo getInstance()
	{
		if(s==null)
		{
			synchronized(demo.class)
			{
				if(s==null)
				{
					s = new demo();
				}
			}
		}
		return s;
	}
}