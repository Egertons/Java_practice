/*
数组选择排序的标准版本~        选择排序
*/
class yuy
{ 
	public static void paixu(int[] b)
	{
		for(int x = 1;x<b.length;++x)
		{
			for(int y = x+1;y<b.length;y+=1)
			{
				if(b[x]>b[y])     //只要把>  改成  <  就可以进行    降序排列。
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
冒泡排序的标准步骤。
*/
class maoPao  
/*
冒泡排序：
相邻的两个元素进行比较，如果符合条件就换位。 
记忆特点：
			其实原理也是遍历数组，只不过冒泡排序的特点是每一次遍历都只比较相邻的两个元素，
				再一遍遍的遍历之后可以看到，数值的规律化运动，“类似于冒泡”。
			每一次遍历，最值出现在最后一位上，然后再在下一次遍历中在所需遍历的长度中减去
				相应的位数。（对应在代码中的-x）
			代码中（-1）的部分解释：
				因为在实际if语句中是临近的两个元素之间的比较关系 故而当进行到最后一位的(y+1)
				时，数组中是没有可以对应y+1的实际值的。故而应在遍历长度中最后-1.
*/
{
	public static void maopao(int[] b)
	{
		for(int x = 0;x<b.length;x+=1)
		{
			for(int y = 0;y<b.length-x-1;y++)           //-x是让每一次比较的元素减少，-1是避免角标越界。
			{
				if(b[y]>b[y+1])                         //只要把>  改成  <  就可以进行    降序排列。
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