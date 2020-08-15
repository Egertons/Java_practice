package newkn;
/*
4、替换
	4.1替换指定字符：
		String replace(char oldChar, char newChar) 
			返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。
	4.2替换指定字符串：
	  	String replace(CharSequence target, CharSequence replacement) 
			将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。 
5、切割
 	5.1切割字符串
 		String[] split(String regex) 
			将此字符串分割为给定的 regular expression的匹配。  
6、子串
	6.1获取字符串中的一部分
		String substring(int beginIndex) 
			返回一个字符串，该字符串是此字符串的子字符串。  
		String substring(int beginIndex, int endIndex) 
			返回一个字符串，该字符串是此字符串的子字符串。  
 * */
public class demo_2 {
	public static void main(String[] args) {
		//tihuan_demo();
		//tihuan_demo2();
		//q();
		//h();
	}
	public static void h() {
		String p = "zhanglin";
		print(p.substring(2));//从指定位置开始到结尾。
		//如果字符标识不存在，则会爆出字符串角标越界异常。
		
		print(p.substring(2,4));//从指定位置开始到指定位置结束。（包含头，但不包含尾）。
		//用这种形式如要打印整个字符串的话则p.substring(0,p.length);
	}
	public static void q() {
		String b = "zhangsan,wangwu,lisi";
		String[] arr = b.split(",");
		for(int a = 0;a<arr.length;a++) {
			print(arr[a]);
		}
	}
	public static void tihuan_demo() {
		String k = "hnllo Java";
		String l = k.replace('n','e');
		print(k);//这里需要注意的是，字符串的特性：即其一旦被初始化成功就不会被再次改变。
		//所以可以说明两点：1、这里打印的k字符串仍然是原字符串。
		//2、可以证明的是replace方法必须赋给一个新的字符串。其不能改变原对象。
		print(l);
	}
	public static void tihuan_demo2(){
		String p = "hallo Java";
		String i = p.replace("Java","Python");
		print(i);
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}