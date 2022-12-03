
public class BuildDLL {
	
	DoubleLinkedNode<Character> front, rear;
	private static char[] letters = new char[] {'K', 'T', 'E', 'N', 'P', 'A', 'L'};

	public BuildDLL () {
		build();
	}
	
	

	public void remove (Character elem) {
		
		// curr is the first element
		DoubleLinkedNode<Character> curr = front;
		// tail is the last element
		DoubleLinkedNode<Character> tail = rear;
		
		
		// If first element (head)
		if (curr.getElement() == elem) {
			// System.out.println(curr.getElement() + "first");
			DoubleLinkedNode<Character> node = curr.getNext();
			node.setPrevious(null);
			// Set the front to the new node
			front = node;
			curr.setNext(null);
		}
		
		// If last element
		else if (tail.getElement() == elem) {
			DoubleLinkedNode<Character> newTail = tail.getPrevious();
			// Remove the last element by setting the new tail's next to null
			newTail.setNext(null);
		}
		
		// If in the middle somewhere
		else {
			// Loop through the doubly linked list elements until the end
			while (curr != null) {
				// When the middle element is found
				if (curr.getElement() == elem) {
					// Get previous node and next node
					DoubleLinkedNode<Character> pnode = curr.getPrevious();
					DoubleLinkedNode<Character> node = curr.getNext();
					// Get rid of the current node
					pnode.setNext(node);
					node.setPrevious(pnode);
					curr.setNext(null);
					curr.setPrevious(null);
					// Break the loop
					break;
				}
				// Loop until finding the element
				else {
					curr = curr.getNext();
				}
			}
		}
	}
	
	
	private void build () {
		DoubleLinkedNode<Character> pnode, node;
		
		node = new DoubleLinkedNode<Character>(letters[0]);
		pnode = front = node;
		for (int i = 1; i < 7; i++) {
			node = new DoubleLinkedNode<Character>(letters[i]);
			pnode.setNext(node);
			node.setPrevious(pnode);
			pnode = node;
		}
		rear = node;
	}
	
	public DoubleLinkedNode<Character> getFront () {
		return front;
	}
	
	public DoubleLinkedNode<Character> getRear () {
		return rear;
	}
	
	public void printF (DoubleLinkedNode<Character> node) {
		
		DoubleLinkedNode<Character> curr = front;
		while (curr != null) {
			System.out.print(curr.getElement() + " ");
			curr = curr.getNext();
		}
		System.out.print("\n");
	}
	
	
	public static void main (String[] args) {
		BuildDLL dll = new BuildDLL();

		System.out.println("Original List:");
		dll.printF(dll.getFront());
		System.out.println("***");
		
		System.out.println("Removing an internal node:");
		dll.remove('N');
		dll.printF(dll.getFront());
		System.out.println("***");
		
		System.out.println("Removing the front node:");
		dll.remove('K');
		dll.printF(dll.getFront());
		System.out.println("***");
		
		System.out.println("Removing the rear node:");
		dll.remove('L');
		dll.printF(dll.getFront());
		System.out.println("***");
	}

}
