/*
		Finally详解：
			finally代码块：定义一定的代码块。
			通常用于关闭资源。
*/
public class demo
{
	public static void main(String[] args)
	{
		hh a = new hh();
		
		try
		{
			int h = a.div(4,-5);
			System.out.println("h="+h);
		}
		catch(fushuException e)
		{
			System.out.println(e.toString());
			return;//这里强制返回固定值，程序终止，但是finally的部分还是会继续执行。
		}
		finally
		{
			System.out.println("finally");//finally中存放的是"一定会被执行"的代码。
		}
		
		System.out.println("over");
	}
}


class fushuException extends Exception
{
	fushuException(String msg)
	{
		super(msg);
	}
}


class hh
{
	int div(int a,int b)throws fushuException
	{
		if(b<0)
		{
			throw new fushuException("除数为负");
		}
		return a/b;
	}
}