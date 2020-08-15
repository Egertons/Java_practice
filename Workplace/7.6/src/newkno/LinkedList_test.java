package newkno;

import java.util.LinkedList;

/*
����LinkedList����ͼģ��һ����ջ���߶��е����ݽṹ��
��ջ���Ƚ����������ͬһ�����ӣ�
���У��Ƚ��ȳ�������ͬһ��ˮ�ܣ�
 * */
public class LinkedList_test {

	public static void main(String[] args) {
		DuiLie a = new DuiLie();
		a.my_add("java 01");
		a.my_add("java 02");
		a.my_add("java 03");
		a.my_add("java 04");
		while(!a.isNull()) {
			print(a.my_get());
		}

	}
	public static void print(Object obj) {
		System.out.println(obj);
	}

}
class DuiLie{
	private LinkedList link;
	DuiLie(){
		link = new LinkedList(); 
	}
	public void my_add(Object obj) {
		link.add(obj);
	}
	public Object my_get() {
		return link.removeLast();
	}
	public boolean isNull() {
		return link.isEmpty();
	}
	public void size() {
		System.out.println(link.size());
	}
}