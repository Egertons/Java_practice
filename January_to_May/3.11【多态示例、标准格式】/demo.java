/*

��̬˵���׾�����ôһ�д��룺
			Fu i = new Zi();


��̬��Ӧ��
��̬�ĳ����ڴ����е��ص�(��̬ʹ�õ�ע������)
		�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�б�����ʧ�ܡ�
		������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����
		
		���ܽ���ǣ��Ǿ�̬��Ա ���� �ڶ�̬���õ�ʱ�򣬱��뿴��ߣ����п��ұߡ�
		              ��Ҳ��Ϊ��̬��ԭ��
		
		������䣺�ڶ�̬�У����ڳ�Ա  ����  ��˵
				�����Ǳ��뻹�����У����ο���ߣ������ͱ����������ࣩ��
						��⣺���ڼ̳���˵���Ӹ����еı��������ڼ̳и��ǹ�ϵ��
									ֻ�к����Ŵ��ڸ�����д��ϵ�������ڵ��ñ������ǳ�����
									ʱ��õ���˭�͵���˭��
		
		������䣺�ڶ�̬�̳��У����ھ�̬��Ա������˵
							Ҳ�����ڼ̳ж�̬��ϵ���õ���˭�͵���˭��
							��Ϊ���Ƕ��Ǿ�̬�ģ�ѹ�����Ͳ��������������
							Ҳ��Ϊ����̬��ԭ��
		
*/


//��̬�ڴ����̳��ϵı�׼Ӧ�á�
public class demo
{
	public static void main(String[] args)
	{
		dostu first = dostu.hh();
		first.show(new gaoji());
	}
}

abstract class Students
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("����˯");
	}
}


class dostu
{
	private dostu(){}
	private static dostu text = new dostu();
	public static dostu hh()
	{
		return text;
	}
	
	public void show(Students s)
	{
		s.study();
		s.sleep();
	}
}


class gaoji extends Students
{
	public void study()
	{
		System.out.println("�ú�ѧϰ");
	}
}


class chuji  extends Students
{
	public void study()
	{
		System.out.println("һ��ѧϰ");
	}
	public void sleep()
	{
		System.out.println("ſ��˯");
	}
}