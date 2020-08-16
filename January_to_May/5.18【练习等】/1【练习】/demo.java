public class demo
{
	public static void main(String[] args)
	{
		
	}
}


/*
1.子类实例化的时候最开始执行的是子类的构造函数，
			在子类的构造函数中的第一条首先执行的就是其继承的父类的构造。
*/

//2.第32行编译失败，（多态）A接口中并未定义func方法。
interface A{}
class B implements A
{
	public String func()
	{
		return "func";
	}
}

class D
{
	public static void main(String[] args)
	{
		A a = new B();
		System.out.println(a.func());
	}
}

//3   正确答案： A B  主要考察对于多态的理解
class Fu
{
	boolean show(char a)
	{
		System.out.println(a);
		return true;
	}
}
class Zi extends Fu
{
	public static void main(String[] args)
	{
		int i = 0;
		Fu f = new Zi();
		Zi d = new Zi();
		for(f.show('A');f.show('B') && (i<2);f.show('C'))
		{
			i++;
			d.show('D');
		}
		boolean show(char a)
		{
			System.out.println(a);
			return false;
		}
	}
}

//4   编译失败，因为A接口中没有定义该方法（注意本题在创建对象时的“引用”是接口的引用！）
interface A
class B implements A
{
	public String test()
	{
		return "yes";
	}
}
class D
{
	static A get()
	{
		return new B();
	}
	public static void main(String[] args)
	{
		A a = get();
		System.out.println(a.test());
	}
}

//5 创建子类对象实例的时候，执行其构造函数，没有特殊说明的情况下，首先要跑一遍其父类的“空参”构造。
//6 
interface Inter
{
	void show(int a,int b);
	void func();
}
class F
{
	public static void main(String[] args)
	{
		//补足代码；调用两个函数，要求用匿名内部类
		Inter in = new Inter()
		{
			public void show(int a,int b)
			{
				
			}
			public void func()
			{
				
			}
		};//不在这里写调用，因为在这里调用只能调用一个函数。
		
		in.show(4,5);
		in.func();
	}
}