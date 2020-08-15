package IO;

import java.io.File;
import java.util.Date;

public class demo_1 {

	public static void main(String[] args) {
		File f1 = new File("E:\\临时文件目录\\payday2汉化文件");
		print("当前文件的绝对地址是："+f1.getAbsoluteFile());
		print("当前对象是否为文件夹："+f1.isDirectory());
		Date d = new Date();
		print("时间："+d);
		f1.setLastModified(0);//设置最后的文件修改日期。
		print(f1.lastModified());
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
