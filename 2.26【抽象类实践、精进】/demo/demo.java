/*
需求是定义一个公司的人员系统，由员工和经理两种职业组成。工资待遇不同。要求运用继承思想。
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
		super(name,num,pay);         //这种在子类中打包构造函数数据反传回父类执行是一种非常高效的处理手法。
	}
	
	public void work()
	{
		System.out.println("正常工作");
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
		System.out.println("经理工作");
	}
}