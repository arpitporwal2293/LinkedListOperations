
public class MiddleElement {

	public static int findMid(Node head){
		if(head==null){
			return 0;
		}else{
			Node slow = new Node();
			slow = head;
			Node fast = new Node();
			fast = head;
			while(slow!=null && fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;
		}
	}

	public static Node findMidNode(Node head){
		if(head==null){
			return head;
		}else{
			Node slow = new Node();
			slow = head;
			Node fast = new Node();
			fast = head.next;
			while(slow!=null && fast!=null && fast.next!=null){
				slow = slow.next;
				fast = fast.next;
				if(fast.next!=null)
					fast = fast.next;
			}
			return slow;
		}
	}

}
