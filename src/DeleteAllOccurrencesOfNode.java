
public class DeleteAllOccurrencesOfNode {
	
	public static Node deleteAll(Node head, int data){
		if(head==null){
			return head;
		}else{
			if(head.data==data){
				head = head.next;
			}
			if(head!=null){
				Node prev = new Node();
				prev = head;
				Node temp = new Node();
				temp = head.next;
				Node node = new Node();
				while(temp!=null){
					if(temp.data==data){
						node = temp.next;
						prev.next = node;
					}else
						prev = prev.next;
					temp = temp.next;
				}
			}
			return head;
		}
	}

}
