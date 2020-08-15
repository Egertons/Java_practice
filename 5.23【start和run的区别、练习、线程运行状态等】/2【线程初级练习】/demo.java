/*
		线程练习：
				创建两个线程和主线程交替运行。
*/
public class demo
{
	public static void main(String[] args)
	{
		h a = new h("one");
		h b = new h("two");
		a.start();
		b.start();
		
		for(int x = 0;x<=10;x+=1)
		{
			System.out.println("main----run"+x);
		}
	}
}

class h extends Thread
{
	private String name;
	h(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i = 0;i<=10;i++)
		{
			System.out.println(name+"  run-----"+i);
		}
	}
}