/*
		异常—练习
		有一个圆形和长方形；
		都可以获取面积，对于面积来说，如果出现非法数值，视为是获取面积出现问题。
		问题通过异常来表示。
*/
public class demo
{
	public static void main(String[] args)
	{
		//try
		//{
			Rec a = new Rec(5,6);
			a.getarea();
		//}
		/*catch(NoValueException e)
		{
			System.out.println(e.toString());
		}
		*/
		
		
		Circle aa = new Circle(2);
		aa.getarea();
	}
}

interface shape
{
	void getarea();
}

class Rec implements shape
{
	private int chang,kuan;
	
	Rec(int chang,int kuan)//throws NoValueException
	{
		if(chang<=0 || kuan<=0)
			throw new NoValueException("出现非法值");
		this.chang = chang;
		this.kuan = kuan;
	}
	
	public void getarea()
	{
		System.out.println(chang*kuan);
	}
}


class Circle implements shape
{
	private int radius;
	public static final double pi = 3.14;  //全局常量
	Circle(int radius)
	{
		if(radius<=0)
			throw new NoValueException("出现非法值");
		//throw new RuntimeException("出现非法值");	直接这么写也行。
		this.radius = radius;
	}
	
	
	public void getarea()
	{
		System.out.println(Math.pow(radius,2)*pi);
	}
}


class NoValueException extends RuntimeException
{
	NoValueException(String msg)
	{
		super(msg);
	}
}