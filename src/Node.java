
public class Node {

	int data;
	Node next;
	
	public static void printList(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node addNode(Node node,int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(node!=null){
			Node temp = node;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = newNode;
		}else{
			return newNode;
		}
		return node;
	}
	
	public static Node addNode(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		return newNode;
	}
	
	public static Node deleteNode(Node node,int data){
		if(node==null){
			System.out.println("List is empty!");
			return null;
		}else{
			if(node.data == data){
				return node.next;
			}
			Node temp = new Node();
			temp = node.next;
			Node prev = new Node();
			prev = node;
			while(temp!=null){
				if(temp.data==data){
					break;
				}
				prev = prev.next;
				temp = temp.next;
			}
			prev.next = temp.next;
			temp =null;
			return node;
		}
	}
}
