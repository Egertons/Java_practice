package first;

public class test {

	public static void main(String[] args) {
		Thread a1 = new Thread(new demo(true));
		Thread a2 = new Thread(new demo(false));
		
		a1.start();
		a2.start();
	}

}


class demo implements Runnable{
	private boolean flag;
	demo(boolean flag){
		this.flag=flag;
	}
	public void run() {
		if(flag) {
			synchronized (lock.obja) {
				System.out.println("if.locka");
				synchronized (lock.objb) {
					System.out.println("if.lockb");
				}
			}
		}else {
			synchronized (lock.objb) {
				System.out.println("else.lockb");
				synchronized (lock.obja) {
					System.out.println("else.locka");
				}
			}
		}
	}
}

class lock{
	static Object obja = new Object();
	static Object objb = new Object();
}