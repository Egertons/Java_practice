package newkno;

import java.util.LinkedList;
/*
LinkedList的特有方法：
	由于其本身的特性（链表类数据结构）
	所以，其独有方法主要是关于在头和尾部的读写操作的。
	
	其特有方法中有一个getFirst()以及getLast() 
	和removeFirst() 和removeLast() 它们之间的区别是
	get只会把元素取出来，并不会对实际集合进行更改。
	但是remove会在取出元素的同时把该元素删去。 
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
