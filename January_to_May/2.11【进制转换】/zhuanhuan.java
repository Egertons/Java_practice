/*
这是一个集大成的进制转换方法示例。
#需要注意的是，在实际的开发环节中方法函数中应该返回的操作值类型应该为String.
*/
public class zhuanhuan
{
	public static void main(String[] args)
	{
		//测试
		er(-6);
		ba(88);
		shiliu(-60);
		er(0);
	}
	
	
	//十进制转二进制
	public static void er(int num)
	{
		zong(num,1,1);
	}
	
	
	//十进制转八进制
	public static void ba(int num)
	{
		zong(num,7,3);
	}
	
	
	//十进制转十六进制
	public static void shiliu(int num)
	{
		zong(num,15,4);
	}
	
	
	//总调用函数
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