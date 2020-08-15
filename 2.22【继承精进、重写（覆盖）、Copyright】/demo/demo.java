class copyRight
{
		private copyRight(){};
		private static char a[] = {70,82,79,77,58,90,104,97,110,103,95,76,105,110,0};
		public static void getCopyright()
		{
			for(int x = 0;x<a.length;x+=1)
			{
				if(x==0)
				{
					System.out.print("\n");
				}
				System.out.print(a[x]);
			}
		}
}


class demo
{
	public static void main(String[] args)
	{
		copyRight.getCopyright();
	}
}