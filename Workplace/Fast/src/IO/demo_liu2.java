package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo_liu2 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\demo_liu_in1.txt");
		try {
			FileOutputStream demo = new FileOutputStream(f);
			byte date[] = {99,77};
			demo.write(date);
			for(int h : date) {
				print(h);
			}
			demo.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}

}
