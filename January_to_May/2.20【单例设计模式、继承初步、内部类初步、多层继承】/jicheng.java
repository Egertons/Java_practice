/*
继承：
1.提高了代码的复用性。
2.让类与类之间产生了关系，有了这层关系，才有了多态的特性。

千万不要为了获取其他类的功能，简化代码而继承。
必须是类与类之间有  所属关系  才可以继承。

*/
class jicheng   //父类  又称  超类
{
	String name;
	int age;
}


//子类
class student  extends jicheng  //继承
{
	void study()
	{
		System.out.println("good study");
	}
}



//子类
class worker  extends jicheng  //继承
{
	void work()
	{
		System.out.println("good work");
	}
}
