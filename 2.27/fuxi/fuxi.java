public class fuxi
{
	public static void main(String[] args)
	{
		worker h = new worker("zhanglin","5600",7800);
		h.print();
	}
}

abstract class muban
{
	String name;
	String num;
	double pay;
	muban(String name,String num,double pay)
	{
		this.name = name;
		this.num = num;
		this.pay = pay;
	}
	abstract void work();
	public void print()
	{
		System.out.println("name="+name+"  num="+num+"  pay="+pay);
	}
}

class worker extends muban
{
	worker(String name,String num,double pay)
	{
		super(name,num,pay);
	}
	void work()
	{
		System.out.println("正常员工工作");
	} 
}