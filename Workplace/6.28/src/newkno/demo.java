package newkno;
/*
 * 字符串：
 * 主要方法简介：
 * 1、获取
 * 		1.3根据字符获取该字符在字符串中的位置。
 * 			int indexOf(int ch);返回的是ch在字符串中第一次出现的位置。
 * 				（int ch指的是该字符的ASCLL码）
 * 			int indexOf(String str, int fromIndex)  重载方法
 * 				其中的 int fromIndex指的是从指定位置开始索引。
 * 		1.4根据字符串获取该字符串在字符串中的位置。
 * 			int indexOf(String str) 
				返回指定子字符串第一次出现的字符串内的索引。  
			int indexOf(String str, int fromIndex) 
				返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。
		1.5反向索引
			前序的获取方法（1.3  1.4）在方法名前加上last的话
			就会从字符串反向开始索引功能层面全部一致。
			Eg:
			int lastIndexOf(int ch) 
				返回指定字符的最后一次出现的字符串中的索引。  
			int lastIndexOf(int ch, int fromIndex) 
				返回指定字符的最后一次出现的字符串中的索引，从指定的索引开始向后搜索。  
			int lastIndexOf(String str) 
				返回指定子字符串最后一次出现的字符串中的索引。  
			int lastIndexOf(String str, int fromIndex) 
				返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向后搜索。 
 	2、判断：
 		2.1判断字符串中是否包含一个子串。
 			boolean contains(CharSequence s) 
				当且仅当此字符串包含指定的char值序列时才返回true。  
				其中CharSequence是一个接口，String是它众多实现中的一个。
			
			特殊之处：该功能可以有另一种实现：
				IndexOf(String str)该方法原本用于索引字符串中指定字符的位置
					但如果索引失败的话，会自动返回-1
					这样就可以变相的用于判断指定字符串是否包含于该字符串当中。
			
 		2.2判断字符串中是否有内容。
 			boolean isEmpty() 
				返回 true如果，且仅当 length()为 0 。 
				注意："" 与 null是有区别的。 
 		2.3判断字符串是否是以指定的内容开头。
 			boolean startsWith(String prefix) 
				测试此字符串是否以指定的前缀开头。  
 		2.4判断字符串是否是以指定的内容结尾。
 			boolean endsWith(String suffix) 
				测试此字符串是否以指定的后缀结尾。 
		2.5判断字符串的内容是否相同。
		 	boolean equals(Object anObject) 
				将此字符串与指定对象进行比较。 
		2.6判断字符串的内容是否相同。并忽略大小写。
			boolean equalsIgnoreCase(String anotherString) 
				将此 String与其他 String比较，忽略案例注意事项。  
 * */
public class demo {
	public static void main(String[] args) {
		//method_get();
		method_is();
	}
	public static void method_is() {
		String is = "Array_demo.java";
		//判断该字符串中是否包含指定字符
		print(is.contains("demo"));
		//判断该字符串中是否以指定字符开头
		print(is.startsWith("Array"));
		//判断该字符串中是否以指定字符结尾
		print(is.endsWith("java"));
		//判断该字符串是否为空
		print(is.isEmpty());
	}
	public static void method_get() {
		String str = "zhanglin";
		//长度
		print(str.length());
		//根据索引获取字符
		print(str.charAt(2));
		//假如这里填的数字超过字符串字符索引范围，就会爆出字符串角标越界异常。
		
		//根据字符获取索引
		print(str.indexOf('a'));
		//这里索引的字符如果没有找到的话，会返回-1
		print(str.indexOf('a',2));//两种不同形式的重载
		//反向索引示例
		print(str.lastIndexOf('i'));//注意：这里的反向索引是指索引的顺序发生改变，角标不变。
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}