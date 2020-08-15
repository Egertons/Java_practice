package newkn;

public class Integer_demo1 {
	public static void main(String[] args) {
		method_3();
	}
	public static void method_3() {
		Integer m = 128;
		Integer n = 128;
		print("m==n?\t"+(m==n));
		/*
		这里为false正常可以理解：
			m和n在初始化的时候就为两个不同的对象。
			故而在比较的时候内存地址值指向不同。
		 * */
		
		Integer a = 127;
		Integer b = 127;
		print("a==b?\t"+(a==b));
		/*
		这里为true是因为版本新特性：
			JDK在新版本中为了节约内存空间，
			当数值在byte取值范围内时，对于新特性，如果新建数值在内存中已经存在
			JDK就不会再为新值另开辟空间，而是将其直接指向原先的地址值。
		 * */
		
	}
	public static void method_2() {
		Integer x = 4;//新版本的定义方式。
		//自动装箱。
		x+=2;//自动拆箱。x（对象）先拆箱成int型整数再与2（数值）进行运算。
		//最后再将其结果装箱赋给X（对象）。
		
		/*
		当然这种在基本数据类型封装类中的新特性固然有一定兼容性上的缺陷。
		因为Integer x 是一个类类型对象，那么它现在不仅可以赋值为基本数据。
		还可以赋值为null！！！
		但是这种情况下，做自动拆箱动作的时候（x.intValue()）就会出现空值异常。
		需要注意的是这种异常是RunntimeException 只要出现程序就会停掉！
		 * */
	}
	public static void method_1() {
		Integer a = new Integer(123);	
		Integer b = new Integer("123");
		print("a==b?   "+(a==b));//原本就是两个对象，当然不相同。
		print("a.equls(b)?    "+(a.equals(b)));//Integer中复写了超类中的equals方法，这里比较的是两个对象数值角度上的大小。
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}