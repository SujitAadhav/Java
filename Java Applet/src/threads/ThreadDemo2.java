package threads;

public class ThreadDemo2 implements Runnable{
	public static void main(String[] args) {
		Thread th = new Thread(new ThreadDemo2(), "My Thread");
		th.start();
		System.out.println(th.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
