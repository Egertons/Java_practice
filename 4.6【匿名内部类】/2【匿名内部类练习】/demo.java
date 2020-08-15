public class demo
{
	public static void main(String[] args)
	{
		Test.function().method();
	}
}

interface Inter
{
	void method();
}

class Test
{
	//补足代码
	static Inter function()
	{
		/*
		因为是类名直接.方法名（function）
			故而得知，function一定是静态的。
		而与此同时，function所调用的（也可以说是计算得出的结果）
			却是接口中的method函数，这个肯定是非静态的。
			所以要使用匿名对象。（重点在于function的返回值类型不能单纯的写成是void）
				而应该是Inter对象类型。
		*/
		return new Inter()
		{
			public void method()
			{
				System.out.println("\nHello World");
			}
		};//.method();
	}

	/*
	static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("Hello World");
		}
	}

	static Inter function()
	{
		return new Inner();
	}
	*/
}

/*
匿名内部类的一个绝妙的适用形式：
	当现在有一个接口，并且在一个类中有一个方法的
	形参列表就是这个接口。
	且现在还需要在这个类的主函数中直接调用这个函数
	那么，这时较为简便的方法就是在主函数中
		调用该方法时直接在其形参列表中写匿名内部类。
*/


//面试题：在没有接口和父类的情况下怎么写匿名内部类
class ii
{
	public static void main(String[] args)
	{
		new Object()  //Object类是所有类的父类！
		{
			public void function()
			{
				System.out.println("张霖");
			}
		}.function();
	}
}