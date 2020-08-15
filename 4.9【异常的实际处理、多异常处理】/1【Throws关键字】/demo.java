/*
throws （抛出） Exception（异常） 因为方法体中参数的特殊性，导致有可能传参异常，
	故而在源函数后面抛个异常，这时在调用该方法时就必须采取主动式的异常处理机制（要不然编译不过）
	
	
	这时候的主动式处理机制有两种：
			1.主动抛出：比如在调用该声明异常的函数的函数也声明抛出~
					那么，再上一层的处理机制就会接着处理。有可能是下一个主函数也有可能是JVM底层虚拟机。
			2.主动捕捉：用try{}catch(){}来主动处理。注意：catch处理的部分要符合异常的特征。
	
*/
public class demo
{
	public static void main(String[] args)
	{
		Tools demo = new Tools();
		try
		{
			int u = demo.demo(4,0);
			System.out.println("\nu="+u);
		}
		catch(Exception e)
		{
			System.out.println("异常处理");
			//其实这里面是可以写很多很多东西的
		}
	}
}

class Tools
{
	int demo(int a,int b)throws Exception//在功能函数上通过throws的关键字声明了该功能有可能会出现问题。
	{
		return a/b;
	}
}