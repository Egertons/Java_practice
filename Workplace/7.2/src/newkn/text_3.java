package newkn;
public class text_3 {
	public static void main(String[] args) {
		String k = "llzhanglinllhuangsitongllxuebowen";
		print("��ϰ���ⷨһ�����ַ����й���"+demo_1(k,"ll")+"��ll��");
		print("��ϰ���ⷨ�������ַ����й���"+demo_2(k,"ll")+"��ll��");
		//�����ֽⷨ��ʹ���и��ַ����ķ�ʽʵ�֣����ǣ���BUG��������ʹ�ã�
		print("count="+k.split("ll").length);
	}
	//��ϰ������ȡһ���ַ��Ӵ��ڸ��ַ����г��ֵĴ�����
	public static int demo_1(String str,String key){
		int count = 0;
		int a = 0;
		while((a=str.indexOf(key))!=-1){
			str = str.substring(a+key.length());
			count+=1;
		}
		return count;
	}
	//��ϰ�����ⷨ����
	public static int demo_2(String str,String key) {
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key,index))!=-1) {
			index+=key.length();
			count+=1;
		}
		return count;
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}