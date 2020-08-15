/*
		自定义异常：
				因为在项目中会出现特有的问题，
				而这些问题并未被Java所封装，
				所以对于这些特有的问题可以按照Java的对问题的封装思想
				将特有的问题，进行自定义的封装处理。
				
				
				需求：
						在本程序中需特定义：除数不仅不能为零、也不能为负。
						
						
				当在函数内部出现了throw抛出异常对象，那么就必须要给对应的处理动作。
				1.要么在内部try catch{}处理
				2.要么在函数上声明让调用者处理。(抛出)   
				总结一句话：要么处理要么抛！
				
				一般情况下：函数内出现异常，函数上需要声明。
				
				
				如何编写自定义异常中的方法呢
				因为该自定义类是继承着总异常类的
				且父类中已经把异常信息的相关操作都完成了。
				所以子类只要在构造的时候，将异常信息传递给父类通过super语句。
				那么就可以直接通过getMessage()方法获取到自定义的异常信息。
*/
public class demo
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("\n"+Tools.demo(4,-2));
		}
		catch(fushuException e)
		{
			System.out.println("\n异常处理捕捉成功");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getvalue());
		}
	}
}


class Tools
{
	static int demo(int a,int b)throws fushuException
	{
		if(b<0)//前期判断
		{
			throw new fushuException("by fushu",b);//这里手动通过throw关键字抛出一个fushuException自定义异常对象。
		}
		
		return a/b;
	}
}



/*
		对于自定义异常，，需要特别的建立一个类来描述它。
		这里只有继承Exception才会使fushuException成为自定义异常，它必须具有异常的一些特性。
*/
class fushuException extends Exception  //后面的Exception是一种Java中的规范
{
	/*
	private String msg;
	fushuException(String msg)
	{
		this.msg = msg;
	}
	public String getmessage()
	{
		return msg;
	}
	*/
	private int value;
	fushuException(String msg,int value)
	{
		super(msg);
		this.value = value;
	}
	fushuException()
	{
		super();
	}
	public int getvalue()
	{
		return value;
	}
}
/*
总结；
		自定义异常：
				必须是自定义类继承Exception
		为什么必须继承Exception
				因为异常的类和对象都需要被抛出！
				因此在这时，异常的类和对象就具备了一定的可抛性。
				而与此同时：只有被继承着的Throwable类才有try catch{}的能力！
*/