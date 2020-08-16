/*
需求：
		电脑运行实例：
*/
public class demo2
{
	public static void main(String[] args)
	{
		mainBoard first = mainBoard.show();
		first.run();
		first.usePCI(new netCard());
		first.usePCI(new soundCard());
	}
}

interface PCI   //重点
{
	public abstract void open();
	public abstract void close();
}

class mainBoard
{
	private mainBoard(){}
	private static mainBoard text = new mainBoard();
	public static mainBoard show()
	{
		return text;
	}
	public void run()
	{
		System.out.println("mainBoard run");
	}
	public void usePCI(PCI p)    //重点         接口型引用指向自己的子类对象
	{
		if(p!=null)
		{
			p.open();
			p.close();
		}
	}
}

class netCard implements PCI
{
	public void open()
	{
		System.out.println("netCard open");
	}
	public void close()
	{
		System.out.println("netCard close");
	}
}

class soundCard implements PCI
{
	public void open()
	{
		System.out.println("soundCard open");
	}
	public void close()
	{
		System.out.println("soundCard close");
	}
}