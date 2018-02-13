
public class MergeTwoSortedList {

	public static Node mergeTwoSortedList(Node a,Node b){
		Node result = null;
		if(a==null)
			return b;
		if(b==null)
			return a;
		if(a.data<=b.data){
			result = a;
			result.next = mergeTwoSortedList(a.next, b);
		}else{
			result = b;
			result.next = mergeTwoSortedList(a, b.next);
		}
		return result;
			
	}
	
}
