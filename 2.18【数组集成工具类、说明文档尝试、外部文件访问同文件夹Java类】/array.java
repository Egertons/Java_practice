public class array
{
	public static void main(String[] args)
	{
		int[] arr = {88,76,98,1,43,21};

		ArrayTool.print(ArrayTool.getMax(arr));
		
		ArrayTool.selectSort(arr);
		
		ArrayTool.printarray(arr);
	
	}
}
/*
1.如何在默认文件夹内或者当前目录中目标类或需引用类已经被编译为class字节码文件。
		那么在这个文件夹中的其他文件就不需要在写这部分代码，直接写类创建对象就可以了。
		
2.对于函数中嵌套函数的情况，#此处类型不能为空#，指的是嵌套内函数的返回值类型和外部函数的传参值不匹配。
		而且你还不能随便更改嵌套内函数的返回值类型，因为有可能把void改成目标返回值后反倒没有return了。
*/