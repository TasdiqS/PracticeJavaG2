package multiThreading;

class Printer implements Runnable {
	int counter = 1;

	synchronized void printerM(int num) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
		Thread.sleep(50);
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				printerM(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {

		Printer evenObj = new Printer();
		Printer oddObj = new Printer();

		Thread even = new Thread(evenObj);
		Thread odd = new Thread(oddObj);

		even.start();
		odd.start();
	}

}
