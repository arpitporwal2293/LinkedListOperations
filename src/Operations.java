
public class Operations {

	public static void main(String[] args) {
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
		System.out.println(DetectALoop.detectLoop(head));
		head = DetectALoop.breakLoop(head);
		System.out.println(DetectALoop.detectLoop(head));
		Node.printList(head);
		head = Node.deleteNode(head, 9);
		head = DeleteAllOccurrencesOfNode.deleteAll(head, 2);
		Node.printList(head);
		System.out.println(MiddleElement.findMid(head));
		
	}
	
}
