package datastruc;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

public class SetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		LinkedList<E>

		// Adding elements to the PriorityQueue
		priorityQueue.add(5);
		priorityQueue.add(2);
		priorityQueue.add(8);
		priorityQueue.add(1);
		priorityQueue.add(9);
		priorityQueue.add(3);

		// Removing and printing elements
		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll()); // Retrieves and removes the highest priority element
		}
	}
}
