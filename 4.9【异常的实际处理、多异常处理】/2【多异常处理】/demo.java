/*
关于多异常的处理。
		1.声明异常时，建议声明更为具体的异常，这样处理的可以更具体。
		2.注意：函数中只要有异常发生，函数就已经结束了，所以不可能同时在一个方法中抛出两个异常。
		3.对方声明几个异常，就对应几个catch块。
				如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。（重点）
		
		
		建议在进行catch处理时，一定要定义具体的处理方式，
		不要简单的定义一句e.printStackTrace()
		也不要简单的就写一条中文的输出语句。
		
		
		
		如果真发生异常的话，catch中主要流行的几种写法：
				1.建立异常日志文件。
*/
public class demo
{
	public static void main(String[] args)
	{
		Tools a = new Tools();
		try
		{
			int o = a.w(5,1);
			System.out.println("o="+o);
		}
		catch(ArithmeticException w)
		{
			System.out.println("异常处理");
		}
		catch(ArrayIndexOutOfBoundsException e)//多异常处理就有多个catch
		{
			System.out.println("多异常（数组）处理");
		}
		
		//必须在最下面
		catch(Exception w)  //因为Java的多态性，故而Exception可以接收几乎所有的异常信息。
		{
			System.out.println("异常处理");//但与此同时，这种纯父类接收子类对象缺乏针对性。仅推荐用于对异常的查缺补漏。
		}
	}
}

class Tools
{
	int w(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}