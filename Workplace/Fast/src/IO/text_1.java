package IO;

import java.io.File;

public class text_1 {

	public static void main(String[] args) {
		String address = "E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�";
		File MAX = find_MAX(address);
		File MIN = find_MIN(address);
		print("�õ�ַ�������ļ��ǣ�"+MAX.getName());
		print("�õ�ַ����С���ļ��ǣ�"+MIN.getName());
	}
	public static File find_MAX(String address) {
		File f = new File(address);
		File[] fs = f.listFiles();
		long demo = 0;
		for(int a = 0;a<fs.length;a++) {
			demo = (fs[a].length()>a)?fs[a].length() : demo;
		}
		int zh = 0;
		for(int b = 0;b<fs.length;b++) {
			if(fs[b].length()==demo) {
				zh = b;
				break;
			}
		}
		return fs[zh];
	}
	public static File find_MIN(String address) {
		File f = new File(address);
		File[] fs = f.listFiles();
		long demo = 0;
		for(int a = 0;a<fs.length;a++) {
			demo = (fs[a].length()<a)?fs[a].length() : demo;
		}
		int zh = 0;
		for(int b = 0;b<fs.length;b++) {
			if(fs[b].length()==demo) {
				zh = b;
				break;
			}
		}
		return fs[zh];
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
