package first;
/*
 * ���ڵ������ģʽ�ڶ��߳��е�Ӧ�á�
 * 
 * ��Ҫ��Ϊ����ʽ������ʽ��
 * */
public class demo {

	public static void main(String[] args) {
		System.out.println("\n\tHello World!!!");

	}

}
//����ʽ��
class a{
	private static final a a = new a();
	private a(){}
	public static a getclass() {
		return a;
	}
}

//����ʽ��
class b{
	private static b demo = null;
	private b() {
		
	}
	public static /*synchronized*/ b getclass() {  //��������Ƕ��߳�ͬʱ���ݵĻ�������ְ�ȫ�������ʶ�������ͬʱЧ�ʽϵ͡�
		//��ȷ�����ǣ�
		if(demo==null) {     //��˫���жϵ���ʽ�����������ʽ��Ч�����⡣
			synchronized (b.class) {
				if(demo==null) {   //�ӳټ���
					demo = new b();
				}
			}
		}
		return demo;
	}
}