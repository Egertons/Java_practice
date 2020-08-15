package first;
/*
 * 关于单例设计模式在多线程中的应用。
 * 
 * 主要分为饿汉式、懒汉式。
 * */
public class demo {

	public static void main(String[] args) {
		System.out.println("\n\tHello World!!!");

	}

}
//饿汉式：
class a{
	private static final a a = new a();
	private a(){}
	public static a getclass() {
		return a;
	}
}

//懒汉式：
class b{
	private static b demo = null;
	private b() {
		
	}
	public static /*synchronized*/ b getclass() {  //这里如果是多线程同时操纵的话，会出现安全隐患，故而加锁。同时效率较低。
		//正确做法是：
		if(demo==null) {     //用双重判断的形式，来解决懒汉式的效率问题。
			synchronized (b.class) {
				if(demo==null) {   //延迟加载
					demo = new b();
				}
			}
		}
		return demo;
	}
}