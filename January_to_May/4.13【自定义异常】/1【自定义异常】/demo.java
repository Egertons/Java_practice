/*
		�Զ����쳣��
				��Ϊ����Ŀ�л�������е����⣬
				����Щ���Ⲣδ��Java����װ��
				���Զ�����Щ���е�������԰���Java�Ķ�����ķ�װ˼��
				�����е����⣬�����Զ���ķ�װ����
				
				
				����
						�ڱ����������ض��壺������������Ϊ�㡢Ҳ����Ϊ����
						
						
				���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������
				1.Ҫô���ڲ�try catch{}����
				2.Ҫô�ں����������õ����ߴ���(�׳�)   
				�ܽ�һ�仰��Ҫô����Ҫô�ף�
				
				һ������£������ڳ����쳣����������Ҫ������
				
				
				��α�д�Զ����쳣�еķ�����
				��Ϊ���Զ������Ǽ̳������쳣���
				�Ҹ������Ѿ����쳣��Ϣ����ز���������ˡ�
				��������ֻҪ�ڹ����ʱ�򣬽��쳣��Ϣ���ݸ�����ͨ��super��䡣
				��ô�Ϳ���ֱ��ͨ��getMessage()������ȡ���Զ�����쳣��Ϣ��
*/
public class demo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("\n"+Tools.demo(4,-2));
		}
		catch(fushuException e)
		{
			System.out.println("\n�쳣����׽�ɹ�");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getvalue());
		}
	}
}


class Tools
{
	static int demo(int a,int b)throws fushuException
	{
		if(b<0)//ǰ���ж�
		{
			throw new fushuException("by fushu",b);//�����ֶ�ͨ��throw�ؼ����׳�һ��fushuException�Զ����쳣����
		}
		
		return a/b;
	}
}



/*
		�����Զ����쳣������Ҫ�ر�Ľ���һ��������������
		����ֻ�м̳�Exception�Ż�ʹfushuException��Ϊ�Զ����쳣������������쳣��һЩ���ԡ�
*/
class fushuException extends Exception  //�����Exception��һ��Java�еĹ淶
{
	/*
	private String msg;
	fushuException(String msg)
	{
		this.msg = msg;
	}
	public String getmessage()
	{
		return msg;
	}
	*/
	private int value;
	fushuException(String msg,int value)
	{
		super(msg);
		this.value = value;
	}
	fushuException()
	{
		super();
	}
	public int getvalue()
	{
		return value;
	}
}
/*
�ܽ᣻
		�Զ����쳣��
				�������Զ�����̳�Exception
		Ϊʲô����̳�Exception
				��Ϊ�쳣����Ͷ�����Ҫ���׳���
				�������ʱ���쳣����Ͷ���;߱���һ���Ŀ����ԡ�
				�����ͬʱ��ֻ�б��̳��ŵ�Throwable�����try catch{}��������
*/