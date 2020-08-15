package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class liu_text_hebing {

	public static void main(String[] args) {
		File f1 = new File("E:\\临时文件目录\\payday2汉化文件\\测试用例.txt----0");
		File f2 = new File("E:\\临时文件目录\\payday2汉化文件\\测试用例.txt----1");
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
				print("读取成功\t"+b);
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
		File new_file = new File(file[0].getParent(),"新合并文件");
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(new_file);
			out.write(arr);
			print("文件写出成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}