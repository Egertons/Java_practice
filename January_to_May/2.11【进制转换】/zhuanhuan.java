/*
����һ������ɵĽ���ת������ʾ����
#��Ҫע����ǣ���ʵ�ʵĿ��������з���������Ӧ�÷��صĲ���ֵ����Ӧ��ΪString.
*/
public class zhuanhuan
{
	public static void main(String[] args)
	{
		//����
		er(-6);
		ba(88);
		shiliu(-60);
		er(0);
	}
	
	
	//ʮ����ת������
	public static void er(int num)
	{
		zong(num,1,1);
	}
	
	
	//ʮ����ת�˽���
	public static void ba(int num)
	{
		zong(num,7,3);
	}
	
	
	//ʮ����תʮ������
	public static void shiliu(int num)
	{
		zong(num,15,4);
	}
	
	
	//�ܵ��ú���
	public static void zong(int num,int a,int b)
	{
		if(num==0)
		{
			System.out.println(0);
			return ;
		}
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[32];
		int pos = arr.length;
		while(num!=0)
		{
			int tmp = num&a;
			arr[--pos]=chs[tmp];
			num=num>>>b;
		}
		for(int x = pos;x<arr.length;x+=1)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}