/*
		����Object�����е�  toString������   ��ϰ
					���ظö�����ַ�����ʾ
					
					Java��Ϊ���ж����ܱ�ת��Ϊ�ַ�����ӡ
							����ӡ����  �ö�����ڴ��ֵַ����ǰ��������    �м���@����    �����Ǹ�����ڴ��ֵַ�Ĺ�ϣֵ
*/
public class demo
{
	public static void main(String[] args)
	{
		jj h = new jj();
		System.out.println(h.toString());
		System.out.println(h.hashCode());   //����Object�����е�  hashCode()������   ��ϰ   ���ظö���Ĺ�ϣֵ��
		System.out.println(Integer.toHexString(h.hashCode()));   //��Ϊ��ֱͨ�ӵ��÷�������Ĺ�ϣֵ��ʮ���Ƶģ��������ʤ��顢��һ��ĵ��ù�ϣֵ�ĵط�������16���Ƶ��õģ��ʶ�Ҫת��һ�¡�
		System.out.println("-------------------------------------------------------");
		
		
		Class p = h.getClass();           //getClass()  �ǳ���Object�е�һ������ ���ж����ձ����ã����ɻ�ȡ�ö����class�ļ���
					//�ڱ�����Ϊ��ȡ���ö����class�ļ���  ��   ����һ��Class���͵���p  
 					
		System.out.println(p.getMethods());    //��ô����p   Ĭ�Ͼ߱�Class�е�һЩ����    ����ͨ���ֽ����ļ�����ȡ��Դ���ļ��еķ���������˽�з�����   //����������ۻ�����
		System.out.println(p.getName()+"@"+Integer.toHexString(h.hashCode()));    //ģ��toString()  ����  ͨ�������ķ�ʽʵ�֡�
	}
}

class jj extends Object
{
	
}


/*
		��Object��������Ԥ�ȶ������Щ����  
				���磺toString()  /   equals()  /  hashCode()    /  getClass()  �ȵ�
				��Ϊ���ʼҪ�������е��࣬�����Զ����ʱ���书�ܶ��Ƚ���������û��ʲô���塣
				
				��ʵ��ʹ�õ�ʱ�򣬣�һ�㶼�������д����Ӧ�µĹ��ܡ�
				
				PS:   �ںܶ���������������������    �ܶ඼����Щ������д��
*/