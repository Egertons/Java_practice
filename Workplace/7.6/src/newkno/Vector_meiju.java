package newkno;
/*
ö�پ���Vector���е�һ��ȡ����ʽ��
���ڹ��ܲ�������������������ظ��ġ�
���ҵ����������ƺ͹��ܶ�Ҫ��ö��Ҫǿ��
�ʶ���ö�����ڻ������Ѿ�����̭�ˡ�
����IO����ö���ƺ���Ȼ���ڡ�
 * */
import java.util.Enumeration;
import java.util.Vector;

public class Vector_meiju {

	public static void main(String[] args) {
		Vector a = new Vector();
		a.add("java 01");
		a.add("java 02");
		a.add("java 03");
		a.add("java 04");
		
		Enumeration e = a.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
