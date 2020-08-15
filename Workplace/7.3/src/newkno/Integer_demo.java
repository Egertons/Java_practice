package newkno;
/*
基本数据类型对象包装类：
对于基本数据类型，其中有很多操纵的动作。
Java将其统一封装至其各所属的基本对象类中。
如：
	byte	Byte
	short	short
	int		Integer
	long	Long
	boolean	Boolean
	float	Float
	double	Double
	char	Character


基本数据类型对象包装类最常见的应用场景就是
其基本数据类型与字符串之间做相互转换。

基本数据类型转字符串：
	1.基本数据类型+""
	2.基本数据类型.toString(基本数据类型值);
		如：Integer.toString(34);//将34转成字符串"34"。

字符串转基本数据类型：
	1.static int parseInt(String s)     //以Integer为例，其余数据类型以此类推。
		将字符串参数解析为带符号的十进制整数。  
 * */
public class Integer_demo {
	public static void main(String[] args) {
		//以整形为例
		print("整形的最大值为："+Integer.MAX_VALUE);
		int num = Integer.parseInt("123");
		print("num = "+(num+4));
		
		print(Integer.toBinaryString(6));//调用整形封装类方法实现“进制转换”功能。
		int x = Integer.parseInt("110",2);//整形封装类中的特有方法。
		print("x = "+x);
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}