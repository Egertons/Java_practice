public class demo
{
	public static void main(String[] args)
	{
		
	}
}


/*
1.����ʵ������ʱ���ʼִ�е�������Ĺ��캯����
			������Ĺ��캯���еĵ�һ������ִ�еľ�����̳еĸ���Ĺ��졣
*/

//2.��32�б���ʧ�ܣ�����̬��A�ӿ��в�δ����func������
interface A{}
class B implements A
{
	public String func()
	{
		return "func";
	}
}

class D
{
	public static void main(String[] args)
	{
		A a = new B();
		System.out.println(a.func());
	}
}

//3   ��ȷ�𰸣� A B  ��Ҫ������ڶ�̬�����
class Fu
{
	boolean show(char a)
	{
		System.out.println(a);
		return true;
	}
}
class Zi extends Fu
{
	public static void main(String[] args)
	{
		int i = 0;
		Fu f = new Zi();
		Zi d = new Zi();
		for(f.show('A');f.show('B') && (i<2);f.show('C'))
		{
			i++;
			d.show('D');
		}
		boolean show(char a)
		{
			System.out.println(a);
			return false;
		}
	}
}

//4   ����ʧ�ܣ���ΪA�ӿ���û�ж���÷�����ע�Ȿ���ڴ�������ʱ�ġ����á��ǽӿڵ����ã���
interface A
class B implements A
{
	public String test()
	{
		return "yes";
	}
}
class D
{
	static A get()
	{
		return new B();
	}
	public static void main(String[] args)
	{
		A a = get();
		System.out.println(a.test());
	}
}

//5 �����������ʵ����ʱ��ִ���乹�캯����û������˵��������£�����Ҫ��һ���丸��ġ��ղΡ����졣
//6 
interface Inter
{
	void show(int a,int b);
	void func();
}
class F
{
	public static void main(String[] args)
	{
		//������룻��������������Ҫ���������ڲ���
		Inter in = new Inter()
		{
			public void show(int a,int b)
			{
				
			}
			public void func()
			{
				
			}
		};//��������д���ã���Ϊ���������ֻ�ܵ���һ��������
		
		in.show(4,5);
		in.func();
	}
}