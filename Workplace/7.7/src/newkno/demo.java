package newkno;
/*
ArrayList��ϰ��
	��ȥĳһָ�������е��ظ�Ԫ�ء�
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class demo {

	public static void main(String[] args) {
		ArrayList kk = new ArrayList();
		kk.add("java 01");
		kk.add("java 01");
		print(shai(kk));

	}
	public static ArrayList shai(ArrayList e) {
		ArrayList demo = new ArrayList();
		Iterator i = e.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			
			if(!demo.contains(obj)) {
				demo.add(obj);
			}
		}
		return demo;
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}
