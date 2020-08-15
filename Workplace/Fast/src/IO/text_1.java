package IO;

import java.io.File;

public class text_1 {

	public static void main(String[] args) {
		String address = "E:\\临时文件目录\\payday2汉化文件";
		File MAX = find_MAX(address);
		File MIN = find_MIN(address);
		print("该地址中最大的文件是："+MAX.getName());
		print("该地址中最小的文件是："+MIN.getName());
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
