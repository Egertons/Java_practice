class zl
{
	public static void main (String[] args)
		{
			int x = 3 ;
			/*
				if (x == 3 || x == 4 || x == 5 )      // 利用比较运算符简化代码结构，||可以在遇到符合条件的区块时及时停止，提高代码效率。
					System.out.println(x+"春季");     
				else if (x == 6 || x == 7 || x == 8)
					System.out.println(x+"夏季");
				else if (x == 9 || x == 10 || x == 11)
					System.out.println(x+"秋季");
				else if(x == 12 || x == 1 || x == 2)
					System.out.println(x+"冬季");
				else 
					System.out.println(x+"月份不存在");     //防止数据溢出。
			*/
			
			//进阶写法   写区间
			/*
			if (x>12 || x<1)
					System.out.println(x+"月份不存在");     //防止数据溢出。
			else if (x>=3 && x<=5)
				System.out.println(x+"春季");
			else if (x>=6 && x<=8)
				System.out.println(x+"夏季");
			else if (x>=9 && x<=11)
				System.out.println(x+"秋季");
			else
				System.out.println(x+"冬季");
			*/
			switch (x)
			{
				case   3:
				case   4:
				case   5:
					System.out.println(x+"春季"+"\n\t");
				break;
			}
			/*
			while (x <= 6)
			{
				System.out.println("x="+x);
				x++;
			}
			*/
			System.out.println("Hello World 张霖 ");
		}
}