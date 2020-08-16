/*
		向下转型经典示例：
				注:其中,为了保证向下转型的顺利完成,在java中提供了一个关键字:instanceof,
				通过instanceof可以判断某对象是否是某类的实例,如果是则返回true,否则为false,instanceof使用如下:
*/
class A 
{
         public void print() 
         {
                  System.out.println("A:print");
         }
}

class B extends A 
{
         public void print() 
         {        
                  System.out.println("B:print");
         }
         public void funcB()
         {
                  System.out.println("funcB");
         }
}

class C extends A 
{
         public void print() 
         {        
                  System.out.println("C:print");
         }
         public void funcC()
         {
                  System.out.println("funcC");
         }
}


//向下转型的标准示例；
public class text
{
         public static void func(A a)
         {
                  a.print();
                  if(a instanceof B)        //instanceof 用于判断该对象是否属于该类型，返回一个Boolean值，从而可以选择是否执行该类的特殊方法。
                  {
                          B b = (B)a;   //向下转型,通过父类实例化子类
                          b.funcB();    //调用B类独有的方法
                  }
                  else if(a instanceof C)
                  {
                          C c = (C)a;  //向下转型,通过父类实例化子类
                          c.funcC();   //调用C类独有的方法
                  }
         }

         public static void main(String args[])
         {
                  func(new A());
                  func(new B());
                  func(new C());
         }
}