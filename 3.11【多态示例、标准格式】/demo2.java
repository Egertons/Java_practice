/*
����
		��������ʵ����
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

interface PCI   //�ص�
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
	public void usePCI(PCI p)    //�ص�         �ӿ�������ָ���Լ����������
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