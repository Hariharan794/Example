package PartialAbstraction;

public class server2 implements server1 {

	@Override
	public void privacy() {
		System.out.println("it's very beautifully");
	}

	@Override
	public void chats() {
		System.out.println("He are greatest Aritst ");
	}

	@Override
	public void DM() {
		System.out.println("Highest Mountain in peak");
	}
	public static void main(String[] args) {
		server2 s2 = new server2();
		s2.privacy();
		s2.chats();
		s2.DM();
	}

}
