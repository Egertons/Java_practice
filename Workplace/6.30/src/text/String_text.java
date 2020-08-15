package text;
/*
 字符串练习：
 * */
public class String_text {
	public static void main(String[] args) {
		String a = "   ahsbjsaye  ";
		//print(myTrim(a));
		//print(fan(a,1,2));
	}
	//第一题：去除指定字符串两端的空格。
	public static String myTrim(String str) {
		int begin = 0,end=str.length()-1;
		while(begin <= end && str.charAt(begin)==' ') {
			begin+=1;
		}
		while(begin <= end && str.charAt(end)==' ') {
			end-=1;
		}
		return str.substring(begin,end+1);
	}
	//第二题：字符串反转。（指定开始和结尾的位置）
	public static String fan(String str) {
		return fan(str,0,str.length());
	}
	public static String fan(String str,int start,int end) {
		char[] arr = str.toCharArray();
		swap(arr,start,end);
		String ne = String.copyValueOf(arr);
		return ne;
	}
	private static void swap(char[] arr,int x,int y) {
		for(int start = x,end =y;start<=end;start++,end--) {
			app(arr,start,end);
		}
	}
	private static void app(char[] arr,int x,int y) {
		char tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}