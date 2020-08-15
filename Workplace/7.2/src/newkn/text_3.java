package newkn;
public class text_3 {
	public static void main(String[] args) {
		String k = "llzhanglinllhuangsitongllxuebowen";
		print("练习三解法一：该字符串中共有"+demo_1(k,"ll")+"个ll。");
		print("练习三解法二：该字符串中共有"+demo_2(k,"ll")+"个ll。");
		//第三种解法：使用切割字符串的方式实现（但是，有BUG，不建议使用）
		print("count="+k.split("ll").length);
	}
	//练习三：获取一个字符子串在该字符串中出现的次数。
	public static int demo_1(String str,String key){
		int count = 0;
		int a = 0;
		while((a=str.indexOf(key))!=-1){
			str = str.substring(a+key.length());
			count+=1;
		}
		return count;
	}
	//练习三（解法二）
	public static int demo_2(String str,String key) {
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index+=key.length();
			count+=1;
		}
		return count;
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}