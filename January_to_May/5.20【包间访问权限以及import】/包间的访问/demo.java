package pack;
//可以建立多层包层次结构，中间用.隔开，在编译时JVM自动建立包体系。
/*
包与包间的访问
		包也是一种封装形式。
*/
public class demo
{
	public static void main(String[] args)
	{
		
	}
}

/*
		包与包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。
		
		不同包中的子类还可以访问父类中被protected权限修饰的成员。
		
		
							public(公有)      protected(保护)       default(默认)     private(私有)
同一个类中       ok                  ok                ok                  ok
同一个包中       ok                  ok                ok
子类             ok                  ok
不同包中         ok
*/