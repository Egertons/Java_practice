//子类的实例化过程

public class demo
{
	public static void main(String[] args)
	{
		newtel jjj = newtel.zhan();
		jjj.show();
	}
}

//方法中套用本身方法叫递归   而没有条件约束的递归就是死循环     最后内存溢出。

//子类覆盖父类，必须保证子类的权限大于等于父类的权限，否则编译失败。

//静态不能覆盖非静态。

class tel
{
	//private tel(){};      在继承关系中，父类不可以把构造函数私有化
	void show()
	{
		System.out.println("num");
	}
}

class newtel extends tel
{
	private newtel(){};
	private static newtel xin = new newtel();
	public static  newtel zhan()
	{
			return xin;
	}
	void show()         //前面不写权限表示符，，表示默认权限，，权限大小介于public和private之间。
	{
		super.show();
		System.out.println("pic");
		System.out.println("name");
	}
}

/*
重载：只看同名函数的参数列表。
重写：子类的方法函数要一模一样，包括返回值类型（权限最好也一致）
					特例：在多态中，子父类的返回值类型可以有所不同，但必须相关联。
*/


/*
关于子父类构造函数的重写：
函数重写的前提条件是函数必须一模一样，而构造函数的名字是随着类名而变化的，同时子父类又不可能类名一致。
而实际上，在对子类对象进行初始化时，父类的构造函数也会运行，
		因为子类的构造函数默认第一行有一条隐式的语句super();   							注意：这里的super特指的是空参构造。
		super();会访问父类中空参数的构造函数。
		
		而且所有的子类函数的构造函数的第一行默认都是super();
		
*/


/*
	子类必然会访问到父类的构造函数，，如果父类这时构造函数被自定义，，		那么子类必须写明super(对应参数类型);
*/


/*
在子类继承父类的时候必然会同时继承使用一些数据
为保证数据的稳定安全正确
父类要做一个初始化的动作
故而在继承中，，子类一定会去访问父类的构造函数的。
*/



//super关键字通常（必须）写在子类构造函数的第一行。

class person  //extends Object    （Object）是所有类的父类。
{
	//super();  父类也需要向上递归自检。
	private String name;
	person(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	
}

class stu extends person
{
	stu(String name)
	{
		super(name);             //直接把在子类采集的数据在子类的构造函数中运用访问父类的方法打包扔回父类构造函数处理了~   真NB啊
	}
}


class yun
{
	public static void main(String[] args)
	{
		stu jj = new stu("zhanglin");
		String i = jj.getName();
		System.out.println(i);
	}
}

class hhh extends person
{
	hhh()
	{
		super();
		System.out.println("访问父类");
	}
	hhh(int x)
	{
		this();
		System.out.println("在这个子类的重载构造函数中可以没有super()，因为this()访问了本类空参构造，而恰巧this和super在这个知识点上都需要写在构造函数的第一行故而，写了this就写不了super了，子类中只要至少有一个super就可以了");
	}
}