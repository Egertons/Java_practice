package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class demo_liu {

	public static void main(String[] args) {
		File f = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\demo_MIN.txt");
		try {
			FileInputStream demo_in = new FileInputStream(f);
			byte[] arr = new byte[(int)f.length()];
			demo_in.read(arr);
			for(int h : arr) {
				print(h);
			}
			demo_in.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}

}
