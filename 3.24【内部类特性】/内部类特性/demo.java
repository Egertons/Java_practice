public class demo
{
	public static void main(String[] args)
	{
		//ֱ�ӵ���ĳ�ⲿ�����ڲ���̬�����ͨ������
		//new Outer.Inner().fang();    //��׼��ʽ
		
		//ֱ�ӵ���ĳ�ⲿ�����ڲ���̬��ľ�̬������
		//Outer.Inner.fang();
	}
}

class Outer
{
	static class Inner    //�ڲ���̬��
	{
		public static void fang()
		{
			System.out.println("demo");
		}
	}
}

/*
ע�⣺���ڲ����ж����˾�̬��Ա����ô���ڲ�������Ǿ�̬�ġ�
				�����ڲ����һ�����԰ɡ�
				���ⲿ���еľ�̬���������ڲ���ʱ���ڲ��౾��Ҳ���뱻��̬���Ρ�
*/