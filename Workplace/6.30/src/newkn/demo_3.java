package newkn;
/*
7��ת����ȥ���ո񡢱Ƚ�
	7.1���ַ����е�����ת���ɴ�д����Сд��
		String toUpperCase() 
			�������ڴ��ַ� Stringʹ��Ĭ�����Ի����Ĺ����д��  
		String toLowerCase() 
			�������ڴ��ַ� Stringʹ��Ĭ�����Ի����Ĺ�����Сд��  
	7.2���ַ������˵Ķ���ո������
		String trim() 
			����һ���ַ�������ֵΪ���ַ�������ɾ���κ�ǰ����β��ո�  
	7.3�������ַ���������Ȼ˳��ıȽϡ�
		int compareTo(String anotherString) 
			���ֵ�˳��Ƚ������ַ�����  
 * */
public class demo_3 {
	public static void main(String[] args) {
		method_7();
	}
	public static void method_7() {
		String s = "    Hello Java  ";
		print(s.toLowerCase());
		print(s.toUpperCase());
		print(s.trim());
		
		String a1 = "acc";
		String a2 = "abc";
		print(a1.compareTo(a2));
		/*
		������Ҫע����ǣ�
			�����ַ�����ıȽϣ���Ƚϵ���ÿһλ�����Ӧ�ģ��ϵ��ַ���ASCLL��ľ��Դ�С��
			����ö�����ڱȽϱȽ϶����򷵻���ֵ����֮�򷵻ظ�ֵ�����൱�򷵻�0
			���ͬʱ���䷵�ص���ֵ�ֻ��Ǹ�ֵ���Ǽ������Ľ����
		 * */
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}