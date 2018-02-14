
public class MergeSortLinkedList {

	//breaking the list
	public static Node mergeSort(Node head){
		if(head == null || head.next == null)
			return head;
		Node mid = MiddleElement.findMidNode(head);
		Node nextToMid = mid.next;
		mid.next = null;
		Node left = mergeSort(head);
		Node right = mergeSort(nextToMid);
		//same merge function as merging two sorted lists
		return MergeTwoSortedList.mergeTwoSortedList(left,right);
	}
	
}
