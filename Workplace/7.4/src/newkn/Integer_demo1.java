package newkn;

public class Integer_demo1 {
	public static void main(String[] args) {
		method_3();
	}
	public static void method_3() {
		Integer m = 128;
		Integer n = 128;
		print("m==n?\t"+(m==n));
		/*
		����Ϊfalse����������⣺
			m��n�ڳ�ʼ����ʱ���Ϊ������ͬ�Ķ���
			�ʶ��ڱȽϵ�ʱ���ڴ��ֵַָ��ͬ��
		 * */
		
		Integer a = 127;
		Integer b = 127;
		print("a==b?\t"+(a==b));
		/*
		����Ϊtrue����Ϊ�汾�����ԣ�
			JDK���°汾��Ϊ�˽�Լ�ڴ�ռ䣬
			����ֵ��byteȡֵ��Χ��ʱ�����������ԣ�����½���ֵ���ڴ����Ѿ�����
			JDK�Ͳ�����Ϊ��ֵ���ٿռ䣬���ǽ���ֱ��ָ��ԭ�ȵĵ�ֵַ��
		 * */
		
	}
	public static void method_2() {
		Integer x = 4;//�°汾�Ķ��巽ʽ��
		//�Զ�װ�䡣
		x+=2;//�Զ����䡣x�������Ȳ����int����������2����ֵ���������㡣
		//����ٽ�����װ�丳��X�����󣩡�
		
		/*
		��Ȼ�����ڻ����������ͷ�װ���е������Թ�Ȼ��һ���������ϵ�ȱ�ݡ�
		��ΪInteger x ��һ�������Ͷ�����ô�����ڲ������Ը�ֵΪ�������ݡ�
		�����Ը�ֵΪnull������
		������������£����Զ����䶯����ʱ��x.intValue()���ͻ���ֿ�ֵ�쳣��
		��Ҫע����������쳣��RunntimeException ֻҪ���ֳ���ͻ�ͣ����
		 * */
	}
	public static void method_1() {
		Integer a = new Integer(123);	
		Integer b = new Integer("123");
		print("a==b?   "+(a==b));//ԭ�������������󣬵�Ȼ����ͬ��
		print("a.equls(b)?    "+(a.equals(b)));//Integer�и�д�˳����е�equals����������Ƚϵ�������������ֵ�Ƕ��ϵĴ�С��
	}
	public static void print(Object obj) {
		System.out.println(obj);
	}
}