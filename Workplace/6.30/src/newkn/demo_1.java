package newkn;
/*
3��ת��
	3.1���ַ�����ת���ַ�����
		���캯����String(char[] value)
				 String(char[] value,int offset,int count)���ַ������е�һ����ת���ַ�����
		��̬������
				static String copyValueOf(char[] data) 
					�൱�� valueOf(char[]) ��  
				static String copyValueOf(char[] data, int offset, int count) 
					�൱�� valueOf(char[], int, int) �� 
	3.2���ַ���ת���ַ����顣***
		char[] toCharArray() 
			�����ַ���ת��Ϊ�µ��ַ����顣  
	3.3���ֽ�����ת���ַ������������˽⣬�ص�Ӧ����IO��
		�ɲ�ѯ��Ӧ�Ĺ��캯�����ڴ˲��о�չ����
	3.4���ַ���ת���ֽ����顣�������˽⣬�ص�Ӧ����IO��
		byte[] getBytes(String charsetName) 
			ʹ���������ַ������� String����Ϊ�ֽ����У�������洢���µ��ֽ������С�  
	3.5��������������ת���ַ�����
		��̬������
			static String valueOf(�����κλ�����������) 
				���ء������������Ͳ��������ַ����������������͡���ʽ��  
				
	��Ҫע����ǣ��ڴ��ַ���ת���ֽ�����Ĺ������ǿ���ָ�������ġ�
 * */
public class demo_1 {
	public static void main(String[] args) {
		tains();
		char_to_Array();
	}
	public static void tains() {
		char[] arr = {'a','b','c','d','e','f','g'};
		
		String s = new String(arr);
		print("s  =  "+s);
		String x = new String(arr,1,3);//����1����ʼλ�ã�3�Ǹ�������������ֹλ����
		print("x  =  "+x);
	}
	public static void valueOf() {
		int u = 3;
		String a = String.valueOf(u);//��������������ת���ַ�����
	}
	public static void char_to_Array() {
		String l = "hjsgsdjsbiudcgase";
		char[] p = l.toCharArray();
		for(int c = 0;c<p.length;c++) {
			print("p="+p[c]);
		}
	}
	public static void print(Object o) {
		System.out.println(o);
	}
}