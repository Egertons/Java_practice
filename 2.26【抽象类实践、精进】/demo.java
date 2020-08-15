public class demo
{
	public static void main(String[] args)
	{
		System.out.println("\nHello World!");
	}
}

abstract class hh extends demo              //测试项目：在抽象类中定义主函数尝试运行。
{
	public static void main(String[] arguments)          //实质上好像是重写了一遍主函数
	{
		System.out.println("测试");
	}
}



/*
抽象类和一般类没有太大的区别。
正常描绘事物即可，抽象类一般出现在父类中，其中可以包括一些抽象的方法（是集体性的普遍功能但功能主体因人而异，无法确定）。

另，抽象类无法实例化（无法直接创建对象，只能让子类复写后再由子类创建对象）。

对于：把一个并不存在抽象方法的类定义为抽象类的意义在于：
				使得这个类无法在创建对象，
						故而，final类 和 abstract类都是类的最后阶段，无法实例化。

*/