
public class Operations {

	public static Node createALinkedList(){
		Node head = Node.addNode(null, 1);
		head = Node.addNode(head, 5);
		head = Node.addNode(head, 6);
		head = Node.addNode(head, 5);
		head = Node.addNode(head, 2);
		head = Node.addNode(head, 5);
		head = Node.addNode(head, 4);
		head = Node.addNode(head, 5);
		head = Node.addNode(head, 9);
		return head;
	}
	
	public static Node createALoopedLinkedList(){
		Node head = Node.addNode(1);
		head.next = Node.addNode(2);
		head.next.next = Node.addNode(3);
		head.next.next.next = Node.addNode(4);
		head.next.next.next.next = Node.addNode(5);
		head.next.next.next.next.next = Node.addNode(6);
		head.next.next.next.next.next.next = Node.addNode(2);
		head.next.next.next.next.next.next.next = Node.addNode(8);
		head.next.next.next.next.next.next.next.next = Node.addNode(9);
		head.next.next.next.next.next.next.next.next.next = Node.addNode(2);
		head.next.next.next.next.next.next.next.next.next.next = Node.addNode(11);
		head.next.next.next.next.next.next.next.next.next.next.next = head.next.next.next.next.next.next.next;
		return head;
	}
	
	public static void checkForLoop(Node head){
		System.out.println(DetectALoop.detectLoop(head));
	}
	
	public static Node breakLoop(Node head){
		return DetectALoop.breakLoop(head);
	}
	
	public static void printLinkedList(Node head){
		Node.printList(head);
	}
	
	public static Node delNode(Node head, int data){
		return Node.deleteNode(head, 9);
	}
	
	public static Node delAllNodes(Node head,int data){
		return DeleteAllOccurrencesOfNode.deleteAll(head, 2);
	}
	
	public static void printMidElement(Node head){
		System.out.println(MiddleElement.findMid(head));
	}
	
	public static Node mergeTwoSortedLinkedList(){
		Node a = Node.addNode(null, 2);
		a = Node.addNode(a, 5);
		a = Node.addNode(a, 8);
		a = Node.addNode(a, 9);
		
		Node b = Node.addNode(null, 1);
		b = Node.addNode(b, 4);
		b = Node.addNode(b, 8);
		b = Node.addNode(b, 10);
		b = Node.addNode(b, 12);
		
		return MergeTwoSortedList.mergeTwoSortedList(a, b);
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
