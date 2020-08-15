package newkn;
/*
3、转换
	3.1将字符数组转成字符串。
		构造函数：String(char[] value)
				 String(char[] value,int offset,int count)将字符数组中的一部分转成字符串。
		静态方法：
				static String copyValueOf(char[] data) 
					相当于 valueOf(char[]) 。  
				static String copyValueOf(char[] data, int offset, int count) 
					相当于 valueOf(char[], int, int) 。 
	3.2将字符串转成字符数组。***
		char[] toCharArray() 
			将此字符串转换为新的字符数组。  
	3.3将字节数组转成字符串。（仅作了解，重点应用于IO）
		可查询相应的构造函数。在此不列举展开。
	3.4将字符串转成字节数组。（仅作了解，重点应用于IO）
		byte[] getBytes(String charsetName) 
			使用命名的字符集将此 String编码为字节序列，将结果存储到新的字节数组中。  
	3.5将基本数据类型转成字符串。
		静态方法：
			static String valueOf(可填任何基本数据类型) 
				返回“基本数据类型参数”的字符串“基本数据类型”形式。  
				
	需要注意的是：在从字符串转成字节数组的过程中是可以指定编码表的。
 * */
public class demo_1 {
	public static void main(String[] args) {
		tains();
		char_to_Array();
	}
	public static void tains() {
		char[] arr = {'a','b','c','d','e','f','g'};
		
		String s = new String(arr);
		print("s  =  "+s);
		String x = new String(arr,1,3);//其中1是起始位置，3是个数（并不是终止位！）
		print("x  =  "+x);
	}
	public static void valueOf() {
		int u = 3;
		String a = String.valueOf(u);//将基本数据类型转成字符串。
	}
	public static void char_to_Array() {
		String l = "hjsgsdjsbiudcgase";
		char[] p = l.toCharArray();
		for(int c = 0;c<p.length;c++) {
			print("p="+p[c]);
		}
	}
	public static void print(Object o) {
		System.out.println(o);
	}
}