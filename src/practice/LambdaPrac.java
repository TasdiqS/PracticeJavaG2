package practice;

import java.util.function.BiConsumer;

interface printable {
	void print();
}

class Cat implements printable {

	@Override
	public void print() {
		System.out.println("meow");
	}
}

public class LambdaPrac {

	public static void main(String[] args) {
		Cat cat = new Cat();
		printThing(cat);
	}

	static void printThing(printable p) {
		p.print();
	}
}
