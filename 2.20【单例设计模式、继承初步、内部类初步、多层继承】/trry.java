public class trry
{
	public static void main(String[] args)
	{
		System.out.println("123");
		demoo.m();  //外部类调用内部类方法
	}
	
	static class demoo
	{
		public static void m()
		{
			System.out.println("abc");
		}
	}
}



class outer
{
	int x = 9;
	class inner
	{
		int x = 8;
		public void test()
		{
			int x = 7;
			System.out.print(x+"  ");//本方法中的x
			System.out.print(this.x+"  ");//本类中用this强调对象x
			System.out.print(outer.this.x+"  ");//用  外部类.this.变量  访问外部类常量
			test1();  //内部类可以正常访问外部类的方法。
		}
	}
	
	private void test1()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args)
	{
		inner in = new outer().new inner(); //主函数中要先实例化以一个内部类的对象。
		//另，创建外部类和内部类两个对象可以new可以一起写。
		in.test();    //通过这个实例化的对象来调用内部类（进而执行内部类的一系列操作，包括内部类中最后引用的外部方法）。
	}
}

/*
Java支持多层继承
暂不完全支持多类同时继承     //但可用多实现来完成需求。
*/