package String;

public class first {
	public static void main(String[] args) {
		String s = new String();
		String s1 = "";
		/*
		 * 上述两种方式其实质是一样的。
		 * 其中s1是一个类类型变量，""是一个对象（实例）。
		 * 
		 * 字符串最大的特点在于：其一旦被赋值，就不可被改变。
		 * 字符串不太严谨的可以理解为：“字符串”常量。
		 * 
		 * 其中需要注意的是：当声明过s1后，如果再写s1="java";
		 * 等再次“赋值”的话。实质上对象还是没有改变。
		 * 其实是s1的对象指向变了罢了。
		 * */
		String a = new String("abc");
		String a1 = "abc";
		System.out.println(a==a1); //这里false的原因是因为，他俩本质上是俩对象，地址值都不一样，当然为假。
		System.out.println(a.equals(a1));//这里为true的原因是，a(String类)重写的Object类中的相关方法！改写了比较是否相同的规则！不再是比较地址值了。
		/*
		 * 这两种声明形式其意义也是相同的。
		 * 
		 * 其中需要注意的是：
		 * a在内存中有两个对象。
		 * a1在内存中有一个对象。
		 * */
		
		/*
		 * 关于Java中的常量池：
		 * 字符串的定义中有一环其实质上是从Java底层已经定义完的常量池中根据“用户”的需求
		 * 在常量池中检索相关字符来组成新的对象（字符串）。
		 * */
	}
}