public class array
{
	public static void main(String[] args)
	{
		int[] arr = {88,76,98,1,43,21};

		ArrayTool.print(ArrayTool.getMax(arr));
		
		ArrayTool.selectSort(arr);
		
		ArrayTool.printarray(arr);
	
	}
}
/*
1.�����Ĭ���ļ����ڻ��ߵ�ǰĿ¼��Ŀ��������������Ѿ�������Ϊclass�ֽ����ļ���
		��ô������ļ����е������ļ��Ͳ���Ҫ��д�ⲿ�ִ��룬ֱ��д�ഴ������Ϳ����ˡ�
		
2.���ں�����Ƕ�׺����������#�˴����Ͳ���Ϊ��#��ָ����Ƕ���ں����ķ���ֵ���ͺ��ⲿ�����Ĵ���ֵ��ƥ�䡣
		�����㻹����������Ƕ���ں����ķ���ֵ���ͣ���Ϊ�п��ܰ�void�ĳ�Ŀ�귵��ֵ�󷴵�û��return�ˡ�
*/