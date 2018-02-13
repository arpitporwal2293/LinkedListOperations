
public class Operations {

	public static void main(String[] args) {
		Node head = Node.addNode(2);
		head.next = Node.addNode(10);
		head.next.next = Node.addNode(20);
		head.next.next.next = Node.addNode(3);
		head.next.next.next.next = Node.addNode(2);
		head.next.next.next.next.next = Node.addNode(5);
		head.next.next.next.next.next.next = Node.addNode(4);
		head.next.next.next.next.next.next.next = Node.addNode(2);
		head.next.next.next.next.next.next.next.next = Node.addNode(10);
		head.next.next.next.next.next.next.next.next = Node.addNode(12);
		head.next.next.next.next.next.next.next.next = Node.addNode(14);
		head.next.next.next.next.next.next.next.next.next = Node.addNode(18);
		Node.printList(head);
		head = Node.deleteNode(head, 10);
		head = DeleteAllOccurrencesOfNode.deleteAll(head, 2);
		Node.printList(head);
		System.out.println(MiddleElement.findMid(head));
	}
	
}
