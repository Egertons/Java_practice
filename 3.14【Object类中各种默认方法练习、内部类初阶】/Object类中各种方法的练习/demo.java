/*
		对于Object超类中的  toString方法的   练习
					返回该对象的字符串表示
					
					Java认为所有对象都能被转换为字符串打印
							所打印的是  该对象的内存地址值，，前面是类名    中间用@隔开    后面是该类的内存地址值的哈希值
*/
public class demo
{
	public static void main(String[] args)
	{
		jj h = new jj();
		System.out.println(h.toString());
		System.out.println(h.hashCode());   //对于Object超类中的  hashCode()方法的   练习   返回该对象的哈希值。
		System.out.println(Integer.toHexString(h.hashCode()));   //因为普通直接调用方法输出的哈希值是十进制的，しかしながら、在一般的调用哈希值的地方都是用16进制调用的，故而要转换一下。
		System.out.println("-------------------------------------------------------");
		
		
		Class p = h.getClass();           //getClass()  是超类Object中的一个方法 所有对象普遍适用，，可获取该对象的class文件。
					//在本句中为获取到该对象的class文件后  再   赋给一个Class类型的类p  
 					
		System.out.println(p.getMethods());    //那么该类p   默认具备Class中的一些方法    比如通过字节码文件来获取到源码文件中的方法（包括私有方法）   //反编译的理论基础！
		System.out.println(p.getName()+"@"+Integer.toHexString(h.hashCode()));    //模拟toString()  方法  通过其他的方式实现。
	}
}

class jj extends Object
{
	
}


/*
		在Object超类中所预先定义的这些方法  
				比如：toString()  /   equals()  /  hashCode()    /  getClass()  等等
				因为在最开始要适配所有的类，，所以定义的时候其功能都比较弱，，，没有什么意义。
				
				在实际使用的时候，，一般都会把它重写以适应新的功能。
				
				PS:   在很多第三方社区开发的类库中    很多都把这些方法重写了
*/