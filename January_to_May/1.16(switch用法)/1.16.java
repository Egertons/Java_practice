class zl
{
	public static void main (String[] args)
		{
			int x = 3 ;
			/*
				if (x == 3 || x == 4 || x == 5 )      // ���ñȽ�������򻯴���ṹ��||������������������������ʱ��ʱֹͣ����ߴ���Ч�ʡ�
					System.out.println(x+"����");     
				else if (x == 6 || x == 7 || x == 8)
					System.out.println(x+"�ļ�");
				else if (x == 9 || x == 10 || x == 11)
					System.out.println(x+"�＾");
				else if(x == 12 || x == 1 || x == 2)
					System.out.println(x+"����");
				else 
					System.out.println(x+"�·ݲ�����");     //��ֹ���������
			*/
			
			//����д��   д����
			/*
			if (x>12 || x<1)
					System.out.println(x+"�·ݲ�����");     //��ֹ���������
			else if (x>=3 && x<=5)
				System.out.println(x+"����");
			else if (x>=6 && x<=8)
				System.out.println(x+"�ļ�");
			else if (x>=9 && x<=11)
				System.out.println(x+"�＾");
			else
				System.out.println(x+"����");
			*/
			switch (x)
			{
				case   3:
				case   4:
				case   5:
					System.out.println(x+"����"+"\n\t");
				break;
			}
			/*
			while (x <= 6)
			{
				System.out.println("x="+x);
				x++;
			}
			*/
			System.out.println("Hello World ���� ");
		}
}