public class demo 
/*
Object�ࣺΪ��㼶�ṹ�ĸ��ࡣ
					Ϊ���ж����ֱ���ֻ��Ǽ�Ӹ��ࡣ
					
					�����ж���������ж��󶼾߱��Ĺ��ܡ�
*/
{
	public static void main(String[] args)
	{
		/*
		hh e = new hh();
		hh j = new hh();
		
		System.out.println(e.equals(j));  //�ؽ��������󣬲��Ƚ������Ƿ���ͬ��
		//�䱾�ʱȽϵ��ǵ�ֵַ��ֻҪ���Ƿ���������ͬ�Ķ��ڴ��ֵַ����һ����ͬ��
		
		//������ôд~
		hh i = e;
		System.out.println(i.equals(e));//����ܷ���true~
		*/
		hh first = new hh(9);
		hh second = new hh(55);
		person j = new person();  //�����������
		System.out.println(first.equals(j));
	}
}

/*
Java��Ϊ�����ж��󶼾��бȽ��ԣ������Ա��Ƚ���������Ķ����Ƿ���ͬ��
				��ô����Ȼ�����ж���Ҫ�߱������ԣ���ȻҪ�����ڳ��ࣨObject�ࣩ�С�
							��������  equals(Object obj)    ָʾ����ĳ�������Ƿ���˶�����ȡ�  ����Ҳͬʱ�����˶�̬��˼�롣
*/

class hh extends Object   //Ĭ�������඼�̳�Object��Ϊ���ࡣ
{
	private int num;
	hh(int num)
	{
		this.num = num;
	}
	/*
			Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����
			����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ���û�б�Ҫ���¶��塣
			ֻҪ��Ϯ�����еĹ��ܣ���д�䷽�����ɡ�
					PS��������ǰ�ıȽϹ���ֻ�ǱȽϵ�ֵַ���൱�ļ��ߣ�
	*/
	public boolean equals(Object c)   //�������д��Object  ��Ϊ��Ҫ��д���Խ������ͱ�����ͬ����Ȼ�ͳ���������~
	{
		if(c instanceof hh)   //�����ж�  ��ֹ��ʲô���߰�����඼���ﴫ
		{
			hh d = (hh)c;   //��̬�ľ�����ʽ   ��������ָ���������   ��Ҫ������������Ե�ʱ�򡪡�����ת�͡�
			return this.num == d.num;
		}
		else
		{
			return false;
		}
	}
}

class person
{
	
}