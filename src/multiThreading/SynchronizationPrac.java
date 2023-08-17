package multiThreading;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class SynchronizationPrac {

	public static void main(String[] args) {
		Counter counterObj = new Counter();

		Runnable a = () -> {
			for (int i = 0; i < 1000; i++) {
				counterObj.increment();
			}
		};

		Runnable b = () -> {
			for (int i = 0; i < 1000; i++) {
				counterObj.increment();
			}
		};

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();
		
		/*join() method will tell the main thread to wait till 
		  t1 and t2 complete their task and join back and then proceed
		  with other task in this case printing counterObj.count*/
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(counterObj.count);

	}

}
