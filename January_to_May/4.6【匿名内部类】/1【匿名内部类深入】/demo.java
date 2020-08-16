/*
匿名内部类的出现，乃至于所有的匿名形式的出现的初衷都是
为了简化书写，提高代码的可读性。
故而，切记不要把匿名内部类写的过于复杂。
*/
public class demo
{
	public static void main(String[] args)
	{
		/*
				内部类可以定义在外部类的成员位置上（也就是正常的位置上）
						也可以定义在局部位置上（例如：定义在外部类的方法内部~   也可以）
								但是，如果定义在方法中的话，该内部类就无法被private等修饰。
								同时，其内部类访问资源规则还是和正常定义在成员位置上的内部类相同的。（例如：外部类名.this.资源）
								
								
								局部内部类无法定义静态成员。  
								
								
								可以直接访问外部类中的成员，因为还持有外部类中的引用。
								但是不可以访问它所在的局部中的变量。只能访问被final修饰的局部变量。
		*/
								
			new Try().method(7);   //匿名对象					
	}
}

class Try
{
	int x = 3;
	void method(final int a)    //final修饰符也可以写在这儿
	{
		final int y = 4;
		class Inner
		{
			void function()
			{
				System.out.println(a);
			}
		}
		new Inner().function();  //直接创建并调用匿名对象。
	}
}

/*
匿名内部类：
1.匿名内部类其实就是内部类的简写格式。（是一个简化了定义和引用的整体封装过程）
2.定义匿名内部类的前提条件：
		内部类必须是继承一个类或者实现接口。
3.匿名内部类的格式：new 父类或者接口(){定义子类的内容}
4.其实匿名内部类的实质就是一个匿名子类对象。（重点）
5.匿名内部类的缺点(算是特点吧)：只能调用一个方法，
		可以在匿名内部类中多定义，但是只能单调用。
		详见P111（这里面涉及到一定程度上的多态）
6.匿名内部类是有很大的局限性的：
		首先，它里面能写多定义函数，但是不能创建名字来
		单调用非父类中的函数。因为多态的特性（这时候如果
		写向下转型就违背初衷了，越写越麻烦，不如不写匿名了）
		
		
		其次，如在父类或接口中定义了大量的抽象方法时
		也决不建议写匿名对象，因为得把父类或者接口中的
		抽象方法都重写一遍（阅读性极差）。
7.匿名内部类中定义的方法最好不要超过三个。（顶多俩）
		要不然阅读性几乎没有。代码极烂
*/

abstract class AbsDemo
{
	abstract void show();
}

class Outer
{
	int x = 3;
	//简化前：
	/*
	class Inner extends AbsDemo    //内部类继承外部类，可以匿名内部类
	{
		void show()
		{
			System.out.println("\nshow:"+x);
		}
	}
	*/
	
	public void function()
	{
		//简化前：
		//new Inner().show();
		
		//简化后：    P111
		new AbsDemo()  //匿名内部类  通过直接new一个外部的类（抽象类和正常类都可以）或者接口
									 //在此基础上复写其内部抽象方法
		{   //这个大括号里不仅可以定义/重写  方法，还可以定义成员变量（正常都可以定义）
			void show()
			{
				System.out.println("\nshow:"+x);
			}
			void abc()
			{
				System.out.println("\nHello World");
			}
		}.abc();   //重点这里就算不调用方法也得写；    需要注意的是匿名内部类的调用，内部类中可以定义多个方法，但是只能调用一个方法，如果想要调用其他匿名内部类方法，只能再写一遍匿名内部类~
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer().function();
	}
}