/*
		获取线程对象以及名称
				线程默认都有自己的名称。
				Thread-编号  该编号从0开始。
*/
public class demo
{
	public static void main(String[] args)
	{
		h a = new h("one");
		h b = new h("two");
		a.start();
		b.start();
	}
}



class h extends Thread
{
	h(String name)
	{
		super(name);
	}
	public void run()
	{
		//System.out.println(this.getName()+"  run");
		System.out.println(h.currentThread().getName()+"  run");
		//这里Thread类中有一个静态的方法 可以 侦测返回当前的线程对象。
		
	}
}