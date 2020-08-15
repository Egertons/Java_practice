package newKnowledge;
/*
 * 当程序中的代码体量过大，而且该业务需求还需要某几个模块同时运行时。
 * 就需要将程序代码分成几个不同的部分，单独封装成线程。用多线程的思想来实现。
 * 
 * 在主函数中用多线程的思想进行封装，几种常见的封装形式。
 * */
public class ThreadTest_demo {
	public static void main(String[] args) {
		new Thread(){
			public void run() {
				for(int x = 1;x<55;x++) {
					System.out.println("\nHello World!\t"+x);
				}
			}
		}.start();
		
		/*
		 * 现在程序中其实已经有三个线程在运行了，那两个被线程类封装之后，
		 * 剩下的这个自然主线程就可以跑起来了。
		 * */
		for(int x = 1;x<55;x++) {
			System.out.println("\nHello Java!\t"+x);
		}
		
		Runnable r = new Runnable() {
			public void run() {
				for(int x = 1;x<55;x++) {
					System.out.println("\nHello DaLian!\t"+x);
				}
			}
		};
		new Thread(r).start();
	}
}