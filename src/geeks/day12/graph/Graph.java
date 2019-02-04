package geeks.day12.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	int vertex;
	LinkedList<Integer> adjList[];

	Graph(int vertex) {
		this.vertex = vertex;
		adjList = new LinkedList[vertex];

		for (int i = 0; i < adjList.length; i++)
			adjList[i] = new LinkedList<Integer>();
	}

	void addEdge(int start, int dest) {
		adjList[start].add(dest);
		adjList[dest].add(start);
	}

	public static Graph populateGraph() {
		Graph graph = new Graph(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		return graph;
	}

	public void printBFS(int root) {
		System.out.print("Breadth first Traversal of tree - ");
		int data, elem;
		boolean visitedArr[] = new boolean[vertex];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(root);
		visitedArr[root] = true;

		Iterator<Integer> itr;
		while (!queue.isEmpty()) {
			data = queue.poll();
			System.out.print(data + " ");
			itr = adjList[data].iterator();
			while (itr.hasNext()) {
				elem = itr.next();
				if (!visitedArr[elem]) {
					queue.add(elem);
					visitedArr[elem] = true;
				}
			}
		}
		System.out.print("\n");
	}

	public void printDFS(int root, boolean visitedArr[]) {

		if (!visitedArr[root]) {
			System.out.print(root + " ");
			visitedArr[root] = true;
		}
		Iterator<Integer> it = adjList[root].iterator();
		while (it.hasNext()) {
			int elem = it.next();
			if (!visitedArr[elem]) {
				printDFS(elem, visitedArr);
			}
		}
		// Condition to ensure that disconnected graphs are covered.
		for (int i = 0; i < adjList.length; i++) {
			if (!visitedArr[i])
				printDFS(i, visitedArr);
		}
	}

	public static void main(String[] args) {
		Graph graph = populateGraph();
		graph.printBFS(0);
		boolean visitedArr[] = new boolean[graph.vertex];
		System.out.print("Depth first Traversal of tree - ");
		graph.printDFS(4, visitedArr);
	}
}
