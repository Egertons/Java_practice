/*

多态说到底就是这么一行代码：
			Fu i = new Zi();


多态的应用
多态的出现在代码中的特点(多态使用的注意事项)
		在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译则失败。
		在运行时期：参阅对象所属的类中是否有调用的方法。
		
		简单总结就是：非静态成员 函数 在多态调用的时候，编译看左边，运行看右边。
		              （也称为动态绑定原理）
		
		特殊记忆：在多态中，对于成员  变量  来说
				无论是编译还是运行，都参考左边（引用型变量所属的类）。
						理解：对于继承来说，子父类中的变量不存在继承覆盖关系，
									只有函数才存在覆盖重写关系。所以在调用变量或是常量的
									时候该调用谁就调用谁。
		
		特殊记忆：在多态继承中，对于静态成员函数来说
							也不存在继承多态关系，该调用谁就调用谁。
							因为他们都是静态的，压根儿就不参与世间纷争。
							也称为（静态绑定原理）
		
*/


//多态在代码块继承上的标准应用。
public class demo
{
	public static void main(String[] args)
	{
		dostu first = dostu.hh();
		first.show(new gaoji());
	}
}

abstract class Students
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("躺着睡");
	}
}


class dostu
{
	private dostu(){}
	private static dostu text = new dostu();
	public static dostu hh()
	{
		return text;
	}
	
	public void show(Students s)
	{
		s.study();
		s.sleep();
	}
}


class gaoji extends Students
{
	public void study()
	{
		System.out.println("好好学习");
	}
}


class chuji  extends Students
{
	public void study()
	{
		System.out.println("一般学习");
	}
	public void sleep()
	{
		System.out.println("趴着睡");
	}
}