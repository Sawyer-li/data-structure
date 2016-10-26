package µ¥Á´±í;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node a = new Node(null,88);
			Node b = new Node(null,99);
			Node c = new Node(null,100);
			Node d = new Node(null,5);
			Node e = new Node(null,6);
			LinkList lk =new LinkList();
			
			lk.addFirstNode(17);
			lk.add(17, a);
			lk.add(88, b);
			lk.add(99, c);
			lk.add(100, d);
			lk.add(5, e);
			lk.look(100 );
	}
}
