
public class RemoveDuplicateElementsInSortedList {

	public static Node removeDuplicate(Node head){
		if(head==null)
			return head;
		else{
			Node prev = head;
			Node temp = head.next;
			while(temp!=null){
				if(prev.data == temp.data){
					prev.next = temp.next;
					temp = temp.next;
				}else{
					prev = prev.next;
					temp = temp.next;
				}
			}
			return head;
		}
	}

}
