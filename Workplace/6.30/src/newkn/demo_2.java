package newkn;
/*
4���滻
	4.1�滻ָ���ַ���
		String replace(char oldChar, char newChar) 
			���ش��滻���г��ֵĵ���һ���ַ��� oldChar�ڴ��ַ��� newChar ��
	4.2�滻ָ���ַ�����
	  	String replace(CharSequence target, CharSequence replacement) 
			��������Ŀ������ƥ����ַ�����ÿ�����ַ����滻Ϊָ���������滻���С� 
5���и�
 	5.1�и��ַ���
 		String[] split(String regex) 
			�����ַ����ָ�Ϊ������ regular expression��ƥ�䡣  
6���Ӵ�
	6.1��ȡ�ַ����е�һ����
		String substring(int beginIndex) 
			����һ���ַ��������ַ����Ǵ��ַ��������ַ�����  
		String substring(int beginIndex, int endIndex) 
			����һ���ַ��������ַ����Ǵ��ַ��������ַ�����  
 * */
public class demo_2 {
	public static void main(String[] args) {
		//tihuan_demo();
		//tihuan_demo2();
		//q();
		//h();
	}
	public static void h() {
		String p = "zhanglin";
		print(p.substring(2));//��ָ��λ�ÿ�ʼ����β��
		//����ַ���ʶ�����ڣ���ᱬ���ַ����Ǳ�Խ���쳣��
		
		print(p.substring(2,4));//��ָ��λ�ÿ�ʼ��ָ��λ�ý�����������ͷ����������β����
		//��������ʽ��Ҫ��ӡ�����ַ����Ļ���p.substring(0,p.length);
	}
	public static void q() {
		String b = "zhangsan,wangwu,lisi";
		String[] arr = b.split(",");
		for(int a = 0;a<arr.length;a++) {
			print(arr[a]);
		}
	}
	public static void tihuan_demo() {
		String k = "hnllo Java";
		String l = k.replace('n','e');
		print(k);//������Ҫע����ǣ��ַ��������ԣ�����һ������ʼ���ɹ��Ͳ��ᱻ�ٴθı䡣
		//���Կ���˵�����㣺1�������ӡ��k�ַ�����Ȼ��ԭ�ַ�����
		//2������֤������replace�������븳��һ���µ��ַ������䲻�ܸı�ԭ����
		print(l);
	}
	public static void tihuan_demo2(){
		String p = "hallo Java";
		String i = p.replace("Java","Python");
		print(i);
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}