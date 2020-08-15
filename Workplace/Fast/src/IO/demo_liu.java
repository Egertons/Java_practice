package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_liu {

	public static void main(String[] args) {
		File f = new File("E:\\临时文件目录\\payday2汉化文件\\demo_MIN.txt");
		try {
			FileInputStream demo_in = new FileInputStream(f);
			byte[] arr = new byte[(int)f.length()];
			demo_in.read(arr);
			for(int h : arr) {
				print(h);
			}
			demo_in.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}

}
