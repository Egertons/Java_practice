package ¸´Ï°;

public class demo {
	public static void main(String[] args) {
		h a = new h();
		new Thread(a).start();
	}
}


class h implements Runnable
{
	public void run() {
		System.out.println("\ndemo");
	}
}