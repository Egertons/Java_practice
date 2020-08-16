/*
ʲôʱ��ʹ�þ�̬��

��Ҫ�������������룺��Ա�����ͳ�Ա������

ʲôʱ���徲̬�ı������������
	�������г��ֹ������ݣ������ݱ���̬�����Σ�
	ͬʱ�����еķǹ������ݣ��������ݣ�Ҫ����ɷǾ�̬�����������ڶ��ڴ��С�
	  //ע�����ֹ������ݺ͹�������
	  
ʲôʱ���徲̬�ĺ����� 
	�������ڲ�û�з��ʵ��Ǿ�̬���ݣ�������������ݣ���ô�ù��ܿ��Զ���Ϊ��̬������ 
*/

//Java��˵�������ĵ�ע������ɡ�   ע�⣡! �� ��Ҫ������ʹ���ĵ���Java�ļ�����Դ�����е��������public���εģ�  

//doc�������֣�javadoc -d ·�� -author -version  Դ�ļ�.java

/**
���鼯�ɿ�������
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ
����ȹ��ܡ�
@author  Egertons
@version  V1.0
*/
public class ArrayTool
{
	//�����캯��˽�л����������Ż��ڴ�ռ䣬�����û��󴴽��¶���
	private ArrayTool()
	{
		/*
		һ������Ĭ����һ���ղ����Ĺ��캯����
		���Ĭ�ϵĹ��캯����Ȩ����������һ�£�
		����౻public���Σ���ôĬ�ϵĹ��캯��Ҳ���public���η���
		��Ȼ�������û�б�public���Σ���ôĬ�ϵĹ��캯����Ҳû��public���Ρ�
		
		Ĭ�ϵĹ��캯����Ȩ����������ı仯���仯�ġ�
		*/
	}
	/**
	��ȡһ��������������ֵ��
	@param arr  ����һ��int���͵����顣
	@return int ����һ��int��������ֵ��
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
	��ȡһ�������������Сֵ��
	@param arr  ����һ��int���͵����顣
	@return int ����һ��int�������Сֵ��
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
	��ȡһ�����������ѡ����������
	@param arr  ����һ��int���͵����顣
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
	��ȡһ�����������ð����������
	@param arr  ����һ��int���͵����顣
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
	�������е�Ԫ�ؽ���λ�õ��û�
	@param arr ����һ��int���͵�����
	@param a  Ҫ�û���λ��
	@param b  Ҫ�û���λ��
	*/
	
	private static void swap(int[] arr,int a,int b)
	{
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	/**
	��ӡһ��������
	@param a  ����һ��int���͵ĳ�����
	*/
	
	public static void print(int a)
	{
		System.out.println(a);
		System.out.println();
	}
	
	/**
	��ӡһ�����飨��������
	��ӡ���:[element1,element2,����]
	@param arr  ����һ��int���͵ĳ�����
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
//ͨ���������ж���Ķ��Ǿ�̬������