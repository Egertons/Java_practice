/**
this 关键字：
this 就代表本类的对象，代表它所在函数所属对象的引用。
简单说：哪个对象在调用this所在的函数，this就代表哪个对象。
*/
//this的应用：当定义类中的功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。
import java.util.*;
public class lianxi
{
	public static void main(String[] args)
	{
		demo xin = new demo();
		xin.setAge(32);
		xin.setName("张霖");
		xin.print();
		System.out.println(demo.country);
	}
}
class demo
{
	demo()
	{
		
	};
	private String name;
	private int age;   //成员变量、实例变量。
	public static String country = "CN";   //静态的成员变量、类变量。
	public void setAge(int age)
	{
		if(age>=0 && age<130)
			this.age = age;
		else
			System.out.println("error");
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println(this.name+"  "+this.age);
		this.dayin();
	}
	public void dayin()
	{
		System.out.println("Java打印");
	}
}

/*
static 静态关键字
用法；是一个修饰符，用于修饰成员（成员变量、成员函数）。
被其修饰后的语句部分其实际上就不属于堆内存了。//优化堆内存空间

当成员被静态修饰后，就多了一种新的调用方式，除了可以被对象调用外，还可以直接被类名调用。
写法：类名.静态成员

static 静态关键字不适用于写在类中计划将来其内容要改变的成员中。
被static静态关键字标注过的部分其实际在内存中的位置是（方法区）。 

static特点：
1.随着类的加载而加载
		也就是说随着类的消失而消失，只要静态部分被写到类中并且通过编译了就是随着类的加载而被加载到了方法区。
2.优先于对象存在     //对象是只有new时才被在堆内存中创建，而static成员是优先存在于方法区的。
3.被所有对象所共享
4.可以直接被类名所调用

*/