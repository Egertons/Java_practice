/**
��ϰ1-100��������Ӳ���͡�(�ۼ�˼��)
*/
class demo
{
	public static void main(String[] args)
	{
		int y = 0,he = 0;
		while(y!=100)
		{
			y+=1;
			he+=y;
		}
		System.out.println("\n�� = "+he);
	}
}

/**
��ϰ1-100֮�� 7�ı����ĸ�������������˼�룩
*/
class beishu
{
	public static void main(String[] args)
	{
		int y = 7;
		int x = 1;
		int ji = 0;
		int z = 0;  //��������һ������������������������ֻ��x�������Ļ�����Ӱ�쵽ji����ͷ��Ҳһ����
		while(ji <= 100)
		{
			ji = y * x;
			if (ji <= 100)  //��ѭ�����жϺ�����ٳ�����һ��1��
			{
				++x;
				++z;
			}
		}
		System.out.println("\n\t��1-100һ���� \""+z+"\" ��7�ı�����");
	}
}
/*
��ϰ1
*/
class zll
{
	public static void main(String[] args)
	{
		int a = 2;
		for(int x = 1;x < 6; ++x)
		{
			
			for(int y = 3;y > a;--y)
			{
				System.out.print("*");
				
			}
				--a;
			System.out.println();
		}	
	}
}
class lianxi2
{
	public static void main(String[] args)
	{
		int a = 2;
		for(int x = 0;x < 10;++x)
		{
			for(int y = 1, u = 1;y<a;++y)
			{
				System.out.print(u);
				u++;
			}
			a++;
			System.out.println();
		}
	}
}
class chengfa
{
	public static void main(String[] args)
	{
		System.out.println("\n�˷��ھ���\n");
		int a = 2; 
		int g = 1;
		for(int x = 0;x < 9;++x)
		{
			int ji = 0;
			for(int y = 1;y<a;y++)
			{
				ji=y*g;
				System.out.print(y+"*"+g+"="+ji+"\t");
			}
			g+=1;
			System.out.println();
			++a;
		}
	}
}