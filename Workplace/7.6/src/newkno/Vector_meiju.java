package newkno;
/*
枚举就是Vector特有的一种取出方式。
其在功能层面上来讲与迭代器是重复的。
并且迭代器的名称和功能都要比枚举要强大，
故而，枚举现在基本上已经被淘汰了。
但在IO流中枚举似乎依然存在。
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
