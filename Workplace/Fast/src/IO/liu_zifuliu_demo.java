package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class liu_zifuliu_demo {

	public static void main(String[] args) {
		File file = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\demo_2.txt");
		zifu_demo(file);
		xieru(file,"HUANG_SI_TONG");
		xieru(file,"��");
	}
	public static void xieru(File file , String tmp) {
		try(FileWriter writer = new FileWriter(file)) {
			char[] all = tmp.toCharArray();
			writer.write(all);
			print("д��ɹ�������");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void zifu_demo(File file) {
		try(FileReader reader = new FileReader(file)) {
			char[] all = new char[(int)file.length()];
			reader.read(all);
			for(char b : all) {
				print(b);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void print(Object obj) {
		System.out.print(obj);
	}
}