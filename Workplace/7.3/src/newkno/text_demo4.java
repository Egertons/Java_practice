package newkno;

public class text_demo4 {
	public static void main(String[] args) {
		String a = "basjsdashellohellodcabycv";
		String b = "askuhellohelloeycy";
		print(getMaxsubstring(a,b));
	}
	//��ϰ�ģ���ȡһ���ַ����������Ӵ���
	public static String getMaxsubstring(String a,String b) {
		int l1 = a.length();
		int l2 = b.length();
		String str_1,str_2;
		if(l1>l2) {
			str_2 = b;
			str_1 = a;
		}else {
			str_2 = a;
			str_1 = b;
		}
		for(int x = 0;x<str_2.length();x+=1) {
			for(int y = 0,z=str_2.length()-x;z!=str_2.length()+1;y++,z++) {
				String tmp = str_2.substring(y,z);
				if(str_1.contains(tmp)) {//if((str_1.indexOf(tmp))!=-1)
					return tmp;
				}
			}
		}
		return "  ��   ";
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}