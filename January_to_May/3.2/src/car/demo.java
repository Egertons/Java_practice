package car;
/*
 * 对于Eclipse的习惯性测试。
 * */
public class demo {
	public static void main(String[] args){
		System.out.println("\nHello World");
		Tool hh = Tool.show(); 
		hh.print("zhanglin", 20);
	}

}

class Tool
{
	Tool(){}
	private static Tool lianxi = new Tool();
	public static Tool show() {
		return lianxi;
	}
	private String name;
	private int num;
	public void print(String name,int num) {
		this.name = name;
		this.num = num;
		System.out.println("\n"+name+"  "+num);
	}
}
