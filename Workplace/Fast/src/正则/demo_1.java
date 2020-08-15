package 正则;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo_1 {

	public static void main(String[] args) {
		//标准的流程模式
		Pattern a = Pattern.compile(".*zhanglin.*");//正则表达式
		Matcher b = a.matcher("zhanglin_achskabchbsuyc");//需要匹配的字符串
		boolean c = b.matches();
		println("该两个字符串有没有重复部分：\t"+c);
	}
	public static void println(Object obj) {
		System.out.println(obj);
	}

}
