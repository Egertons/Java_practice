package newkno;
/*
�����������Ͷ����װ�ࣺ
���ڻ����������ͣ������кܶ���ݵĶ�����
Java����ͳһ��װ����������Ļ����������С�
�磺
	byte	Byte
	short	short
	int		Integer
	long	Long
	boolean	Boolean
	float	Float
	double	Double
	char	Character


�����������Ͷ����װ�������Ӧ�ó�������
����������������ַ���֮�����໥ת����

������������ת�ַ�����
	1.������������+""
	2.������������.toString(������������ֵ);
		�磺Integer.toString(34);//��34ת���ַ���"34"��

�ַ���ת�����������ͣ�
	1.static int parseInt(String s)     //��IntegerΪ�����������������Դ����ơ�
		���ַ�����������Ϊ�����ŵ�ʮ����������  
 * */
public class Integer_demo {
	public static void main(String[] args) {
		//������Ϊ��
		print("���ε����ֵΪ��"+Integer.MAX_VALUE);
		int num = Integer.parseInt("123");
		print("num = "+(num+4));
		
		print(Integer.toBinaryString(6));//�������η�װ�෽��ʵ�֡�����ת�������ܡ�
		int x = Integer.parseInt("110",2);//���η�װ���е����з�����
		print("x = "+x);
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}