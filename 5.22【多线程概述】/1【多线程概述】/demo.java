/*
多线程概述：
		进程
				字面意思：正在进行中的程序。
				每一个进程执行都有一个执行顺序，该顺序是一个执行路径（情景），或者叫一个控制单元。
				
		线程（例：Thunder）
				线程是进程中的内容。
				线程本身就是进程中的一个独立的控制单元。
				线程在控制着进程的执行。
				一个进程中至少有一个线程。
				
				Java VM 启动时会有一个进程Java.exe
				该进程中至少有一个线程负责Java程序的执行。
				而且这个线程运行的代码存在于main方法中。
				该线程称之为“主线程”
				
				扩展：
						其实更细节的说明JVM，其运行时不止一个线程，还有负责垃圾回收机制的线程。
						
		多线程存在的意义
				使程序效率更高、有更多的功能实现可能性。
		线程的创建方式
				通过对API文档的查阅，Java已经提供了对线程这类事物的描述——Thread类。
				
				创建线程的第一种方法：
						继承Thraed类，并重写其run方法。
		多线程的特性
*/
public class demo
{
	public static void main(String[] args)
	{
		h a = new h();//这个实例化对象的动作，其本质就是创建一个新线程。
		a.start();//启动一个线程。注意：这里写的是start！
		/*
		start()
					使该线程开始执行，Java虚拟机调用该线程的run方法。
		*/
		for(int x = 0;x<=60;x+=1)
		{
			System.out.println("Hello World----"+x);
		}
	}
}

class h extends Thread
{
	public void run()
	{
		for(int i=0;i<=60;i++)
		{
			System.out.println("h_Thread run----"+i);
		}
	}
}