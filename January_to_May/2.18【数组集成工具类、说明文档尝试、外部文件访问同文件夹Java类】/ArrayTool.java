/*
什么时候使用静态：

主要从两个方面切入：成员变量和成员函数。

什么时候定义静态的变量（类变量）
	当对象中出现共享数据，该数据被静态所修饰，
	同时对象中的非共享数据（特有数据）要定义成非静态变量，存在于堆内存中。
	  //注意区分共享数据和共享属性
	  
什么时候定义静态的函数？ 
	当功能内部没有访问到非静态数据（对象的特有数据）那么该功能可以定义为静态函数。 
*/

//Java的说明书由文档注释来完成。   注意！! ！ 需要解析出使用文档的Java文件，其源代码中的类必须是public修饰的！  

//doc命令体现：javadoc -d 路径 -author -version  源文件.java

/**
数组集成开发工具
这是一个可以对数组进行操作的工具类，该类中提供了，获取最值
排序等功能。
@author  Egertons
@version  V1.0
*/
public class ArrayTool
{
	//将构造函数私有化，有助于优化内存空间，避免用户误创建新对象。
	private ArrayTool()
	{
		/*
		一个类中默会有一个空参数的构造函数，
		这个默认的构造函数的权限与所属类一致，
		如果类被public修饰，那么默认的构造函数也会带public修饰符。
		当然，如果类没有被public修饰，那么默认的构造函数，也没有public修饰。
		
		默认的构造函数的权限是随着类的变化而变化的。
		*/
	}
	/**
	获取一个整形数组的最大值。
	@param arr  接收一个int类型的数组。
	@return int 返回一个int数组的最大值。
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x+=1)
		{
			if(arr[x]>arr[max])
			{
				max = x;
			}
		}
		return arr[max];
	}
	
	/**
	获取一个整形数组的最小值。
	@param arr  接收一个int类型的数组。
	@return int 返回一个int数组的最小值。
	*/
	
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x = 1;x<arr.length;x+=1)
		{
			if(arr[x]<arr[min])
			{
				min = x;
			}
		}
		return arr[min];
	}
	
	/**
	获取一个整形数组的选择排序结果。
	@param arr  接收一个int类型的数组。
	*/
	
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x+=1)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	
	/**
	获取一个整形数组的冒泡排序结果。
	@param arr  接收一个int类型的数组。
	*/
	
	public static void bubbleSort(int[] arr)
	{
		for(int x = 0;x<arr.length;x+=1)
		{
			for(int y = 0;y<arr.length-x-1;y+=1)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	
	/**
	给数组中的元素进行位置的置换
	@param arr 接收一个int类型的数组
	@param a  要置换的位置
	@param b  要置换的位置
	*/
	
	private static void swap(int[] arr,int a,int b)
	{
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	/**
	打印一个常量。
	@param a  接收一个int类型的常量。
	*/
	
	public static void print(int a)
	{
		System.out.println(a);
		System.out.println();
	}
	
	/**
	打印一个数组（遍历）。
	打印结果:[element1,element2,……]
	@param arr  接收一个int类型的常量。
	*/
	
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for(int x = 0;x<arr.length;x+=1)
		{
			System.out.print(arr[x]);
			if(x!=arr.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
}
//通常工具类中定义的都是静态方法。