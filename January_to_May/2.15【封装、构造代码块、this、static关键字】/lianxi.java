/**
this �ؼ��֣�
this �ʹ�����Ķ��󣬴��������ں���������������á�
��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����ĸ�����
*/
//this��Ӧ�ã����������еĹ���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ�������
import java.util.*;
public class lianxi
{
	public static void main(String[] args)
	{
		demo xin = new demo();
		xin.setAge(32);
		xin.setName("����");
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
	private int age;   //��Ա������ʵ��������
	public static String country = "CN";   //��̬�ĳ�Ա�������������
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
		System.out.println("Java��ӡ");
	}
}

/*
static ��̬�ؼ���
�÷�����һ�����η����������γ�Ա����Ա��������Ա��������
�������κ����䲿����ʵ���ϾͲ����ڶ��ڴ��ˡ�//�Ż����ڴ�ռ�

����Ա����̬���κ󣬾Ͷ���һ���µĵ��÷�ʽ�����˿��Ա���������⣬������ֱ�ӱ��������á�
д��������.��̬��Ա

static ��̬�ؼ��ֲ�������д�����мƻ�����������Ҫ�ı�ĳ�Ա�С�
��static��̬�ؼ��ֱ�ע���Ĳ�����ʵ�����ڴ��е�λ���ǣ����������� 

static�ص㣺
1.������ļ��ض�����
		Ҳ����˵���������ʧ����ʧ��ֻҪ��̬���ֱ�д�����в���ͨ�������˾���������ļ��ض������ص��˷�������
2.�����ڶ������     //������ֻ��newʱ�ű��ڶ��ڴ��д�������static��Ա�����ȴ����ڷ������ġ�
3.�����ж���������
4.����ֱ�ӱ�����������

*/