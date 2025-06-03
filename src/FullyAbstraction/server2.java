package FullyAbstraction;

class server2 extends server {

	@Override
	void password() {
		System.out.println("13032003");
	}
	public static void main(String[] args) {
		server2 s = new server2();
		s.firstname();
		s.password();
		s.lastname();
	}
	

}
