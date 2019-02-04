package geeks.day6.linklist;

public class LinkedList {

	private Node head;

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public boolean insertNode(LinkedList list, int data) {

		return false;
	}
	
	public boolean deleteNode(LinkedList list, int node) {
		return false;
	}
	
    Node deleteNode(Node head, int x)
    {
        if(head == null){
            return null;
        }
        Node current = head;
        Node previous = head;
	    while(current.data != x){
            previous = current;
            current = current.next;	  
	    }
	    if(previous.data == current.data)
	        return head.next;
	    previous.next = current.next;
	    return head;
    }

	public void traverse(LinkedList list) {
		Node currentNode = list.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
		}
	}

	public static void main(String[] args) {

	}

}
