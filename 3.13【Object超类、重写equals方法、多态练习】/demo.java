public class demo 
/*
Object类：为类层级结构的根类。
					为所有对象的直接抑或是间接父类。
					
					该类中定义的是所有对象都具备的功能。
*/
{
	public static void main(String[] args)
	{
		/*
		hh e = new hh();
		hh j = new hh();
		
		System.out.println(e.equals(j));  //重建两个对象，并比较它们是否相同。
		//其本质比较的是地址值，只要它们分属两个不同的堆内存地址值，就一定不同。
		
		//除非这么写~
		hh i = e;
		System.out.println(i.equals(e));//这才能返回true~
		*/
		hh first = new hh(9);
		hh second = new hh(55);
		person j = new person();  //错误溢出测试
		System.out.println(first.equals(j));
	}
}

/*
Java认为：所有对象都具有比较性，都可以被比较两个随机的对象是否相同。
				那么，既然是所有对象都要具备的特性，当然要定义在超类（Object类）中。
							——方法  equals(Object obj)    指示其他某个对象是否与此对象相等。  其中也同时包含了多态的思想。
*/

class hh extends Object   //默认所有类都继承Object类为父类。
{
	private int num;
	hh(int num)
	{
		this.num = num;
	}
	/*
			Object类中已经提供了对对象是否相同的比较方法。
			如果自定义类中也有比较相同的功能，则没有必要重新定义。
			只要沿袭父类中的功能，重写其方法即可。
					PS：反正以前的比较功能只是比较地址值（相当的鸡肋）
	*/
	public boolean equals(Object c)   //这里必须写成Object  因为是要重写所以接收类型必须相同，不然就成了重载了~
	{
		if(c instanceof hh)   //错误判断  防止把什么乱七八糟的类都往里传
		{
			hh d = (hh)c;   //多态的经典形式   父类引用指向子类对象。   需要调用子类的特性的时候——向下转型。
			return this.num == d.num;
		}
		else
		{
			return false;
		}
	}
}

class person
{
	
}