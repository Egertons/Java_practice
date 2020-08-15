/**
练习1-100的依次相加并求和。(累加思想)
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
		System.out.println("\n和 = "+he);
	}
}

/**
练习1-100之间 7的倍数的个数。（计数器思想）
*/
class beishu
{
	public static void main(String[] args)
	{
		int y = 7;
		int x = 1;
		int ji = 0;
		int z = 0;  //单独引入一个变量来计数，避免错误。如果只用x来计数的话，会影响到ji，到头来也一样。
		while(ji <= 100)
		{
			ji = y * x;
			if (ji <= 100)  //在循环体判断后避免再持续加一个1。
			{
				++x;
				++z;
			}
		}
		System.out.println("\n\t从1-100一共有 \""+z+"\" 个7的倍数。");
	}
}
/*
练习1
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
		System.out.println("\n乘法口诀表\n");
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