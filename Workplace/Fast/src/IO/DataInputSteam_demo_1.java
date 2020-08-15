package IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputSteam_demo_1 {

	public static void main(String[] args) {
		File file = new File("E:\\临时文件目录\\payday2汉化文件\\demo_2.txt");
		demo(file);
	}
	public static void demo(File file){
		StringBuffer sb = new StringBuffer();
		String tmp;
		try(
			FileInputStream file_in = new FileInputStream(file);
			DataInputStream data_in = new DataInputStream(file_in);
			) {
			//sb.append(data_in.readUTF());
			tmp = data_in.readUTF();
			if(tmp==null) {
				print("未读取到数据！");
			}else {
				print("读取到的字符串为：\t"+ tmp );
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
