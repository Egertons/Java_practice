package newkno;
/*
StringBuffer:���ַ�����������
1.���������Ծ��ǿ��ԶԱ��������޸ĵ��ַ��������޸ġ�
2.�䱾����һ�������ȿɱ仯�ġ�����ͬʱ���ݶ������͵�������
	���ջ�ͨ��toString��������ַ�����
3.��������:
	3.1�洢
		�������䶨��ķ����������ֻ������������޷���ֱ�ӡ���ӡ�
			byte��short��
		StringBuffer append(�������������͡�) 
			�� ������������ �������ַ�����ʾ���ӵ������С�
		StringBuffer insert(int offset, boolean b) ��������������������
			�ڴ������в��� boolean�������ַ�����ʾ��ʽ��  
				���ڲ�����ԣ��������Ǳ�λ�����ڣ������ֽǱ�Խ���쳣��
	3.2ɾ��
		StringBuffer delete(int start, int end) ����ͷ������β
			ɾ�������е����ַ����е��ַ��� 
		StringBuffer deleteCharAt(int index) 
			ɾ�� char����������е�ָ��λ�á�  
	3.3��ȡ
		char charAt(int index) 
			���� char��ָ���������������ֵ�� 
		int indexOf(String str) 
			����ָ�����ַ�����һ�γ��ֵ��ַ����ڵ������� 
		�ȵȣ��䷽��������Stringһ�¡����õ�ʱ���鼸��API�Ϳ����ˣ��� 
	3.4�޸�
		StringBuffer replace(int start, int end, String str) ����ͷ������β
			��ָ����String�е��ַ��滻�����е����ַ����е� String �� 
		void setCharAt(int index, char ch) 
			ָ�����������ַ�����Ϊ ch ��
	3.5��ת
	 	StringBuffer reverse() 
			���¸��ַ����б����е��෴���档  
	3.6���������е�ָ�����ݴ�ŵ�ָ�����ַ�������ȥ����ע�����Ǳ�Խ�磩
		void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
			�ַ��Ӹ����и��Ƶ�Ŀ���ַ����� dst ��  
 * */
public class StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();
		a.append(true).append('c').append(77);//������������
		a.insert(1,"zhanglin");
		print(a);
		a.delete(0,a.length());//��ջ�������
		method_update();
		method_update_2();
		method_2(); 
	}
	public static void method_2() {
		StringBuffer a = new StringBuffer("abcdefg");
		char[] arr = new char[6];
		a.getChars(0,3,arr,0);
		for(int x = 0;x<arr.length;x++) {
			print("arr["+x+"]=\t"+arr[x]+";");
		}
	}
	public static void method_update() {
		StringBuffer str = new StringBuffer("zhanglin_demo");
		str.replace(1,2,"l");
		print(str.toString());
	}
	public static void method_update_2() {
		StringBuffer str = new StringBuffer("zhanglin_demo");
		str.setCharAt(3,'a');
		print(str.toString());
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}