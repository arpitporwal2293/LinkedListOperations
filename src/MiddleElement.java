
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
	
}
