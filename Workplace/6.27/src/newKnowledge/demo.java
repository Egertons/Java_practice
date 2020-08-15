package newKnowledge;
/*
 * String类是用于描述字符串事物的类。
 * Java已经封装了多个常见的对于字符串的操作。
 *  如下：
 * 1、获取。
 * 		1.1字符串中所包含的字符数，也就是字符串的长度。
 * 			int length();获取字符串长度。
 * 			需要注意的是：数组也有获取长度的方法，但是那个length并没有()
 * 		1.2根据位置获取位置上的某个字符。
 * 			char charAt(int index);返回指定索引处的char值。
 * 2、判断。
 * */
public class demo {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		/*
		 * 这句判断语句的结果是true，原因是Java底层在初始化字符串对象的时候
		 * 会先判断一下该字符串内容有没有在之前经过初始化，如有则将前序的内存地址值赋给新字符串
		 * 这样做会节约内存空间。
		 * */
	}
}