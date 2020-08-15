package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class liu_text_chaifen {

	public static void main(String[] args) {
		File file = new File("E:\\临时文件目录\\payday2汉化文件\\测试用例.txt");
		int danwei = 10 * 1024;
		chaifen(file,danwei);
	}
	public static void chaifen(File file , int danwei) {
		if((int)file.length()==0) 
			throw new RuntimeException("文件大小为0，不可拆分");
		byte[] arr = new byte[(int)file.length()];
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			in.read(arr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)
					in.close();  //在finally中关闭流是必须的操作，（标准做法）！！
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		int num;
		if(file.length()%danwei==0) {
			num = (int)file.length()/danwei;
		}else {
			num = ((int)file.length()/danwei)+1;
		}
		for(int a = 0;a<num;a++) {
			String fileName = file.getName()+"----"+a;
			File file_Tmp = new File(file.getParent(),fileName);
			byte[] tmp ;
			if(num-1!=a) {
				tmp = Arrays.copyOfRange(arr,danwei*a,danwei*(a+1));
			}else {
				tmp = Arrays.copyOfRange(arr,danwei*a,arr.length);
			}
			FileOutputStream out = null;
			try {
				out = new FileOutputStream(file_Tmp);
				out.write(tmp);
				print("您以正常写出一个分割文件！！\t"+"文件名为：\t"+file_Tmp.getName()+"大小为：\t"+file_Tmp.length());
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
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
