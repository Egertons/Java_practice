/*
�����Ƕ���һ����˾����Աϵͳ����Ա���;�������ְҵ��ɡ����ʴ�����ͬ��Ҫ�����ü̳�˼�롣
*/
public class demo
{
	public static void main(String[] args)
	{
		jingli h = new jingli("zhanglin","20",8500,3000);
		h.work();
	}
}

abstract class yuangong
{
	private String name;
	private String num;
	private double pay;
	yuangong(String name,String num,double pay)
	{
		this.name = name;
		this.num = num;
		this.pay = pay;
	}
	
	abstract public void work();
}

class puyuan extends yuangong
{
	puyuan(String name,String num,double pay)
	{
		super(name,num,pay);         //�����������д�����캯�����ݷ����ظ���ִ����һ�ַǳ���Ч�Ĵ����ַ���
	}
	
	public void work()
	{
		System.out.println("��������");
	}
}

class jingli extends yuangong
{
	private double jiangjin;
	jingli(String name,String num,double pay,double jiangjin)
	{
		super(name,num,pay);
		this.jiangjin = jiangjin;
	}
	
	public void work()
	{
		System.out.println("������");
	}
}