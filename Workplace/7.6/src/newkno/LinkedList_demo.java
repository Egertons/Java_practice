package newkno;

import java.util.LinkedList;
/*
LinkedList�����з�����
	�����䱾������ԣ����������ݽṹ��
	���ԣ�����з�����Ҫ�ǹ�����ͷ��β���Ķ�д�����ġ�
	
	�����з�������һ��getFirst()�Լ�getLast() 
	��removeFirst() ��removeLast() ����֮���������
	getֻ���Ԫ��ȡ�������������ʵ�ʼ��Ͻ��и��ġ�
	����remove����ȡ��Ԫ�ص�ͬʱ�Ѹ�Ԫ��ɾȥ�� 
 * */
public class LinkedList_demo {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.addFirst("java 01");
		a.addFirst("java 02");
		a.addFirst("java 03");
		a.addFirst("java 04");
		print(a);
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}

}
