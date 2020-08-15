class lianxi
{
	public static void hanshu(int num)
	{
		System.out.println(num += 1);  //当函数的返回值类型为void时，return可以省略不写。
		return;   //当然  写上也行~
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

class nh     //函数中双变量尝试。
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
class demo    //需求：判断两个数大小是否相等。
{
	/*
	public static boolean hanshu(int a,int b)
	{
		if(a==b)
			return true;
		else     //else可以不写。
			return false;
	}
	*/
	public static void hanshu(int a,int b)
	{
		 if(a==b)
		 {
		 	System.out.println(a+"和"+b+"相等");
		 }
		 else if(a!=b)
		 {
		 	System.out.println(a+"和"+b+"不相等");
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
打印矩形函数版。
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
关于代码中函数复用性的尝试。
*/
{
	public static void chengfa()
	{
		chengfa(9);
	}
	public static void chengfa(int num)    //num为外部设置数据，可自定义乘法口诀表的范围。
	{
		System.out.println("\n乘法口诀表\n");
		int a = 2; 
		int g = 1;    //g为被乘数，初始值为1，代表乘法口诀表从1开始。每次在内部循环结束后g+=1，正好达到乘法口诀表的效果。
		for(int x = 0;x < num;++x)
		{
			int ji;
			for(int y = 1;y<a;y++)    //y代表乘数，每次循环符合自身条件即++y，故而达到乘法口诀表的效果
			{
				ji=y*g;
				System.out.print(y+"*"+g+"="+ji+"\t");
			}
			g+=1;
			System.out.println();
			++a;     //a初始值为2只比y大1，而在每一轮循环后a++正好满足了下一轮内部循环中y的需求。
		}
	}
	public static void main(String[] args)
	{
		chengfa(7);
	}
}