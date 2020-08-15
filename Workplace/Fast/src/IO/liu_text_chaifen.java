package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class liu_text_chaifen {

	public static void main(String[] args) {
		File file = new File("E:\\��ʱ�ļ�Ŀ¼\\payday2�����ļ�\\��������.txt");
		int danwei = 10 * 1024;
		chaifen(file,danwei);
	}
	public static void chaifen(File file , int danwei) {
		if((int)file.length()==0) 
			throw new RuntimeException("�ļ���СΪ0�����ɲ��");
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
					in.close();  //��finally�йر����Ǳ���Ĳ���������׼����������
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
				print("��������д��һ���ָ��ļ�����\t"+"�ļ���Ϊ��\t"+file_Tmp.getName()+"��СΪ��\t"+file_Tmp.length());
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
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
