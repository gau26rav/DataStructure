package geeks.day13.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {
	int size;
	int arr[] = new int[10];

	Heap(int size, int[] arr) {
		this.arr = arr;
		this.size = size;
	}

	Heap(int size) {
		this.size = size;
	}

	public void ensureSize() {
		if (this.size >= arr.length)
			this.arr = Arrays.copyOf(arr, size * 2);
	}

	public void swap(int index1, int index2) {
		int temp = this.arr[index1];
		this.arr[index1] = this.arr[index2];
		this.arr[index2] = temp;
	}

	public int getParent(int i) {
		return (i - 1) / 2;
	}

	public int getLChild(int i) {
		return 2 * i + 1;
	}

	public int getRChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int elem) {
		ensureSize();

		arr[size] = elem;
		heapifyUp(size);
		size = size + 1;
	}

	private void heapifyUp(int size2) {
		int parent = arr[getParent(size2)];
		if (parent > arr[size2]) {
			swap(getParent(size2), size2);
			heapifyUp(getParent(size2));
		}
	}

	public int delete(int index) {
		int deletedElem = this.arr[index];
		size = size - 1;
		arr[index] = arr[size];
		heapifyDown(index);
		System.out.println("\nAfter Deletion -");
		printHeap();
		return deletedElem;
	}

	public static Heap populateHeap() {
		Heap heap = new Heap(0);
		heap.insert(10);
		heap.insert(9);
		heap.insert(8);
		heap.insert(6);
		heap.insert(4);
		heap.insert(2);
		heap.insert(3);
		return heap;
	}

	public int extractMin() {
		int min = this.arr[0];

		size = size - 1;
		arr[0] = arr[size];
		heapifyDown(0);

		return min;
	}

	private void heapifyDown(int index) {
		int elem = arr[index];
		int lindex = getLChild(index);
		int rindex = getRChild(index);
		if (lindex > size || rindex > size)
			return;
		int lchild = arr[lindex];
		int rchild = arr[rindex];

		int swapChild = Math.min(lchild, rchild);
		int swapIndex = swapChild == lchild ? lindex : rindex;

		if (elem > swapChild) {
			swap(index, swapIndex);
			heapifyDown(swapIndex);
		}
	}
	
	/**
	 * It will empty the entire heap and for further insertion we need to recreate the heap
	 */
	public void heapSort() {
		System.out.println("\nHeap Sort - ");
		while (size > 0)
			System.out.print(" " + extractMin());
	}

	/**
	 * It is important to print the heap till size only.
	 * else the 
	 */
	public void printHeap() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Heap heap = Heap.populateHeap();
		System.out.println("Before - ");
		heap.printHeap();
/*		System.out.println("\nMin Element " + heap.extractMin());
		System.out.println("\nAfter- ");
		heap.printHeap();*/
		//heap.delete(2);
		System.out.println("\nPriority queue- ");
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(9);
		queue.add(8);
		queue.add(6);
		queue.add(4);
		queue.add(2);
		queue.add(3);
		for(int val: queue) {
			System.out.print(val+ " ");
		}
		System.out.println("Min Value = "+queue.poll() + " \n");
		for(int val: queue) {
			System.out.print(val+ " ");
		}
	}
}
