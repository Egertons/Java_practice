package newkno;

import java.util.ArrayList;
import java.util.Iterator;

/*
���Զ���������ݴ���ArrayList�����У���ȥ���ظ�Ԫ�ء�

�ܽ᣺
	List�����ж�Ԫ���Ƿ���ͬ�ķ���contains����ԭ��������Ԫ�������equals������
	Ҳ����˵������������ж�����Ļ���ֻ��Ҫ��дԪ�ؼ̳���Object��equals�������ɡ�
 * */
public class demo_2 {

	public static void main(String[] args) {
		ArrayList demo = new ArrayList();
		demo.add(new Person("zhanglin",20));
		demo.add(new Person("xuebowen",20));
		demo.add(new Person("xuebowen",20));
		demo.add(new Person("xuebowen",20));
		demo.add(new Person("wangjinxin",21));
		demo.add(new Person("zhangtong",22));
		demo.add(new Person("zhangtong",22));
		demo.add(new Person("zhangtong",22));
		
		demo = shai(demo);
		
		Iterator  i = demo.iterator();
		while(i.hasNext()) {
			Person p = (Person)i.next();
			print(p.getAge()+"��������"+p.getName());
		}
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static ArrayList shai(ArrayList arr) {
		ArrayList demo = new ArrayList();
		Iterator  i = arr.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			if(!demo.contains(obj)) {
				demo.add(obj);
			}
		}
		return demo;
	}

}
class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person)obj;
		boolean demo = this.name.equals(p.name) && this.age==p.age;
		return demo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}