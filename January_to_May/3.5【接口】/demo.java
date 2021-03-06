/*
接口：
	格式：interface{}
接口中的成员修饰符是固定的。
	成员变量：public static final
	成员函数：public abstract
接口的出现将“多继承”通过另一种形式体现出来，即“多实现”

class用于定义类
interface用于定义接口（可以不严谨的理解为一个特殊的类）

接口定义时，格式特点：
1.接口中常见的定义：常量、抽象方法。
2.接口中的成员都有固定的修饰符。 

*/
/*
接口的初期理解：
	可以认为是一个特殊的抽象类
		当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
*/
public class demo
{
	public static void main(String[] arguments)
	{
		xin hh = xin.zhan();
		hh.show();
	}
}



//注意:当写接口时，接口内部的修饰符可以都不写，因为JVM会侦测到你写的这个是接口，又因为接口中的元素都有固定的修饰符，故而，JVM在编译的时候会自动填充的。
//但是，不建议这么做，因为后期维护的时候，代码的阅读性非常差。
interface first    //接口中的东西都必须是抽象的。
{
	public abstract void show();
	public static final int NUM = 99;   //注意：常量的定义，名称应该全大写。
}

//创建类来实例化接口，其中是“实现”关系   不是继承关系！
class xin implements first
{
	private xin(){}
	private static xin xx = new xin();
	public static xin zhan()
	{
		return xx;
	}
	public void show()
	{
		for(int x = 0;x!=3;x+=1)
		{
			System.out.println(NUM);
		}
	}
}

/*
	如果一个类实现了一个接口，但是却没有复写任何方法
	那么这个类的本质是一个抽象类。（还是无法实例化对象）
	子类需要把接口中的抽象方法全部复写后才能实例化对象。
*/