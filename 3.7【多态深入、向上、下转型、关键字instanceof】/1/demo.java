/**
多态：本质由于一个对象有多个所属形态所体现出来的特性。

1.多态的体现
		父类的引用指向了自己的子类对象。（多态的具体代码体现形式）
		父类的引用也可以接收自己的子类对象。
				本类类型在接收本类对象。
2.多态的前提
		类和类之间必须有关系，要么继承，要么实现。
				然后在类似于方法传参的时候写父类，当使用方法时就一本万利了。
		存在覆盖。
				也就是说，该总方法中调用的方法必须是父类中有的方法。
3.多态的好处
		多态的出现，非常好的提高了程序的扩展性。（利大于弊）
4.多态的应用
		
5.多态的弊端
		提高了扩展性，但是只能使用父类的引用访问父类的成员。
*/
public class demo
{
	public static void main(String[] args)
	{
		//标准多态创建语句
		//通过子类来实例化父类
		Animals first = new Cat();  //类型提升   向上转型   这里的first的类型本质上被提升为了Animals，只是在实例化的时候  是new Cat()  故而只是用了Cat这个类的模板。
		first.eat();     //这时的first不具备猫的除了吃的其他特性，因为其本质上是父类的类型，而父类中没有猫的其他特性。
		/*
			1.向上转型的格式父类名 父类对象名 = new 子类对象()

			2.此时通过父类引用变量调用的方法是子类覆盖或继承父类的方法，而不是父类的方法。但是调用的属性还是父类的属性。

			3.此时通过父类引用变量无法调用子类特有方法。

			4.静态方法和属性都可以被继承和隐藏而不能被重写，因此不能实现多态。非静态方法可以被继承和重写，因此可以实现多态。
			————————————————
			版权声明：本文为CSDN博主「肥仔肥仔」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
			原文链接：https://blog.csdn.net/yuanren201/article/details/88872744
		*/
		
		
		/*
		向下转型：

				在java中,向下转型则是为了,通过父类强制转换为子类,从而来调用子类独有的方法(向下转型,在工程中很少用到)。
		     （注：向下转型的具体代码详见本文件夹中另一个.Java文件）
		*/
		
		/*
		//以前的解决方法：
		function(new Pig());
		*/
		//现在多态版的解决方案
		function(new Pig());         //注：反射技术可以有更方便的解决方案
		
		
		//但是绝对不能这么写：   就是将父类对象转成子类类型。
		Animals ww = new Animals();
		Cat dd = (Cat)ww;    //这么转换绝对是子虚乌有。   不能把一个动物强转成猫，因为它非常有可能不是猫！
		
		
		//我们能转换的是父类引用指向了自己的子类对象时，该应用可以被提升，也可以被强制转换。
		
		
	}
	/*
	//以前的解决方法：
	public static void function(Pig c)   //这里如果需要接收其他类型，必须再创建一个新的类
	{
		c.eat();
	}
	*/
	//现在多态版的解决方案
	public static void function(Animals a)   //现在在总方法接收类型中直接写这一众子类的父类类型，不管以后传什么进来都是对的。
	{
		a.eat();
	}
}

//多态的标准示例：
abstract class Animals
{
	abstract public void eat(); 
}

class Cat extends Animals
{
	public void eat()
	{
		System.out.println("\n魚を食べります");
	}
}

class Dog extends Animals
{
	public void eat()
	{
		System.out.println("\n骨头を食べります");
	}
}


class Pig extends Animals
{
	public void eat()
	{
		System.out.println("\nAnythingを食べります");
	}
}

