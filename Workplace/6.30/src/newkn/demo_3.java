package newkn;
/*
7、转换、去除空格、比较
	7.1将字符串中的内容转换成大写或者小写。
		String toUpperCase() 
			将所有在此字符 String使用默认语言环境的规则大写。  
		String toLowerCase() 
			将所有在此字符 String使用默认语言环境的规则，以小写。  
	7.2将字符串两端的多个空格清除。
		String trim() 
			返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。  
	7.3对两个字符串进行自然顺序的比较。
		int compareTo(String anotherString) 
			按字典顺序比较两个字符串。  
 * */
public class demo_3 {
	public static void main(String[] args) {
		method_7();
	}
	public static void method_7() {
		String s = "    Hello Java  ";
		print(s.toLowerCase());
		print(s.toUpperCase());
		print(s.trim());
		
		String a1 = "acc";
		String a2 = "abc";
		print(a1.compareTo(a2));
		/*
		这里需要注意的是：
			两个字符串间的比较，其比较的是每一位（相对应的）上的字符的ASCLL码的绝对大小。
			如果该对象大于比较比较对象则返回正值，反之则返回负值，如相当则返回0
			与此同时：其返回的正值抑或是负值都是简单运算后的结果。
		 * */
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}