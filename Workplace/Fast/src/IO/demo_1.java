package IO;

import java.io.File;
import java.util.Date;

public class demo_1 {

	public static void main(String[] args) {
		File f1 = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�");
		print("��ǰ�ļ��ľ��Ե�ַ�ǣ�"+f1.getAbsoluteFile());
		print("��ǰ�����Ƿ�Ϊ�ļ��У�"+f1.isDirectory());
		Date d = new Date();
		print("ʱ�䣺"+d);
		f1.setLastModified(0);//���������ļ��޸����ڡ�
		print(f1.lastModified());
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
