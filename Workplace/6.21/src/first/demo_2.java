package first;

public class demo_2 {

	public static void main(String[] args) {
		String a = "zhanglin";
		System.out.printf("%s",a);
	}
}
class TestPrintf{

public static void main(String[] args)
{
//����һЩ������������ʽ�������
double d = 345.678;
String s = "��ã�";
int i = 1234;
//"%"��ʾ���и�ʽ�������"%"֮�������Ϊ��ʽ�Ķ��塣
System.out.printf("%f",d);//"f"��ʾ��ʽ�������������
System.out.println();
System.out.printf("%9.2f",d);//"9.2"�е�9��ʾ����ĳ��ȣ�2��ʾС������λ����
System.out.println();
System.out.printf("%+9.2f",d);//"+"��ʾ��������������š�
System.out.println();
System.out.printf("%-9.4f",d);//"-"��ʾ�����������루Ĭ��Ϊ�Ҷ��룩��
System.out.println();
System.out.printf("%+-9.3f",d);//"+-"��ʾ���������������������롣
System.out.println();
System.out.printf("%d",i);//"d"��ʾ���ʮ����������
System.out.println();
System.out.printf("%o",i);//"o"��ʾ����˽���������
System.out.println();
System.out.printf("%x",i);//"d"��ʾ���ʮ������������
System.out.println();
System.out.printf("%#x",i);//"d"��ʾ�������ʮ�����Ʊ�־��������
System.out.println();
System.out.printf("%s",s);//"d"��ʾ����ַ�����
System.out.println();
System.out.printf("���һ����������%f��һ��������%d��һ���ַ�����%s",d,i,s);
//����������������ע��˳��
System.out.println();
System.out.printf("�ַ�����%2$s��%1$d��ʮ����������%1$#x",i,s);
//"X$"��ʾ�ڼ���������
}
}