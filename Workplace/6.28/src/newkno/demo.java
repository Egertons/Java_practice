package newkno;
/*
 * �ַ�����
 * ��Ҫ������飺
 * 1����ȡ
 * 		1.3�����ַ���ȡ���ַ����ַ����е�λ�á�
 * 			int indexOf(int ch);���ص���ch���ַ����е�һ�γ��ֵ�λ�á�
 * 				��int chָ���Ǹ��ַ���ASCLL�룩
 * 			int indexOf(String str, int fromIndex)  ���ط���
 * 				���е� int fromIndexָ���Ǵ�ָ��λ�ÿ�ʼ������
 * 		1.4�����ַ�����ȡ���ַ������ַ����е�λ�á�
 * 			int indexOf(String str) 
				����ָ�����ַ�����һ�γ��ֵ��ַ����ڵ�������  
			int indexOf(String str, int fromIndex) 
				����ָ���Ӵ��ĵ�һ�γ��ֵ��ַ����е���������ָ����������ʼ��
		1.5��������
			ǰ��Ļ�ȡ������1.3  1.4���ڷ�����ǰ����last�Ļ�
			�ͻ���ַ�������ʼ�������ܲ���ȫ��һ�¡�
			Eg:
			int lastIndexOf(int ch) 
				����ָ���ַ������һ�γ��ֵ��ַ����е�������  
			int lastIndexOf(int ch, int fromIndex) 
				����ָ���ַ������һ�γ��ֵ��ַ����е���������ָ����������ʼ���������  
			int lastIndexOf(String str) 
				����ָ�����ַ������һ�γ��ֵ��ַ����е�������  
			int lastIndexOf(String str, int fromIndex) 
				����ָ�����ַ��������һ�γ��ֵ��ַ����е���������ָ��������ʼ��������� 
 	2���жϣ�
 		2.1�ж��ַ������Ƿ����һ���Ӵ���
 			boolean contains(CharSequence s) 
				���ҽ������ַ�������ָ����charֵ����ʱ�ŷ���true��  
				����CharSequence��һ���ӿڣ�String�����ڶ�ʵ���е�һ����
			
			����֮�����ù��ܿ�������һ��ʵ�֣�
				IndexOf(String str)�÷���ԭ�����������ַ�����ָ���ַ���λ��
					���������ʧ�ܵĻ������Զ�����-1
					�����Ϳ��Ա���������ж�ָ���ַ����Ƿ�����ڸ��ַ������С�
			
 		2.2�ж��ַ������Ƿ������ݡ�
 			boolean isEmpty() 
				���� true������ҽ��� length()Ϊ 0 �� 
				ע�⣺"" �� null��������ġ� 
 		2.3�ж��ַ����Ƿ�����ָ�������ݿ�ͷ��
 			boolean startsWith(String prefix) 
				���Դ��ַ����Ƿ���ָ����ǰ׺��ͷ��  
 		2.4�ж��ַ����Ƿ�����ָ�������ݽ�β��
 			boolean endsWith(String suffix) 
				���Դ��ַ����Ƿ���ָ���ĺ�׺��β�� 
		2.5�ж��ַ����������Ƿ���ͬ��
		 	boolean equals(Object anObject) 
				�����ַ�����ָ��������бȽϡ� 
		2.6�ж��ַ����������Ƿ���ͬ�������Դ�Сд��
			boolean equalsIgnoreCase(String anotherString) 
				���� String������ String�Ƚϣ����԰���ע�����  
 * */
public class demo {
	public static void main(String[] args) {
		//method_get();
		method_is();
	}
	public static void method_is() {
		String is = "Array_demo.java";
		//�жϸ��ַ������Ƿ����ָ���ַ�
		print(is.contains("demo"));
		//�жϸ��ַ������Ƿ���ָ���ַ���ͷ
		print(is.startsWith("Array"));
		//�жϸ��ַ������Ƿ���ָ���ַ���β
		print(is.endsWith("java"));
		//�жϸ��ַ����Ƿ�Ϊ��
		print(is.isEmpty());
	}
	public static void method_get() {
		String str = "zhanglin";
		//����
		print(str.length());
		//����������ȡ�ַ�
		print(str.charAt(2));
		//��������������ֳ����ַ����ַ�������Χ���ͻᱬ���ַ����Ǳ�Խ���쳣��
		
		//�����ַ���ȡ����
		print(str.indexOf('a'));
		//�����������ַ����û���ҵ��Ļ����᷵��-1
		print(str.indexOf('a',2));//���ֲ�ͬ��ʽ������
		//��������ʾ��
		print(str.lastIndexOf('i'));//ע�⣺����ķ���������ָ������˳�����ı䣬�Ǳ겻�䡣
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}