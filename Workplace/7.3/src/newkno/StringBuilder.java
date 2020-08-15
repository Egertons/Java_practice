package newkno;
/*
StringBuilder:
一个可变的字符序列。 此类提供与StringBuffer的API，但不保证同步。
其为JDK1.5版本之后的新特性
大部分API与StringBuffer相同，最大的不同在于StringBuffer自带多线程同步特效
而StringBuilder只能用于单线程。

总结：
如果需要操纵字符串变量（容器）：
	单线程选StringBuilder（不需要判断锁，虽然不同步但是在单线程中并不需要）。
	多线程必须选StringBuffer。其多线程同步的特性可以确保线程安全。
	

Java对于方法的升级主要体现于以下几点：
	提高效率
	简化书写
	提高安全性
 * */
public class StringBuilder {
	public static void main(String[] args) {
		
	}
}