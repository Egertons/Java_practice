public class demo
{
	public static void main(String[] args)
	{
		q.w u = new q().new w();
		u.show();
	}
}


class q
{
	int x = 1;
	class w
	{
		int x = 2;
		public void show()
		{
			int x = 3;
			//之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，格式是  外部类名.this
			System.out.println("x="+x);     //这时打印的是3
			System.out.println("x="+this.x);   //这时打印的是2
			System.out.println("x="+q.this.x);    //这时打印的是1
		}
	}
}
