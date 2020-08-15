package newKnowledge;

/*
 * 后台线程(守护线程)
 * 特点：该标记需在线程启动前标记完成。
 * 另外当该线程成为守护线程之后，如果被守护线程（通常是主线程抑或是依赖线程）结束任务（完成运算时）
 * 守护线程会自动的结束。
 */
public class setDaemon_demo {
	public static void main(String[] args) {
		a a = new a();
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(a);
		
		a1.setDaemon(true);
		a2.setDaemon(true);
		a1.start();
		a2.start();
	}
}
class a implements Runnable{
	public void run() {
		while(true) {
			System.out.println("\nHello World!"+"\t");
		}	
	}
}