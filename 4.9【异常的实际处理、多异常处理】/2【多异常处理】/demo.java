/*
���ڶ��쳣�Ĵ���
		1.�����쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣
		2.ע�⣺������ֻҪ���쳣�������������Ѿ������ˣ����Բ�����ͬʱ��һ���������׳������쳣��
		3.�Է����������쳣���Ͷ�Ӧ����catch�顣
				������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������档���ص㣩
		
		
		�����ڽ���catch����ʱ��һ��Ҫ�������Ĵ���ʽ��
		��Ҫ�򵥵Ķ���һ��e.printStackTrace()
		Ҳ��Ҫ�򵥵ľ�дһ�����ĵ������䡣
		
		
		
		����淢���쳣�Ļ���catch����Ҫ���еļ���д����
				1.�����쳣��־�ļ���
*/
public class demo
{
	public static void main(String[] args)
	{
		Tools a = new Tools();
		try
		{
			int o = a.w(5,1);
			System.out.println("o="+o);
		}
		catch(ArithmeticException w)
		{
			System.out.println("�쳣����");
		}
		catch(ArrayIndexOutOfBoundsException e)//���쳣������ж��catch
		{
			System.out.println("���쳣�����飩����");
		}
		
		//������������
		catch(Exception w)  //��ΪJava�Ķ�̬�ԣ��ʶ�Exception���Խ��ռ������е��쳣��Ϣ��
		{
			System.out.println("�쳣����");//�����ͬʱ�����ִ���������������ȱ������ԡ����Ƽ����ڶ��쳣�Ĳ�ȱ��©��
		}
	}
}

class Tools
{
	int w(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}