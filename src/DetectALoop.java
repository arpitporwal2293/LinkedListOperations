
public class DetectALoop {

	public static boolean detectLoop(Node head){
		if(head==null){
			return false;
		}else{
			Node slow = head;
			Node fast = head.next;
			while(slow!=null && fast!=null && fast.next!=null){
				if(slow==fast){
					return true;
				}
				slow = slow.next;
				fast = fast.next.next;
			}
			return false;
		}
	}
	
	
	public static Node breakLoop(Node head){
		if(head==null){
			return head;
		}else{
			boolean flag = false;
			Node slow = head;
			Node fast = head.next;
			while(slow!=null && fast!=null && fast.next!=null){
				if(slow==fast){
					flag = true;
					break;
				}
				slow = slow.next;
				fast = fast.next.next;
			}
			
			if(flag){
				slow = head;
				fast = fast.next;
				while(slow.next!=fast.next){
					slow = slow.next;
					fast = fast.next;
				}
				fast.next = null;
			}
			
			return head;
			
		}
	}

}
