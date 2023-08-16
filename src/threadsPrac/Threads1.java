package threadsPrac;

public class Threads1 {

	public static void main(String[] args) {
		// A a = new A();

		Runnable a = () -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		// B b = new B();
		Runnable b = () -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(a);
		Thread t1 =new Thread(b);
		
		t.start();
		t1.start();
	}

}

/*
 * class A extends Thread { public void run() { for (int i = 0; i < 10; i++) {
 * System.out.println("Hi"); try { Thread.sleep(100); } catch
 * (InterruptedException e) { e.printStackTrace(); } } } }
 */

/*
 * class B implements Runnable{ public void run() { for (int i = 0; i < 10; i++)
 * { System.out.println("Hello"); try { Thread.sleep(100); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } } } }
 */
