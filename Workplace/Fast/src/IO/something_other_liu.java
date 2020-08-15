package IO;
/*
把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
这种编写代码的方式叫做 try-with-resources， 这是从JDK7开始支持的技术

所有的流，都实现了一个接口叫做 AutoCloseable，任何类实现了这个接口，都可以在try()中进行实例化。 
并且在try, catch, finally结束的时候自动关闭，回收相关资源。
 * */
import java.io.File;
import java.io.FileInputStream;

public class something_other_liu {

	public static void main(String[] args) {
		File file = new File("E:\\临时文件目录\\payday2汉化文件\\测试用例.txt");
		byte[] arr = new byte[(int)file.length()];
		try(FileInputStream in = new FileInputStream(file)) {
			in.read(arr);
		} catch (Exception e) {
			e.getMessage();
		}
		for(int d = 0;d<arr.length;d++) {
			print(arr[d]);
		}
	}
	public static void print(Object obj) {
		System.out.print(obj);
	}
}
