/*
		异常总结：
			1.是什么
					是对问题的描述，将问题进行对象的封装。
			2.异常体系
					Throwable
							|--Error
							|--Exception
									|--RuntimeException
			3.异常体系的独有特点：
					异常体系中的所有类以及建立的对象都具备可抛性。
					也就是说可以被throw和throws关键字所操纵。
					只有异常体系具备这个特点。
			4.throw和throws的用法：
					throw定义在函数内，用于抛出异常对象。
					throws定义在函数上，用于抛出异常类，可以抛出多个用逗号隔开。
			5.当函数内有throw抛出异常对象，并未进行try处理。
					则必须要在函数上声明，否则编译失败。
							注意：RuntimeException除外。
							也就是说，函数内如果抛出的是RuntimeException异常，则函数上不需要声明。
			6.如果函数声明了异常，调用者需要进行处理。处理方式可throws可try。
			7.异常有两种：
					编译时被检测异常。
							该异常在编译时，如果没有处理（没有抛也没有try），则编译失败。
							该异常被标识，代表着可以被处理。
					运行时异常（编译时不检测）。
							在编译时，不需要处理，编译器不检查。
							该异常发生时，建议不处理，让程序运行停止，需要对代码进行修正。
			8.异常处理的语句：
					try
					{
							//需要被检测的代码。
					}
					catch()
					{
							//处理异常的代码。
					}
					finally
					{
							//一定会执行的代码。
							//finally中通常定义的是 资源关闭代码， 因为资源必须被释放。
							
							//注意:
									finally虽然是一定会执行的代码，但是，有一种情况finally读不到！！
											System.exit(0);   catch的最后一行不写return而写的是这个，系统（JVM）就退出了。
													JVM都没了，所以finally也就无从谈起了。
					}
			9.自定义异常：
					定义类继承Exception或者RuntimeException
					1)为了让该自定义类具备可抛性。
					2)让该类具备操作异常的共性方法。
					
					
					当要定义自定义异常信息时，可以使用父类已经定义好的功能。
					将异常信息传递给父类的构造方法。
					class MyException extends Exception
					{
							MyException(String msg)
							{
									super(msg);
							}
					}
					
					自定义异常：按照Java的面向对象思想，将程序中出现的特有问题进行封装。
					
			10.异常的好处：
					1)将问题进行封装。
					2)将正常流程代码和问题处理代码相分离，方便于阅读。
					
			11.异常的处理原则：
					1)处理方式有两种：try 或者 throws。
					2)调用到抛出异常的功能时，抛出几个，就处理几个。
							一个try对应多个catch。
					3)多个catch的情况下，父类的catch放到最下面。
					4)catch内，需要定义针对性的处理方式，不要简单的定义printStackTrace,输出语句。
							也不要不写。
							
							当捕获到的异常，本功能处理不了时，可以继续在catch中抛出。
							try
							{
									throw new AException();
							}
							catch(AException e)
							{
									throw e;
							}
							
							如果该异常处理不了，但并不属于该功能的异常。
							可以将异常转换后，在抛出和该功能相关的异常。
							try
							{
									throw new AException();
							}
							catch(AException e)
							{
									throw new BException();  //抛出相关异常
							}
							
							或者异常可以处理，但需要将异常产生后和本功能相关的问题提供出去。
							让调用者知道、并处理。也可以将捕获的异常处理后，转换为新的异常抛出。
							try
							{
									throw new AException();
							}
							catch(AException e)
							{
									//先对AException进行处理。
									throw new BException();  //抛出相关异常
							}
							
			12.异常的注意事项：
					在子父类覆盖时：
							1)子类抛出的异常必须是父类异常的子类或者子集。
							2)如果父类或者接口中没有定义异常时，子类覆盖出现异常，只能try不能抛。
									总之就是：子类不能抛出比父类多的异常。
*/
public class demo
{
	public static void main(String[] args)
	{
		//System.exit(0);退出系统（JVM）
	}
}