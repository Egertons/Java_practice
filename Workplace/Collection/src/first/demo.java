package first;

public class demo {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,7};
		for(int x :arr) {
			System.out.println(x);
		}
	}

}
enum Size {SMALL,MEDIUM,LARGE};//枚举是需要放到类的外面的！