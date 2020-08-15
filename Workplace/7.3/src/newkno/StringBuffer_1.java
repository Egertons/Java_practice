package newkno;
/*
StringBuffer:（字符串缓冲区）
1.它最大的特性就是可以对本不可以修改的字符串进行修改。
2.其本质是一个“长度可变化的”可以同时操纵多种类型的容器。
	最终会通过toString方法变成字符串。
3.基本功能:
	3.1存储
		首先在其定义的方法中有两种基础数据类型无法“直接”添加。
			byte和short。
		StringBuffer append(“基础数据类型”) 
			将 基础数据类型 参数的字符串表示附加到序列中。
		StringBuffer insert(int offset, boolean b) 依次类推其他数据类型
			在此序列中插入 boolean参数的字符串表示形式。  
				对于插入而言，如果插入角标位不存在，则会出现角标越界异常。
	3.2删除
		StringBuffer delete(int start, int end) 包含头不包含尾
			删除此序列的子字符串中的字符。 
		StringBuffer deleteCharAt(int index) 
			删除 char在这个序列中的指定位置。  
	3.3获取
		char charAt(int index) 
			返回 char在指定索引在这个序列值。 
		int indexOf(String str) 
			返回指定子字符串第一次出现的字符串内的索引。 
		等等，其方法几乎和String一致。（用的时候多查几遍API就可以了）。 
	3.4修改
		StringBuffer replace(int start, int end, String str) 包含头不包含尾
			用指定的String中的字符替换此序列的子字符串中的 String 。 
		void setCharAt(int index, char ch) 
			指定索引处的字符设置为 ch 。
	3.5反转
	 	StringBuffer reverse() 
			导致该字符序列被序列的相反代替。  
	3.6将缓冲区中的指定数据存放到指定的字符数组中去。（注意避免角标越界）
		void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
			字符从该序列复制到目标字符数组 dst 。  
 * */
public class StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();
		a.append(true).append('c').append(77);//方法调用链。
		a.insert(1,"zhanglin");
		print(a);
		a.delete(0,a.length());//清空缓冲区。
		method_update();
		method_update_2();
		method_2(); 
	}
	public static void method_2() {
		StringBuffer a = new StringBuffer("abcdefg");
		char[] arr = new char[6];
		a.getChars(0,3,arr,0);
		for(int x = 0;x<arr.length;x++) {
			print("arr["+x+"]=\t"+arr[x]+";");
		}
	}
	public static void method_update() {
		StringBuffer str = new StringBuffer("zhanglin_demo");
		str.replace(1,2,"l");
		print(str.toString());
	}
	public static void method_update_2() {
		StringBuffer str = new StringBuffer("zhanglin_demo");
		str.setCharAt(3,'a');
		print(str.toString());
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}