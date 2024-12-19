public class Node {
	int data = 4;
	Node nextNode;

	public Node(int val) {
		this.data = val;
	}
	public static void main(String[] args) {
		final Node p = new Node(8);
		Node q = new Node(16);
		p.nextNode = q;
		q = modifyIt(p, q);
		System.out.println(p.nextNode.data+" "+ q.nextNode.data);
	}
	public static Node modifyIt(final Node x, final Node y) {
		x.nextNode = y. nextNode;
		return x;
	}
}