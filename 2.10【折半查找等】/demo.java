/*
2.10
�ñȽ��ִ��ķ���������~
*/
import java.util.*;
public class demo
{
	public static void main(String[] args)
	{
		int[] uu={80,4,3,21,111,1,34,34};
		Arrays.sort(uu);  
		printshuzu(uu);
		find(uu,34);
		int w = zheban(uu,111)+1;
		System.out.println("\n�������е�"+w+"λ������Ҫ���ҵ�Ԫ��");
	}
	public static void printshuzu(int[] hh)  //��ӡģ��
  {                                       
  	for(int x = 0;x<hh.length;x++)        
  	{                                     
  		System.out.print("["+hh[x]+"]");    
  	}                                     
  	System.out.println();                 
  } 
  public static void find(int[] b,int x)  //�����еĲ���~
  {   
  	for(int h = 0;h<b.length;h+=1)
  	{
  		if(b[h]==x)
  		{
  			int m=h+1;
  			System.out.println("\n�������е�"+m+"λ������Ҫ���ҵ�Ԫ��"+x);
  			break;
  		}
  		else
  		{
  			continue;
  		}
  	}
  	//return -1;
  }
  public static int zheban(int[] h,int x)   //�۰����
  {
  	Arrays.sort(h);
  	int min,max,mid;
  	min = 0;
  	max = h.length-1;
  	mid = (max+min)/2;
  	while(h[mid]!=x)
  	{
  		if(x>h[mid])
  		{
  			min=mid+1;
  		}
  		else if(x<h[mid])
  		{
  			max=mid-1;
  		} 
  		if(min>max)
  			return -1;
  		mid = (min+max)/2;
  	} 
  	return mid;
  }
  /*
  �۰���ҵĵڶ��ַ�����     I like it. 
  */
  public static int zheban_2(int[] arr,int key)
  {
  	int min,max,mid;
  	min=0;
  	max=arr.length;
  	while(min<=max)
  	{
  		mid=(max+min)/2;
  		if(key>arr[mid])
  		{
  			min=mid+1;
  		}
  		else if(key<arr[mid])
  		{
  			max=mid-1;
  		}
  		else
  		{
  			return mid;
  		}
  	}
  	return -1;
  }
}
                               