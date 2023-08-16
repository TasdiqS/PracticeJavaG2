package multiThreading;

class Printer implements Runnable {
	int counter = 1;

	synchronized void printerM(int num) {
		System.out.println(Thread.currentThread().getName()+" "+ counter++);
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			printerM();
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {

		Printer evenObj = new Printer(5);
		Printer oddObj = new Printer(6);
		
		Thread even = new Thread(evenObj);
		Thread odd = new Thread(oddObj);
		
		even.start();
		odd.start();
	}

}
