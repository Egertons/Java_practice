package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class liu_text_hebing {

	public static void main(String[] args) {
		File f1 = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\��������.txt----0");
		File f2 = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\��������.txt----1");
		File[] demo = {f1,f2};
		hebing(demo);
	}
	public static void hebing(File[] file) {
		int count=0;
		for(int a = 0;a<file.length;a++) {
			count+=(int)file[a].length();
		}
		byte[] arr = new byte[count];
		for(int b = 0;b<file.length;b+=1) {
			FileInputStream in = null;
			try {
				in = new FileInputStream(file[b]);
				in.read(arr);
				print("��ȡ�ɹ�\t"+b);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(in!=null)
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
		File new_file = new File(file[0].getParent(),"�ºϲ��ļ�");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(new_file);
			out.write(arr);
			print("�ļ�д���ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}