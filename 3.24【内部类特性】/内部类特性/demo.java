public class demo
{
	public static void main(String[] args)
	{
		//直接调用某外部类中内部静态类的普通方法。
		//new Outer.Inner().fang();    //标准格式
		
		//直接调用某外部类中内部静态类的静态方法。
		//Outer.Inner.fang();
	}
}

class Outer
{
	static class Inner    //内部静态类
	{
		public static void fang()
		{
			System.out.println("demo");
		}
	}
}

/*
注意：当内部类中定义了静态成员，那么该内部类必须是静态的。
				算是内部类的一个特性吧。
				当外部类中的静态方法访问内部类时，内部类本身也必须被静态修饰。
*/