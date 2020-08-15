package IO;
/*
����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���

���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ���������try()�н���ʵ������ 
������try, catch, finally������ʱ���Զ��رգ����������Դ��
 * */
import java.io.File;
import java.io.FileInputStream;

public class something_other_liu {

	public static void main(String[] args) {
		File file = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\��������.txt");
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
