package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class liu_text_1 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\临时文件目录\\payday2汉化文件\\demo\\text_1\\zhanglin\\demo.txt");
		File p = f.getParentFile();
		if(!p.exists()) {
			p.mkdirs();
		}
		FileOutputStream j = new FileOutputStream(f);
		byte data[] = {77,99};
		j.write(data);
		j.close();
	}

}
