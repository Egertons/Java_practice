/*
����ѡ������ı�׼�汾~        ѡ������
*/
class yuy
{ 
	public static void paixu(int[] b)
	{
		for(int x = 1;x<b.length;++x)
		{
			for(int y = x+1;y<b.length;y+=1)
			{
				if(b[x]>b[y])     //ֻҪ��>  �ĳ�  <  �Ϳ��Խ���    �������С�
				{
					int tmp = b[x];
					b[x]=b[y];
					b[y]=tmp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {5,66,44,33,87,987};
		printshuzu(arr);
		paixu(arr);
		printshuzu(arr);
	}  
	public static void printshuzu(int[] hh)  
 {                                        
  	for(int x = 0;x<hh.length;x++)         
  	{                                      
  		System.out.print("["+hh[x]+"]");     
  	}
  	System.out.println();                                      
  }
}         



/*
ð������ı�׼���衣
*/
class maoPao  
/*
ð������
���ڵ�����Ԫ�ؽ��бȽϣ�������������ͻ�λ�� 
�����ص㣺
			��ʵԭ��Ҳ�Ǳ������飬ֻ����ð��������ص���ÿһ�α�����ֻ�Ƚ����ڵ�����Ԫ�أ�
				��һ���ı���֮����Կ�������ֵ�Ĺ��ɻ��˶�����������ð�ݡ���
			ÿһ�α�������ֵ���������һλ�ϣ�Ȼ��������һ�α���������������ĳ����м�ȥ
				��Ӧ��λ��������Ӧ�ڴ����е�-x��
			�����У�-1���Ĳ��ֽ��ͣ�
				��Ϊ��ʵ��if��������ٽ�������Ԫ��֮��ıȽϹ�ϵ �ʶ������е����һλ��(y+1)
				ʱ����������û�п��Զ�Ӧy+1��ʵ��ֵ�ġ��ʶ�Ӧ�ڱ������������-1.
*/
{
	public static void maopao(int[] b)
	{
		for(int x = 0;x<b.length;x+=1)
		{
			for(int y = 0;y<b.length-x-1;y++)           //-x����ÿһ�αȽϵ�Ԫ�ؼ��٣�-1�Ǳ���Ǳ�Խ�硣
			{
				if(b[y]>b[y+1])                         //ֻҪ��>  �ĳ�  <  �Ϳ��Խ���    �������С�
				{
					int tmp = b[y];
					b[y]=b[y+1];
					b[y+1]=tmp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] atx={3,1,4,66,2,23};
		printshuzu(atx);	
		maopao(atx);
		printshuzu(atx);
	} 
	public static void printshuzu(int[] hh) 
  {                                                                     
  	for(int x = 0;x<hh.length;x++)        
  	{                                     
  		System.out.print("["+hh[x]+"]");    
  	}                                     
  	System.out.println();                 
  }
}                               