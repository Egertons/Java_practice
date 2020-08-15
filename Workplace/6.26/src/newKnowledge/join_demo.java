package newKnowledge;
/*
 * join方法解析：
 * 以当前代码为例，当主线程执行到join方式时，现在a1线程已经被开启了，
 * 无论a1线程执行到了哪，只要主线程能够读到join语句，说明现在的CPU执行权就已经被主线程抢走了
 * join方法的通俗解释是，硬性抢夺CPU执行权，故而现在主函数放弃执行权（进入冻结状态）
 * 自然a2线程也不会开启，因为压根儿还没读到a2.start();呢
 * 所以现在只有a1线程拥有CPU的执行权，当a1线程执行完全部代码后，主线程才会解冻，继续执行剩余代码。
 * 
 * 
 * 另：如a1.join()语句的意义其实只是让“主函数”来释放了CPU的执行权，
 * 如果现在把a1.join() 放到 a2.start()后面的话，现在其实是a1和a2两个线程共同享有CPU的执行权
 * 但主线程只有当a1线程执行完代码后才会解冻。
 * */
public class join_demo {
	public static void main(String[] args) throws InterruptedException {
		demo d = new demo();
		Thread a1 = new Thread(d);
		Thread a2 = new Thread(d);
		
		a1.start();
		
		a1.join();//join的通俗理解含义：强制抢夺CPU执行权。
		
		a2.start();
		for(int a = 1;a<80;a++) {
			System.out.println("main\t"+a);
		}
		System.out.println("over");
	}
}
class demo implements Runnable{
	public void run() {
		for(int x = 0;x<70;x++) {
			System.out.println(Thread.currentThread().getName()+"…………"+x);
		}
	}
}