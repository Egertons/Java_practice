package ����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo_1 {

	public static void main(String[] args) {
		//��׼������ģʽ
		Pattern a = Pattern.compile(".*zhanglin.*");//������ʽ
		Matcher b = a.matcher("zhanglin_achskabchbsuyc");//��Ҫƥ����ַ���
		boolean c = b.matches();
		println("�������ַ�����û���ظ����֣�\t"+c);
	}
	public static void println(Object obj) {
		System.out.println(obj);
	}

}
