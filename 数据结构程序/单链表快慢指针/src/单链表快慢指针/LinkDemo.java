package ���������ָ��;

public class LinkDemo {
	public LinkDemo next;
	public int data;
	public LinkDemo(LinkDemo next, int data) {
		this.next = next;
		this.data = data;
	}
	public LinkDemo(LinkDemo next) {
		this.next = next;
	}
}
