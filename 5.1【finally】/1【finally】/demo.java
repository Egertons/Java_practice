/*
		Finally��⣺
			finally����飺����һ���Ĵ���顣
			ͨ�����ڹر���Դ��
*/
public class demo
{
	public static void main(String[] args)
	{
		hh a = new hh();
		
		try
		{
			int h = a.div(4,-5);
			System.out.println("h="+h);
		}
		catch(fushuException e)
		{
			System.out.println(e.toString());
			return;//����ǿ�Ʒ��ع̶�ֵ��������ֹ������finally�Ĳ��ֻ��ǻ����ִ�С�
		}
		finally
		{
			System.out.println("finally");//finally�д�ŵ���"һ���ᱻִ��"�Ĵ��롣
		}
		
		System.out.println("over");
	}
}


class fushuException extends Exception
{
	fushuException(String msg)
	{
		super(msg);
	}
}


class hh
{
	int div(int a,int b)throws fushuException
	{
		if(b<0)
		{
			throw new fushuException("����Ϊ��");
		}
		return a/b;
	}
}