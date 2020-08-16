public class demo2
{
	public static void main(String[] arguments)
	{
		
	}
}


/*
对象是方法被调用时，才初始化，
也叫做对象的延时加载，   //其实也就延迟了一步而已
称为：懒汉式
*/
class demo
{
	private static demo s = null;
	private demo()
	{
		
	}
	
	//synchronized 为同步的关键字 可在一定程度上改善懒汉式的稳定性问题。但是效率较低。
	//该为懒汉式的多线程最终解决方案。
	public static demo getInstance()
	{
		if(s==null)
		{
			synchronized(demo.class)
			{
				if(s==null)
				{
					s = new demo();
				}
			}
		}
		return s;
	}
}