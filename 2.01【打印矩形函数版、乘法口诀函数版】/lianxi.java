class lianxi
{
	public static void hanshu(int num)
	{
		System.out.println(num += 1);  //�������ķ���ֵ����Ϊvoidʱ��return����ʡ�Բ�д��
		return;   //��Ȼ  д��Ҳ��~
	}
	public static void main(String[] args)
	{
		System.out.println("\nHello World!");
		//int x = 7;
		//x = 10;
		//System.out.println("x="+x);
		int y = 1;
		hanshu(6);
	}
}

class nh     //������˫�������ԡ�
{
	public static int ggg(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		int u = 1;
		u=ggg(8,9);
		System.out.println("u="+u);
	}
}
class demo    //�����ж���������С�Ƿ���ȡ�
{
	/*
	public static boolean hanshu(int a,int b)
	{
		if(a==b)
			return true;
		else     //else���Բ�д��
			return false;
	}
	*/
	public static void hanshu(int a,int b)
	{
		 if(a==b)
		 {
		 	System.out.println(a+"��"+b+"���");
		 }
		 else if(a!=b)
		 {
		 	System.out.println(a+"��"+b+"�����");
		 }
	}
	public static void main(String[] args)
	{
		hanshu(2,2);
	}
}
class zhanglin
{
	public static int jjj(int a,int b)
	{
		if(a>b) return a;
		else  return b;
	}
	public static void main(String[] args)
	{
		int h = 0;
		h = jjj(8,9);
		System.out.println("h="+h);
	}
}
/*
��ӡ���κ����档
*/
class kkk
{
	public static void jjj(int a,int b)
	{
		for(int w = 1;w<a;w++)
		{
			for(int g = 1;g!=b;++g)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void print()
	{
		System.out.println("--------------");
	}
	public static void main(String[] args)
	{
		jjj(7,10);
		print();
	}
	
}
class ii
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int add(int g,int j,int h)
	{
		return g*j*h;
	}
	public static void main(String[] args)
	{
		int tt = 8;
		int mm = 1;
		tt = add(4,5);
		mm = add(7,8,9);
		System.out.println("tt="+tt);
		System.out.println("mm="+mm);
	}
}
class chengfa
/*
���ڴ����к��������Եĳ��ԡ�
*/
{
	public static void chengfa()
	{
		chengfa(9);
	}
	public static void chengfa(int num)    //numΪ�ⲿ�������ݣ����Զ���˷��ھ���ķ�Χ��
	{
		System.out.println("\n�˷��ھ���\n");
		int a = 2; 
		int g = 1;    //gΪ����������ʼֵΪ1������˷��ھ����1��ʼ��ÿ�����ڲ�ѭ��������g+=1�����ôﵽ�˷��ھ����Ч����
		for(int x = 0;x < num;++x)
		{
			int ji;
			for(int y = 1;y<a;y++)    //y���������ÿ��ѭ����������������++y���ʶ��ﵽ�˷��ھ����Ч��
			{
				ji=y*g;
				System.out.print(y+"*"+g+"="+ji+"\t");
			}
			g+=1;
			System.out.println();
			++a;     //a��ʼֵΪ2ֻ��y��1������ÿһ��ѭ����a++������������һ���ڲ�ѭ����y������
		}
	}
	public static void main(String[] args)
	{
		chengfa(7);
	}
}